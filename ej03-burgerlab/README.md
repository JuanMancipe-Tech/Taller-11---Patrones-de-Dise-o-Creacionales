# Ejercicio 3. BurgerLab

## Patrón aplicado: Builder

### Descripción
Este ejercicio consiste en mejorar la construcción de hamburguesas mediante el patrón Builder, permitiendo agregar ingredientes y características opcionales de forma organizada.

### Problema identificado
La clase `Hamburguesa` utilizaba un constructor con muchos parámetros, incluyendo varios valores booleanos. Esto dificultaba identificar qué ingredientes estaban habilitados y podía generar errores al crear los pedidos.

### Solución implementada
Se implementó una clase interna `Builder` con métodos para configurar:
- Proteína.
- Cantidad de porciones.
- Tipo de pan.
- Queso.
- Tocineta.
- Cebolla caramelizada.
- Pepinillos.
- Salsa.
- Papas agrandadas.

Se establecieron valores predeterminados y validaciones para impedir la creación de hamburguesas con datos incorrectos.

### Resultado
Las hamburguesas se construyen mediante métodos encadenados, facilitando la lectura del código. También se valida que la cantidad de porciones esté entre 1 y 3.

### Archivos principales
- `Hamburguesa.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
Se deben mostrar las hamburguesas de res, pollo y vegetariana con sus respectivos ingredientes. El pedido con siete porciones debe ser rechazado mediante una excepción.

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
