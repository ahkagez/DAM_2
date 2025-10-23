import java.time.*;

public class Prestamo implements CalcularPrecio {
    private Prestable recurso;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean devuelto;

    public Prestamo(Prestable recurso, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin, boolean devuelto) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.devuelto = devuelto;
    }




    @Override
    public double calcularPrecio() {
        return 0;
    }

    public Prestable getRecurso() {
        return recurso;
    }

    public boolean isDevuelto() {
        return devuelto;
    }
}
