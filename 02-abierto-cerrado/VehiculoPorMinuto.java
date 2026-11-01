public class VehiculoPorMinuto extends Vehiculo {
    private final int minutos;
    private final double tarifaMinuto;

    public VehiculoPorMinuto(String placa, String propietario, int minutos, double tarifaMinuto) {
        super(placa, propietario);
        this.minutos = minutos;
        this.tarifaMinuto = tarifaMinuto;
    }

    @Override
    public double calcularCobro() { return minutos * tarifaMinuto; }
}
