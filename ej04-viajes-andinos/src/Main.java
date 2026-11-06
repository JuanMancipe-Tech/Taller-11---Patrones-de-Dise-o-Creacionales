public class Main {
    public static void main(String[] args) {

        System.out.println("=== Viajes Andinos: paquetes vendidos ===");

        // Paquete 1: Cartagena con todos los servicios
        PaqueteViaje p1 = new PaqueteViaje.Builder("Cartagena", 4)
                .vuelo()
                .hotel("Decameron")
                .desayuno()
                .tour("Islas del Rosario")
                .build();

        // Paquete 2: Villa de Leyva, solo hotel y seguro
        PaqueteViaje p2 = new PaqueteViaje.Builder("Villa de Leyva", 2)
                .hotel("Posada del Sol")
                .seguroViaje()
                .build();

        System.out.println(p1);
        System.out.println(p2);

        // Paquete 3: debe rechazarse porque no tiene destino
        try {
            PaqueteViaje p3 = new PaqueteViaje.Builder(null, 3)
                    .tour("Cafe en Salento")
                    .build();

            System.out.println(p3);

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] Paquete 3 rechazado: " + e.getMessage());
        }

        // Paquete 4: debe rechazarse porque tiene 0 noches
        try {
            PaqueteViaje p4 = new PaqueteViaje.Builder("San Andres", 0)
                    .build();

            System.out.println(p4);

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] Paquete 4 rechazado: " + e.getMessage());
        }

        System.out.println();
        System.out.println("ESPERADO -> p1 y p2 se construyen leyendo claramente que incluyen,");
        System.out.println("            p3 y p4 se RECHAZAN al construirse (sin destino / 0 noches)");
    }
}