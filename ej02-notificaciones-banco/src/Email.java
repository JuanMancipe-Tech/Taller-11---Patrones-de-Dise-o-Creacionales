public class Email implements Notificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [EMAIL a " + usuario + "@correo.com] " + mensaje);
    }
}
