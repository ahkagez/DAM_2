public class RecargaMovil implements EstrategiaPago{
    @Override
    public double calcularImporte(Recibo recibo) {
        return recibo.getPrecioBase() * 1.05;
    }
}
