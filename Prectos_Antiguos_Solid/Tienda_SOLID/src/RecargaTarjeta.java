public class RecargaTarjeta implements EstrategiaPago{
    @Override
    public double calcularImporte(double precioBase) {

        return precioBase * 1.03;
    }

    public String getTipo(){
        return "Cargo del 3%";
    }
}
