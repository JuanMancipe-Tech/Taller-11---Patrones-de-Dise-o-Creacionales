public class CreadorEsqueleto extends CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Esqueleto();
    }
}