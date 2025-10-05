public class Recibo implements ImpresoraRecibo{
    private Vehiculo vehiculo;
    private double precio;

    public Recibo(Vehiculo vehiculo, double precio) {
        this.vehiculo = vehiculo;
        this.precio = precio;
    }





    // Implementamos interfaz para la impresion, el resto de atributos es por tener informacion sobre la factura
    @Override
    public String imprimir() {
        return "Coche: " + vehiculo + "\n"
                + "Precio por el estacionamiento: " + precio + "€";
    }
}
