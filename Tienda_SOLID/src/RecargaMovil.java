public class RecargaMovil implements EstrategiaPago{
    @Override
    public double calcularImporte(Recibo recibo) {
        recibo.setTotalFinal(recibo.getPrecioBase() * 1.05);
        recibo.setAjusteAplicado(getTipo());

        return recibo.getTotalFinal();
    }

    public String getTipo(){
        return "Cargo del 5%";
    }
}
