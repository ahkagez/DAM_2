public class PagoEfectivo implements MetodoPago{
    @Override
    public String getTipoPago() {
        return "Efectivo";
    }

}
