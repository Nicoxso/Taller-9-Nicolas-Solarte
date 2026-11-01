import java.util.List;

public class GestorParqueadero {
    public double calcularCobro(Vehiculo vehiculo) {
        return vehiculo.calcularCobro();
    }

    public void mostrarCobros(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            System.out.printf("%s (%s): $%.2f%n",
                v.getPlaca(), v.getPropietario(), calcularCobro(v));
        }
    }
}
