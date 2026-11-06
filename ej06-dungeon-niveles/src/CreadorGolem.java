public class CreadorGolem extends CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Golem();
    }
}