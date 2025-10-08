public class Recibo {
    private int id;
    private String producto;
    private double precioBase;
    private String metodoPago;
    private String ajusteAplicado;
    private double TotalFinal;

    public Recibo(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getAjusteAplicado() {
        return ajusteAplicado;
    }

    public double getTotalFinal() {
        return TotalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        TotalFinal = totalFinal;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }


    public void setAjusteAplicado(String ajusteAplicado) {
        this.ajusteAplicado = ajusteAplicado;
    }
}
