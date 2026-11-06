import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificacionFactory {

    private static final Map<String, Supplier<Notificacion>> CANALES =
            new HashMap<>();

    static {
        CANALES.put("SMS", Sms::new);
        CANALES.put("EMAIL", Email::new);
        CANALES.put("PUSH", Push::new);
        CANALES.put("WHATSAPP", WhatsApp::new);
    }

    public static Notificacion crear(String canal) {

        Supplier<Notificacion> creador = CANALES.get(canal.toUpperCase());

        if (creador == null) {
            throw new IllegalArgumentException("Canal no soportado: " + canal);
        }

        return creador.get();
    }
}