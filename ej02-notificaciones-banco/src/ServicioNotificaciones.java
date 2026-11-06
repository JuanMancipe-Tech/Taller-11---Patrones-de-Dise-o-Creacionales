public class ServicioNotificaciones {

    public void notificarTransferencia(String canal, String usuario, double monto) {
        String mensaje = "Recibiste $" + monto + " en tu cuenta BancoPlata";
        Notificacion notificacion = NotificacionFactory.crear(canal);
        notificacion.enviar(usuario, mensaje);
    }

    public void notificarCodigoSeguridad(String canal, String usuario, String codigo) {
        String mensaje = "Tu codigo de seguridad es " + codigo + ". No lo compartas.";
        Notificacion notificacion = NotificacionFactory.crear(canal);
        notificacion.enviar(usuario, mensaje);
    }
}