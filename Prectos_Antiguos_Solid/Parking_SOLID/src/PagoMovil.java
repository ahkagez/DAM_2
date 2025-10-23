public class PagoMovil implements MetodoPago{
    @Override
    public String getTipoPago() {
        return "Movil NFC";
    }
}
