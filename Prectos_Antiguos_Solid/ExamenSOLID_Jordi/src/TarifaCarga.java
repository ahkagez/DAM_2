public class TarifaCarga implements EstrategiaTarifa{
    @Override
    public double calcularImporte() {
        return 0.45;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
