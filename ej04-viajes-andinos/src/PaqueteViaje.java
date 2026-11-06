public class PaqueteViaje {

    // Atributos privados y finales: el objeto será inmutable
    private final String destino;
    private final int noches;
    private final boolean vuelo;
    private final String hotel;
    private final boolean desayuno;
    private final String tour;
    private final boolean seguroViaje;

    // Constructor privado
    private PaqueteViaje(Builder builder) {
        this.destino = builder.destino;
        this.noches = builder.noches;
        this.vuelo = builder.vuelo;
        this.hotel = builder.hotel;
        this.desayuno = builder.desayuno;
        this.tour = builder.tour;
        this.seguroViaje = builder.seguroViaje;
    }

    // Clase Builder
    public static class Builder {

        private String destino;
        private int noches;
        private boolean vuelo = false;
        private String hotel = null;
        private boolean desayuno = false;
        private String tour = null;
        private boolean seguroViaje = false;

        
        public Builder(String destino, int noches) {
            this.destino = destino;
            this.noches = noches;
        }

        // Opciones del paquete
        public Builder vuelo() {
            this.vuelo = true;
            return this;
        }
        public Builder hotel(String hotel) {
            this.hotel = hotel;
            return this;
        }
        public Builder desayuno() {
            this.desayuno = true;
            return this;
        }
        public Builder tour(String tour) {
            this.tour = tour;
            return this;
        }
        public Builder seguroViaje() {
            this.seguroViaje = true;
            return this;
        }

        // Construcción y validación
        public PaqueteViaje build() {
            if (destino == null || destino.trim().isEmpty()) {
                throw new IllegalArgumentException(
                    "El destino es obligatorio"
                );
            }
            if (noches < 1) {
                throw new IllegalArgumentException(
                    "El paquete debe tener minimo 1 noche"
                );
            }
            if (hotel != null && hotel.trim().isEmpty()) {
                hotel = null;
            }
            if (tour != null && tour.trim().isEmpty()) {
                tour = null;
            }
            return new PaqueteViaje(this);
        }
    }
    @Override
    public String toString() {
        return destino + " (" + noches + " noches)"
             + (vuelo ? " + vuelo" : "")
             + (hotel != null ? " + hotel " + hotel : "")
             + (desayuno ? " + desayuno" : "")
             + (tour != null ? " + tour " + tour : "")
             + (seguroViaje ? " + seguro" : "");
    }
}