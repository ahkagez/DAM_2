public class BiciElectrica implements Bicicleta{
    private String id;
    private String modelo;

    public BiciElectrica(String id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getTipo() {
        return "Electrica";
    }
}
