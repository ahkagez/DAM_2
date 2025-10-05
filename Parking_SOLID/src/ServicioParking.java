import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioParking implements CalcularImporte{
    RegTarifa registroTarifa;
    List<Estancia> listaEstancia = new ArrayList<>();

    public ServicioParking(RegTarifa registroTarifa) {
        this.registroTarifa = registroTarifa;
    }





    public void altaVehiculo(Vehiculo vehiculo, LocalDateTime fechaEntrada){
        Estancia estancia = new Estancia(listaEstancia.size(), vehiculo, fechaEntrada);
        listaEstancia.add(estancia);
    }

    public Recibo bajaVehiculo(Vehiculo vehiculo, LocalDateTime hora){
        int index = -1;
        for (int i = 0; i < listaEstancia.size(); i++) {
            if (listaEstancia.get(i).getVehiculo().equals(vehiculo)) {
                index = i;
            }
        }

        listaEstancia.get(index).setFechaFinal(hora);


        double precioFinal = calcularImporte(listaEstancia.get(index).calcularDuracion(), registroTarifa.calcular(vehiculo));


        listaEstancia.remove(vehiculo);
        return new Recibo(vehiculo, precioFinal);
    }

    @Override
    public double calcularImporte(Long minutes, double precioHora) {
        double horas = minutes / 60;
        return precioHora * horas;
    }

    @Override
    public String toString() {
        return "ServicioParking{" +
                "registroTarifa=" + registroTarifa +
                ", listaEstancia=" + listaEstancia +
                '}';
    }


}