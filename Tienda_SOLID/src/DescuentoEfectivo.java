public class DescuentoEfectivo implements EstrategiaPago{
    @Override
    public double calcularImporte(Recibo recibo) {
        return recibo.getPrecioBase() * 0.95;
    }
}
