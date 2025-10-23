import java.util.Map;

public class RegistroEstrategia {
    private Map<Class<? extends MetodoPago>, EstrategiaPago> mapa;

    public RegistroEstrategia(Map<Class<? extends MetodoPago>, EstrategiaPago> mapa) {
        this.mapa = mapa;
    }

    public EstrategiaPago estrategiaPara(MetodoPago metodoPago) throws Exception {
        if(metodoPago == null) throw new Exception("El metodo de pago es invalido");

        EstrategiaPago estrategiaPago = mapa.get(metodoPago.getClass());
        if(estrategiaPago == null) throw new IllegalStateException("No hay estrategia de pago para este metodo.");

        return estrategiaPago;
    }
}
