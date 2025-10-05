import java.time.LocalDateTime;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Class<? extends Vehiculo>, Estrategia> listaTarifas = Map.of(
                Coche.class, new Th_coche(),
                Moto.class,  new Th_moto(),
                Bicicleta.class,  new Th_bicicleta()
        );

        RegTarifa registroTarifa = new RegTarifa(listaTarifas);

        ServicioParking servicioParking = new ServicioParking(registroTarifa);

        Coche coche = new Coche("8475MDC", "BMW", "Blanco");

        LocalDateTime fechaEntrada = LocalDateTime.now();

        servicioParking.altaVehiculo(coche, fechaEntrada);

        LocalDateTime fechaSalida = LocalDateTime.of(2025, 10, 06, 10, 35);

        Recibo recibo = servicioParking.bajaVehiculo(coche, fechaSalida);

        System.out.println(recibo.imprimir());
    }
}