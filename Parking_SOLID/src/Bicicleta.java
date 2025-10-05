import java.util.Objects;

public class Bicicleta implements Vehiculo{
    String numeroSerie;
    String modelo;
    String color;
    boolean electrica;

    public Bicicleta(String numeroSerie, String modelo, String color, boolean electrica) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.color = color;
        this.electrica = electrica;
    }






    @Override
    public String toString() {
        return "Bicicleta{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", electrica=" + electrica +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(numeroSerie, bicicleta.numeroSerie);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroSerie);
    }
}
