import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioViaje {
    RegistroEstrategia registroEstrategia;
    GeneradorRecibo generadorRecibo;
    List<Viaje> viajes = new ArrayList<>();

    public ServicioViaje(RegistroEstrategia registroEstrategia) {
        this.registroEstrategia = registroEstrategia;
    }

    public Viaje iniciar(Bicicleta bicicleta, List<Extra> extras){
        if(bicicleta == null) throw new IllegalArgumentException();
        viajes.add(new Viaje(bicicleta, extras));

        return viajes.getLast();
    }

    public GeneradorRecibo finalizar(Viaje viaje){
        int index = this.viajes.indexOf(viaje);
        viajes.get(index).setFin(LocalDateTime.now());
        viajes.get(index).calcularDUracion();

        double total = viajes.get(index).getDuracion() * registroEstrategia.getTipo(viajes.get(index).getBicicleta()).calcularImporte();

        generadorRecibo = new GeneradorRecibo(
                viajes.get(index).getBicicleta().getTipo(),
                viajes.get(index).getBicicleta().getModelo(),
                viajes.get(index).getBicicleta().getID(),
                viajes.get(index).getInicio(),
                viajes.get(index).getFin(),
                viajes.get(index).getDuracion(),
                registroEstrategia.getTipo(viajes.get(index).getBicicleta()),
                viajes.get(index).getExtraList(),
                total
        );

        return generadorRecibo;
    }


}
