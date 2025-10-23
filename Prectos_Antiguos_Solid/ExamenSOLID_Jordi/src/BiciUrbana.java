public class BiciUrbana implements Bicicleta{
    private String id;
    private String modelo;

    public BiciUrbana(String id, String modelo) {
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
        return "Urbana";
    }
}
