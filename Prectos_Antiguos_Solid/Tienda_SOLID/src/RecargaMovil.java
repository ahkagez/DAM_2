public class RecargaMovil implements EstrategiaPago{
    @Override
    public double calcularImporte(double precioBase) {
        return precioBase * 1.05;
    }

    public String getTipo(){
        return "Cargo del 5%";
    }
}
