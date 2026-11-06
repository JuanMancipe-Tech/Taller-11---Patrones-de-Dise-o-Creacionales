# Ejercicio 5. EPSSaludYa

## Patrón aplicado: Singleton

### Descripción
Este ejercicio consiste en implementar el patrón Singleton para garantizar que todas las ventanillas y el kiosco digital compartan un único generador de turnos.

### Problema identificado
Las clases `Ventanilla` y `KioscoDigital` creaban instancias independientes de `GeneradorTurnos` utilizando `new GeneradorTurnos()`. Esto provocaba que cada punto de atención tuviera su propio consecutivo y que se pudieran repetir los números de turno.

### Solución implementada
Se implementó el patrón Singleton en la clase `GeneradorTurnos` mediante:
- Una instancia estática privada.
- Un constructor privado.
- Un método estático `getInstance()` para obtener la instancia compartida.

Las clases `Ventanilla` y `KioscoDigital` fueron modificadas para utilizar `GeneradorTurnos.getInstance()`.

### Resultado
Todos los puntos de atención utilizan el mismo generador de turnos, garantizando una secuencia consecutiva desde `T-001` hasta `T-005` y evitando la repetición de turnos.

### Archivos principales
- `GeneradorTurnos.java`
- `Ventanilla.java`
- `KioscoDigital.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
Se deben generar cinco turnos consecutivos:
- T-001: Martha.
- T-002: Jorge.
- T-003: Valentina.
- T-004: Luis.
- T-005: Camila.

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
