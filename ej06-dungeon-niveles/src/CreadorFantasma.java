public class CreadorFantasma extends CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Fantasma();
    }
}