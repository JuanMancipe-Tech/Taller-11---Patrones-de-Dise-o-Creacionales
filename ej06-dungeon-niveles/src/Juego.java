public class Juego {

    public void jugarNivel(String nivel, int cantidadEnemigos, CreadorEnemigo creador) {

        System.out.println(">> Entrando a: " + nivel);

        for (int i = 0; i < cantidadEnemigos; i++) {

            Enemigo enemigo = creador.crearEnemigo();

            enemigo.atacar();
        }
    }
}