public class PagoTarjeta implements MetodoPago{
    @Override
    public String getTipoPago() {
        return "Tarjeta";
    }
}
