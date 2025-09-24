import java.time.*;

public class Prestado {
    Prestable recurso;
    Usuario usuario;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    boolean devuelto;

    public Prestado(Prestable recurso, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin, boolean devuelto) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.devuelto = devuelto;
    }

    public double calcularPrecio(){
        int dias = fechaInicio.until(fechaFin).getDays();
        return recurso.tarifabase() * dias;
    }

    @Override
    public String toString() {
        return "Prestado{" +
                "recurso=" + recurso +
                ", usuario=" + usuario +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", devuelto=" + devuelto +
                '}';
    }
}
