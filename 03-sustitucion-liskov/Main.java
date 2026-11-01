import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = Arrays.asList(
            new Automovil("AUTO-01", "Camila", 180000),
            new Bicicleta("BIC-07", "Valentina", 40000)
        );

        for (Vehiculo v : vehiculos) {
            System.out.printf("%s: cobro $%.0f%n", v.getCodigo(), v.calcularCobro());
            if (v instanceof AcumuladorPuntos) {
                AcumuladorPuntos fidelizable = (AcumuladorPuntos) v;
                System.out.println("Puntos: " + fidelizable.calcularPuntos());
            } else {
                System.out.println("Este vehículo no participa en puntos.");
            }
        }
    }
}
