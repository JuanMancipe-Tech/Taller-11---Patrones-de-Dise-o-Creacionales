public class Boleta {
    private final String pelicula;
    private final String silla;
    private final boolean es3D;
    private final boolean sillaVip;
    private final String combo;
    private final boolean estudiante;

    // Paso. Constructor privado para utilizar Builder
    private Boleta(Builder builder) {
        this.pelicula = builder.pelicula;
        this.silla = builder.silla;
        this.es3D = builder.es3D;
        this.sillaVip = builder.sillaVip;
        this.combo = builder.combo;
        this.estudiante = builder.estudiante;
    }

    public String getSilla() {
        return silla;
    }

    // Paso. Clase Builder para construir las boletas
    public static class Builder {
        private String pelicula;
        private String silla;
        private boolean es3D = false;
        private boolean sillaVip = false;
        private String combo = null;
        private boolean estudiante = false;

        public Builder(String pelicula, String silla) {
            this.pelicula = pelicula;
            this.silla = silla;
        }

        public Builder es3D() {
            this.es3D = true;
            return this;
        }

        public Builder sillaVip() {
            this.sillaVip = true;
            return this;
        }

        public Builder combo(String combo) {
            this.combo = combo;
            return this;
        }
        public Builder estudiante() {
            this.estudiante = true;
            return this;
        }

        // Paso. Validar y construir la boleta
        public Boleta build() {
            if (pelicula == null || pelicula.trim().isEmpty()) {
                throw new IllegalArgumentException("La pelicula es obligatoria");
            }
            if (silla == null || silla.trim().isEmpty()) {
                throw new IllegalArgumentException("La silla es obligatoria");
            }
            return new Boleta(this);
        }
    }
    @Override
    public String toString() {
        return pelicula + " | silla " + silla
             + (es3D ? " | 3D" : "")
             + (sillaVip ? " | VIP" : "")
             + (combo != null ? " | combo " + combo : "")
             + (estudiante ? " | tarifa estudiante" : "");
    }
}