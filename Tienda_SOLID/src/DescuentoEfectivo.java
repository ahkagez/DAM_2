public class DescuentoEfectivo implements EstrategiaPago{
    @Override
    public double calcularImporte(Recibo recibo) {
        recibo.setTotalFinal(recibo.getPrecioBase() * 0.95);
        recibo.setAjusteAplicado(getTipo());

        return recibo.getTotalFinal();
    }

    public String getTipo(){
        return "Descuento del 5%";
    }
}
