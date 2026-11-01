import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = Arrays.asList(
            new VehiculoMensual("KLM321", "Camila Rojas", 180000),
            new VehiculoPorMinuto("XYZ45F", "Andrés Mora", 80, 1500),
            new VehiculoPorDia("DIA-09", "Valentina Díaz", 3, 12000)
        );

        // El gestor funciona con el nuevo tipo sin conocerlo ni modificarse.
        new GestorParqueadero().mostrarCobros(vehiculos);
    }
}
