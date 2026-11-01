import java.util.List;

public class GestorParqueadero {
    private final RepositorioMySQL repositorio = new RepositorioMySQL();
    private final ExportadorCSV exportador = new ExportadorCSV();
    private final NotificadorSMS notificador = new NotificadorSMS();

    public double calcularCobro(Vehiculo v) {
        switch (v.getTipo()) {
            case "MENSUAL": return v.getValorMensualidad();
            case "MINUTOS": return v.getMinutos() * v.getTarifaMinuto();
            default: throw new IllegalArgumentException("Tipo desconocido: " + v.getTipo());
        }
    }

    public void guardar(Vehiculo v, double cobro) {
        repositorio.insertar(v.getPlaca(), cobro);
    }

    // Coordina el cierre: calcula, persiste, notifica y finalmente exporta.
    public String cerrarMes(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            double cobro = calcularCobro(v);
            guardar(v, cobro);
            notificador.enviar(v, cobro);
        }
        return exportador.exportar(vehiculos, this);
    }
}
