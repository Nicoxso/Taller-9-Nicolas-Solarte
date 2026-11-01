public abstract class Vehiculo {
    protected final String codigo;
    protected final String propietario;
    protected final double valorMensualidad;

    protected Vehiculo(String codigo, String propietario, double valorMensualidad) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.valorMensualidad = valorMensualidad;
    }

    public String getCodigo() { return codigo; }
    public String getPropietario() { return propietario; }
    public abstract double calcularCobro();
}
