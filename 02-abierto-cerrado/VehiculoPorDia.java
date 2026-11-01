public class VehiculoPorDia extends Vehiculo {
    private final int dias;
    private final double tarifaDia;

    public VehiculoPorDia(String placa, String propietario, int dias, double tarifaDia) {
        super(placa, propietario);
        this.dias = dias;
        this.tarifaDia = tarifaDia;
    }

    @Override
    public double calcularCobro() { return dias * tarifaDia; }
}
