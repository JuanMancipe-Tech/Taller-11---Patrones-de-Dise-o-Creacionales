import java.util.ArrayList;

public class MapaSillas {
    // Paso. Instancia única
    private static MapaSillas instancia;

    private ArrayList<String> ocupadas = new ArrayList<>();

    // Paso. Constructor privado
    private MapaSillas() {
    }

    // Paso. Obtener la instancia compartida
    public static MapaSillas getInstance() {

        if (instancia == null) {
            instancia = new MapaSillas();
        }
        return instancia;
    }

    public boolean reservar(String silla) {
        if (ocupadas.contains(silla)) {
            return false;
        }
        ocupadas.add(silla);
        return true;
    }
}