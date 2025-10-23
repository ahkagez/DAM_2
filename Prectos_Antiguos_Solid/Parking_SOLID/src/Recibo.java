import java.util.UUID;

public class Recibo {
    private UUID id = UUID.randomUUID();
    private String producto;
    private int cantidad;
    private double precioBase;
    private String metodoPago;
    private String ajusteAplicado;
    private double TotalFinal;

    public Recibo(String producto, int cantidad, double precioBase, String metodoPago) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioBase = precioBase * cantidad;
        this.metodoPago = metodoPago;
    }

    public Recibo(String producto, int cantidad, double precioBase, String metodoPago, String ajusteAplicado, double totalFinal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.metodoPago = metodoPago;
        this.ajusteAplicado = ajusteAplicado;
        TotalFinal = totalFinal;
    }

    public UUID getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getAjusteAplicado() {
        return ajusteAplicado;
    }

    public double getTotalFinal() {
        return TotalFinal;
    }
}
