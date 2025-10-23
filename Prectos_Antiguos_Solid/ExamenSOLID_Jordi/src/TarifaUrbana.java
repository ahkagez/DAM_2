public class TarifaUrbana implements EstrategiaTarifa{
    @Override
    public double calcularImporte() {
        return 0.2;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
