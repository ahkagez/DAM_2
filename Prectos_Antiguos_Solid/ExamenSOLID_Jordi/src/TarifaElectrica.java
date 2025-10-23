public class TarifaElectrica implements EstrategiaTarifa{
    @Override
    public double calcularImporte() {
        return 0.35;
    }

    @Override
    public String getTipo() {
        return "Tarifa Electrica";
    }
}
