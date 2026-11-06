public class KioscoDigital {
    public void pedirTurno(String paciente) {
        // Paso. Se obtiene el generador compartido
        GeneradorTurnos generador = GeneradorTurnos.getInstance();

        System.out.println("  [Kiosco] " + paciente + " -> " + generador.siguienteTurno());
    }
}
