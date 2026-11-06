public class Ventanilla {
    private String nombre;

    // Paso. Se obtiene el generador compartido
    private GeneradorTurnos generador = GeneradorTurnos.getInstance();

    public Ventanilla(String nombre) {
        this.nombre = nombre;
    }
    public void asignarTurno(String paciente) {
        System.out.println("  [" + nombre + "] " + paciente + " -> " + generador.siguienteTurno());
    }
}