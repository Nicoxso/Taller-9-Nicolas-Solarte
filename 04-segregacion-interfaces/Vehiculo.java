public class Vehiculo implements RegistrableMinutos, Asegurable, Lavable {
    private final String placa;
    private final double valorMensualidad;
    private int minutos;
    private int lavados;

    public Vehiculo(String placa, double valorMensualidad) {
        this.placa = placa;
        this.valorMensualidad = valorMensualidad;
    }

    public String getPlaca() { return placa; }
    public int getMinutos() { return minutos; }
    public int getLavados() { return lavados; }

    @Override
    public void registrarMinutos(int minutos) { this.minutos += minutos; }

    @Override
    public double calcularSeguro() { return valorMensualidad * 0.02; }

    @Override
    public void solicitarLavados(int cantidad) { this.lavados += cantidad; }
}
