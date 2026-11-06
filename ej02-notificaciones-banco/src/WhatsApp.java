public class WhatsApp implements Notificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [WHATSAPP a " + usuario + "] " + mensaje);
    }
}