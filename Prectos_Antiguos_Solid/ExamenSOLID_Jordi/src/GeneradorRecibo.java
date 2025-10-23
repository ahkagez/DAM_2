import java.time.LocalDateTime;
import java.util.List;

public class GeneradorRecibo implements Recibo {
    private String tipo;
    private String biciModelo;
    private String biciId;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private long duracion;
    private EstrategiaTarifa tarifaBase;
    private List<Extra> extras;
    private double total;

    public GeneradorRecibo(String tipo, String biciModelo, String biciId, LocalDateTime inicio, LocalDateTime fin, long duracion, EstrategiaTarifa tarifaBase, List<Extra> extras, double total) {
        this.tipo = tipo;
        this.biciModelo = biciModelo;
        this.biciId = biciId;
        this.inicio = inicio;
        this.fin = fin;
        this.duracion = duracion;
        this.tarifaBase = tarifaBase;
        this.extras = extras;
        this.total = total;
    }

    public String getTipo() {
        return tipo;
    }

    public String getBiciModelo() {
        return biciModelo;
    }

    public String getBiciId() {
        return biciId;
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

    public EstrategiaTarifa getTarifaBase() {
        return tarifaBase;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public double getTotal() {
        return total;
    }


    @Override
    public String toString() {
        return "=== RECIBO ALQUILER BICICLETA ===" + "\n" +
                "Tipo:  " + tipo + '\n' +
                "Modelo/ID: " + biciModelo + "\\" + biciId + "\n" +
                "Inicio:    " + inicio  + "\n" +
                "Fin:   " + fin  + "\n" +
                "Duracion facturada:    " + duracion + " min"  + "\n" +
                "Tarifa base/min:   " + tarifaBase.calcularImporte() + " €/min"  + "\n" +
                "Extras:    " + extras + "\n" +
                "Politica: Tarifa plana por minuto" + "\n" +
                "-----------------------------------" + "\n" +
                "TOTAL: " + total + " €" + "\n" +
                "==================================="
                ;
    }
}
