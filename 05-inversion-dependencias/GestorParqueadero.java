public class GestorParqueadero {
    private final RepositorioCobros repositorio;

    // La dependencia se recibe desde afuera (inyección por constructor).
    public GestorParqueadero(RepositorioCobros repositorio) {
        if (repositorio == null) throw new IllegalArgumentException("El repositorio es obligatorio");
        this.repositorio = repositorio;
    }

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
}
