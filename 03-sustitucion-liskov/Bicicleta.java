public class Bicicleta extends Vehiculo {
    public Bicicleta(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario, valorMensualidad);
    }

    @Override
    public double calcularCobro() { return valorMensualidad; }

    // No ofrece calcularPuntos porque las bicicletas no acumulan puntos.
}
