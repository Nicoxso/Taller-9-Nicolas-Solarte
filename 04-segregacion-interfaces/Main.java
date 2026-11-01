public class Main {
    public static void main(String[] args) {
        Casillero casillero = new Casillero("CAS-01", 50);
        casillero.registrarMinutos(30);
        System.out.println("Alquiler del casillero: $" + casillero.valorAlquiler());

        Vehiculo vehiculo = new Vehiculo("KLM321", 180000);
        vehiculo.registrarMinutos(60);
        vehiculo.solicitarLavados(2);
        System.out.println("Seguro: $" + vehiculo.calcularSeguro());
        System.out.println("Lavados solicitados: " + vehiculo.getLavados());
    }
}
