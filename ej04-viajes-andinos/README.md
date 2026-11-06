# Ejercicio 4. Viajes Andinos

## Patrón aplicado: Builder

### Descripción
Este ejercicio consiste en implementar el patrón Builder para construir paquetes turísticos con diferentes servicios opcionales.

### Problema identificado
La clase `PaqueteViaje` tenía varios constructores sobrecargados y setters que permitían crear objetos incompletos o modificar sus atributos después de construirlos.

### Solución implementada
Se implementó una clase interna `Builder` con métodos para agregar servicios opcionales como:
- Vuelo.
- Hotel.
- Desayuno.
- Tour.
- Seguro de viaje.

Se establecieron destino y noches como datos obligatorios y se implementaron validaciones mediante `IllegalArgumentException`.

### Inmutabilidad
Se declararon los atributos como `private final`, se eliminó el constructor público y se quitaron los setters. De esta manera, los paquetes no pueden modificarse después de su construcción.

### Resultado
Los paquetes se construyen de forma clara y organizada. Los paquetes sin destino o con menos de una noche son rechazados mediante validaciones.

### Archivos principales
- `PaqueteViaje.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
Se deben mostrar los paquetes de Cartagena y Villa de Leyva. Los paquetes sin destino o con cero noches deben ser rechazados.

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
