import java.util.HashMap;
import java.util.Map;

public class RegistroEstrategia {
    private Map<Class<? extends Bicicleta>, EstrategiaTarifa> mapa = new HashMap<>();

    public void registrar(Class<? extends Bicicleta> tipo, EstrategiaTarifa estrategiaTarifa) {
        if(tipo == null || estrategiaTarifa == null) throw new IllegalArgumentException();
        this.mapa.put(tipo, estrategiaTarifa);

    }

    public EstrategiaTarifa getTipo(Bicicleta bicicleta){
        if(bicicleta == null) throw new IllegalArgumentException();
        return mapa.get(bicicleta.getClass());
    }
}
