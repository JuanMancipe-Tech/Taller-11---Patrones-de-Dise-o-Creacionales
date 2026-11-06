public class Main {
    public static void main(String[] args) {

        System.out.println("=== BurgerLab: pedidos del dia ===");

        // Pedido 1: doble carne de res, con tocineta, sin queso y salsa BBQ
        Hamburguesa h1 = new Hamburguesa.Builder("res", 2)
                .tocineta()
                .salsa("bbq")
                .build();

        // Pedido 2: pollo sencillo, solo pepinillos y sin salsa
        Hamburguesa h2 = new Hamburguesa.Builder("pollo", 1)
                .pepinillos()
                .salsa(null)
                .build();

        // Pedido 3: veggie triple con todos los ingredientes
        Hamburguesa h3 = new Hamburguesa.Builder("veggie", 3)
                .pan("integral")
                .queso()
                .tocineta()
                .cebollaCaramelizada()
                .pepinillos()
                .salsa("de la casa")
                .papasAgrandadas()
                .build();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        // Pedido 4: debe ser rechazado por superar las 3 porciones
        try {
            Hamburguesa h4 = new Hamburguesa.Builder("res", 7)
                    .pan("brioche")
                    .salsa("miel mostaza")
                    .build();

            System.out.println(h4);

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] Pedido 4 rechazado: " + e.getMessage());
        }

        System.out.println();
        System.out.println("ESPERADO -> pedido 1 con tocineta y sin queso, pan por defecto 'brioche',");
        System.out.println("            salsa por defecto 'ninguna' y el pedido 4 debe ser RECHAZADO (max 3 porciones)");
    }
}