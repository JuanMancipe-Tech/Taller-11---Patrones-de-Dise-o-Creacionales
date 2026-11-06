# Ejercicio 2. BancoPlata

## Patrón aplicado: Factory Method

### Descripción
Este ejercicio busca organizar la creación de diferentes tipos de notificaciones bancarias utilizando una fábrica.

### Problema identificado
La clase `ServicioNotificaciones` repetía estructuras condicionales `if / else if` para crear los objetos correspondientes a cada canal de notificación. Agregar un nuevo canal implicaba modificar repetidamente la lógica del servicio.

### Solución implementada
Se creó una interfaz `Notificacion` para establecer un método común `enviar()`. Posteriormente, se implementó una fábrica encargada de crear las notificaciones según el canal solicitado.

Se registraron los siguientes canales:
- SMS.
- EMAIL.
- PUSH.
- WHATSAPP.

La clase `ServicioNotificaciones` ahora solicita el objeto a `NotificacionFactory`, sin encargarse directamente de su creación.

### Resultado
El sistema puede enviar notificaciones mediante diferentes canales. Se agregó WhatsApp sin modificar la lógica interna de `ServicioNotificaciones`.

### Archivos principales
- `Notificacion.java`
- `Sms.java`
- `Email.java`
- `Push.java`
- `WhatsApp.java`
- `NotificacionFactory.java`
- `ServicioNotificaciones.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
El programa debe mostrar las notificaciones enviadas por SMS, EMAIL, PUSH y WHATSAPP.

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
