import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        RegistroEstrategia registroEstrategia = new RegistroEstrategia();

        registroEstrategia.registrar(BiciUrbana.class, new TarifaUrbana());
        registroEstrategia.registrar(BiciElectrica.class, new TarifaElectrica());
        registroEstrategia.registrar(BiciCarga.class, new TarifaCarga());

        Bicicleta bicicleta = new BiciElectrica("001", "Montanaa");

        ServicioViaje servicioViaje = new ServicioViaje(registroEstrategia);

        Viaje viaje1 = servicioViaje.iniciar(bicicleta, Collections.emptyList());


        Recibo recibo = servicioViaje.finalizar(viaje1);
        System.out.println(recibo.toString());
    }
}