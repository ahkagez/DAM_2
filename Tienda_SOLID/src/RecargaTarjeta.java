public class RecargaTarjeta implements EstrategiaPago{
    @Override
    public double calcularImporte(Recibo recibo) {
        return recibo.getPrecioBase() * 1.03;
    }
}
