public class Main {
    public static void main(String[] args) {
        // Prueba sin MySQL: se inyecta el repositorio en memoria.
        RepositorioMemoria memoria = new RepositorioMemoria();
        GestorParqueadero gestor = new GestorParqueadero(memoria);

        Vehiculo mensual = new Vehiculo("KLM321", "Camila Rojas", "MENSUAL", 180000, 0, 0);
        Vehiculo porMinuto = new Vehiculo("XYZ45F", "Andrés Mora", "MINUTOS", 0, 80, 1500);

        for (Vehiculo v : new Vehiculo[]{mensual, porMinuto}) {
            double cobro = gestor.calcularCobro(v);
            gestor.guardar(v, cobro);
        }

        System.out.println("Registros en memoria: " + memoria.obtenerTodos());
    }
}
