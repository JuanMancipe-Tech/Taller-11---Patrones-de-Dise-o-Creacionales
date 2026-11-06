public class CreadorDragon extends CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Dragon();
    }
}