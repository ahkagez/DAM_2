public class Recibo {
    private int id;
    private String producto;
    private double precioBase;
    private MetodoPago metodoPago;
    private double TotalFinal;

    public Recibo(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
