public class Push implements Notificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [PUSH al celular de " + usuario + "] " + mensaje);
    }
}
