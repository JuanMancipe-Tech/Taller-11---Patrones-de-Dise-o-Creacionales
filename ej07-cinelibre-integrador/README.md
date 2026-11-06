# Ejercicio 7. CineLibre

## Patrones aplicados: Builder y Singleton

### Descripción
Este ejercicio consiste en combinar los patrones Builder y Singleton para mejorar la construcción de boletas y controlar las reservas de sillas en una sala de cine.

### Problema identificado
La clase `Boleta` utilizaba un constructor con varios parámetros, lo que dificultaba su construcción y podía provocar confusiones al establecer los valores.

Además, `TaquillaFisica` y `AppWeb` creaban instancias independientes de `MapaSillas`, permitiendo que una misma silla pudiera venderse dos veces.

### Solución implementada

**Builder:**

Se implementó una clase interna `Builder` en `Boleta`, que permite establecer los datos obligatorios, como película y silla, y agregar servicios opcionales como:
- 3D.
- Silla VIP.
- Combo.
- Tarifa de estudiante.

También se incorporaron validaciones mediante `IllegalArgumentException`.

**Singleton:**

Se implementó el patrón Singleton en `MapaSillas`, utilizando una instancia estática, un constructor privado y el método `getInstance()`.

Esto garantiza que la taquilla física y la aplicación web compartan el mismo registro de sillas ocupadas.

### Resultado
El sistema permite construir boletas de manera organizada, aplicar correctamente sus servicios y evitar la venta duplicada de sillas.

La prueba demuestra que la silla F7, vendida inicialmente por taquilla, es rechazada cuando se intenta comprar nuevamente desde la aplicación web.

### Archivos principales
- `Boleta.java`
- `MapaSillas.java`
- `TaquillaFisica.java`
- `AppWeb.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
- La taquilla vende la silla F7.
- La aplicación web vende la silla F8 con tarifa de estudiante y sin VIP.
- El segundo intento de comprar F7 es rechazado porque ya está ocupada.

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
