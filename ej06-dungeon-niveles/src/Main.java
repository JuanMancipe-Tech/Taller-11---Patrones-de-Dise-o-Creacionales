public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        System.out.println("=== Dungeon Libre ===");

        juego.jugarNivel("Cripta", 2, new CreadorEsqueleto());

        juego.jugarNivel("Castillo", 1, new CreadorFantasma());

        juego.jugarNivel("Glaciar", 1, new CreadorGolem());

        // Nuevo nivel DLC: Volcan
        juego.jugarNivel("Volcan", 2, new CreadorDragon());

        System.out.println();

        System.out.println("ESPERADO -> el Volcan genera 2 Dragones y la clase que recorre el nivel");
        System.out.println("            NO vuelve a modificarse para agregar mas niveles");
    }
}