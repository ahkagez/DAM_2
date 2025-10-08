import java.util.Map;

public class RegistroEstrategia {
    private Map<Class<? extends MetodoPago>, EstrategiaPago> mapa;
    Impresora impresora;


    public double procesarPago(MetodoPago metodoPago, Recibo recibo){
        recibo.setMetodoPago(metodoPago.getTipoPago());
        EstrategiaPago estrategiaPago = mapa.get(metodoPago.getClass());

        return estrategiaPago.calcularImporte(recibo);
    }
}
