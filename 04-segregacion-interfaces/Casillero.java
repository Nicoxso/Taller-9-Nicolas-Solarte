// El casillero solo necesita registrar minutos y calcular el alquiler.
public class Casillero implements RegistrableMinutos {
    private final String codigo;
    private final double tarifaMinuto;
    private int minutos;

    public Casillero(String codigo, double tarifaMinuto) {
        this.codigo = codigo;
        this.tarifaMinuto = tarifaMinuto;
    }

    @Override
    public void registrarMinutos(int minutos) { this.minutos += minutos; }

    public double valorAlquiler() { return minutos * tarifaMinuto; }
    public String getCodigo() { return codigo; }
}
