import java.util.Map;

public class RegTarifa {
    private Map<Class<? extends Vehiculo>, Estrategia> tarifaVehiculos;

    public RegTarifa(Map<Class<? extends Vehiculo>, Estrategia> tarifaVehiculos) {
        this.tarifaVehiculos = tarifaVehiculos;
    }





    public double calcular(Vehiculo vehiculo){
        // Class<? extends Vehiculo> es para añadir cualquier clase que extienda de vehiculo, es solo eso
        // Inicializamos la lista de mapas clave valor en el main y aqui solo creamos un metodo para
        // que nos devuelva el importe del correspondiente
        return tarifaVehiculos.get(vehiculo.getClass()).calcularImporte();
    }
}
