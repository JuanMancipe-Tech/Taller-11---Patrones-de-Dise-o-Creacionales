public class Hamburguesa {
    private String proteina;
    private int porciones;
    private String pan;
    private boolean queso;
    private boolean tocineta;
    private boolean cebollaCaramelizada;
    private boolean pepinillos;
    private String salsa;
    private boolean papasAgrandadas;

    // Constructor privado: solo el Builder puede crear hamburguesas
    private Hamburguesa(Builder builder) {
        this.proteina = builder.proteina;
        this.porciones = builder.porciones;
        this.pan = builder.pan;
        this.queso = builder.queso;
        this.tocineta = builder.tocineta;
        this.cebollaCaramelizada = builder.cebollaCaramelizada;
        this.pepinillos = builder.pepinillos;
        this.salsa = builder.salsa;
        this.papasAgrandadas = builder.papasAgrandadas;
    }

    // Clase Builder
    public static class Builder {
        private String proteina;
        private int porciones;
        private String pan = "brioche";
        private boolean queso = false;
        private boolean tocineta = false;
        private boolean cebollaCaramelizada = false;
        private boolean pepinillos = false;
        private String salsa = "ninguna";
        private boolean papasAgrandadas = false;

        public Builder(String proteina, int porciones) {
            this.proteina = proteina;
            this.porciones = porciones;
        }

        // Métodos para la hamburguesa
        public Builder pan(String pan) {
            this.pan = pan;
            return this;
        }

        public Builder queso() {
            this.queso = true;
            return this;
        }

        public Builder tocineta() {
            this.tocineta = true;
            return this;
        }

        public Builder cebollaCaramelizada() {
            this.cebollaCaramelizada = true;
            return this;
        }

        public Builder pepinillos() {
            this.pepinillos = true;
            return this;
        }

        public Builder salsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public Builder papasAgrandadas() {
            this.papasAgrandadas = true;
            return this;
        }

        // Construcción y validación
        public Hamburguesa build() {
            if (proteina == null || proteina.trim().isEmpty()) {
                throw new IllegalArgumentException("La proteina es obligatoria");
            }

            if (porciones < 1 || porciones > 3) {
                throw new IllegalArgumentException(
                    "La hamburguesa debe tener entre 1 y 3 porciones");
            }

            if (pan == null || pan.trim().isEmpty()) {
                pan = "brioche";
            }

            if (salsa == null || salsa.trim().isEmpty()) {
                salsa = "ninguna";
            }

            return new Hamburguesa(this);
        }
    }

    @Override
    public String toString() {
        return "Hamburguesa de " + proteina + " x" + porciones
             + " | pan: " + pan
             + (queso ? " | queso" : "")
             + (tocineta ? " | tocineta" : "")
             + (cebollaCaramelizada ? " | cebolla caramelizada" : "")
             + (pepinillos ? " | pepinillos" : "")
             + " | salsa: " + salsa
             + (papasAgrandadas ? " | papas agrandadas" : "");
    }
}