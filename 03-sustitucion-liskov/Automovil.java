public class Automovil extends Vehiculo implements AcumuladorPuntos {
    public Automovil(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario, valorMensualidad);
    }

    @Override
    public double calcularCobro() { return valorMensualidad; }

    @Override
    public int calcularPuntos() { return (int) (valorMensualidad / 10000); }
}
