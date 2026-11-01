import java.util.LinkedHashMap;
import java.util.Map;

public class RepositorioMemoria implements RepositorioCobros {
    private final Map<String, Double> cobros = new LinkedHashMap<>();

    @Override
    public void insertar(String placa, double cobro) {
        cobros.put(placa, cobro);
        System.out.println("[Memoria] Guardado " + placa + " -> $" + cobro);
    }

    public Map<String, Double> obtenerTodos() {
        return new LinkedHashMap<>(cobros);
    }
}
