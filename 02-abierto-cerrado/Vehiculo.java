public abstract class Vehiculo {
    protected final String placa;
    protected final String propietario;

    protected Vehiculo(String placa, String propietario) {
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getPlaca() { return placa; }
    public String getPropietario() { return propietario; }

    // Cada modalidad define su propia regla de cobro.
    public abstract double calcularCobro();
}
