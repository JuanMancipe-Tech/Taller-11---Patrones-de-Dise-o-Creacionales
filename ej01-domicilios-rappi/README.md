# Ejercicio 1. DomiciliosRapidito

## Patrón aplicado: Singleton

### Descripción
Este ejercicio consiste en implementar el patrón Singleton para garantizar que toda la aplicación utilice una única instancia de la clase `ConfiguracionApp`.

### Problema identificado
Las clases `AppRepartidor`, `CalculadoraDomicilio` y `PanelAdmin` creaban instancias independientes de `ConfiguracionApp` mediante el operador `new`. Esto provocaba que cada clase pudiera manejar configuraciones diferentes.

### Solución implementada
Se implementó el patrón Singleton mediante:
- Un atributo estático privado para almacenar la instancia.
- Un constructor privado para impedir la creación de objetos desde otras clases.
- Un método estático `getInstance()` para obtener la instancia compartida.

Se modificaron las clases que utilizaban la configuración para acceder a través de `ConfiguracionApp.getInstance()`.

### Resultado
La aplicación utiliza una única configuración compartida. El recargo por lluvia establecido desde el panel administrativo también se aplica al cálculo del domicilio y a las ganancias del repartidor.

### Archivos principales
- `ConfiguracionApp.java`
- `PanelAdmin.java`
- `CalculadoraDomicilio.java`
- `AppRepartidor.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
- Precio del domicilio: 8900.
- Ganancia del repartidor: 4400.
- La configuración se carga una sola vez.

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
