public abstract class Producto {
    private String nombre;
    private double PrecioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.PrecioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }
}
