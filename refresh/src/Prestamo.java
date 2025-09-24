import java.time.*;

public class Prestamo {
    Prestable recurso;
    Usuario usuario;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    boolean devuelto;

    public Prestamo(Prestable recurso, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin, boolean devuelto) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.devuelto = devuelto;
    }

    public double calcularPrecio(){
        int mes = fechaInicio.until(fechaFin).getMonths();
        int dias = fechaInicio.until(fechaFin).getDays();
        return recurso.tarifabase() * (dias + (mes * 30));
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
