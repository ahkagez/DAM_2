import java.util.Objects;

public class Moto implements Vehiculo{
    String matricula;
    String modelo;
    String color;

    public Moto(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }





    @Override
    public String toString() {
        return "Moto{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(matricula, moto.matricula);
    }
}
