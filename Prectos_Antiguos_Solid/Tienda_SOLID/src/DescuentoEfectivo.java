public class DescuentoEfectivo implements EstrategiaPago{
    @Override
    public double calcularImporte(double precioBase) {
        double precio = precioBase * 0.95;
        if(precio < 0) precio = 0;

        return precioBase;
    }

    public String getTipo(){
        return "Descuento del 5%";
    }
}
