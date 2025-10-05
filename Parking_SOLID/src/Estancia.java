import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Estancia{
    final private int id;

    private Vehiculo vehiculo;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaFinal;

    public Estancia(int id, Vehiculo vehiculo, LocalDateTime fechaEntrada) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaFinal = null;
    }





    public void setFechaFinal(LocalDateTime fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public long calcularDuracion(){
        return ChronoUnit.MINUTES.between(fechaEntrada, fechaFinal);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Estancia{" +
                "id=" + id +
                ", vehiculo=" + vehiculo +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaFinal=" + fechaFinal +
                '}';
    }


}
