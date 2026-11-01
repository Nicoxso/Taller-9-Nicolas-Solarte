public class VehiculoMensual extends Vehiculo {
    private final double valorMensualidad;

    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario);
        this.valorMensualidad = valorMensualidad;
    }

    @Override
    public double calcularCobro() { return valorMensualidad; }
}
