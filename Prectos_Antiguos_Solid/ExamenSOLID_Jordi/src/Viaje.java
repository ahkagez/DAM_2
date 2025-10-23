import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

public class Viaje {
    private UUID id = UUID.randomUUID();
    private Bicicleta bicicleta;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private long duracion;
    private List<Extra> extraList;

    public Viaje(Bicicleta bicicleta, List<Extra> extraList) {
        this.bicicleta = bicicleta;
        this.inicio = LocalDateTime.now();
        this.fin = null;
        this.extraList = extraList;
    }

    public void calcularDUracion(){
        this.duracion = ChronoUnit.MINUTES.between(this.inicio, this.fin);
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public UUID getId() {
        return id;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public long getDuracion() {
        return duracion;
    }

    public List<Extra> getExtraList() {
        return extraList;
    }
}
