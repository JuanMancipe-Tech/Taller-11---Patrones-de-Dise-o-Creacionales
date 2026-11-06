# Ejercicio 6. DungeonLibre

## Patrón aplicado: Factory Method

### Descripción
Este ejercicio consiste en implementar el patrón Factory Method para organizar la creación de enemigos en los diferentes niveles de un videojuego.

### Problema identificado
La clase `Juego` utilizaba estructuras condicionales `if / else if` para decidir qué tipo de enemigo crear dependiendo del nivel. Esto hacía necesario modificar la clase cada vez que se agregaba un nuevo enemigo o nivel.

### Solución implementada
Se creó una interfaz `Enemigo`, que establece el método `atacar()`, y una clase abstracta `CreadorEnemigo`, que define el método `crearEnemigo()`.

Se implementaron fábricas concretas para crear:
- Esqueletos.
- Fantasmas.
- Golems.
- Dragones.

También se agregó la clase `Dragon` para representar al nuevo enemigo del nivel Volcán.

### Resultado
Cada fábrica se encarga de crear un tipo específico de enemigo. La clase `Juego` trabaja con la abstracción `Enemigo` y no necesita conocer las clases concretas para ejecutar sus ataques.

El nuevo nivel Volcán genera dos dragones sin modificar la lógica de la clase `Juego`.

### Archivos principales
- `Enemigo.java`
- `Esqueleto.java`
- `Fantasma.java`
- `Golem.java`
- `Dragon.java`
- `CreadorEnemigo.java`
- `CreadorEsqueleto.java`
- `CreadorFantasma.java`
- `CreadorGolem.java`
- `CreadorDragon.java`
- `Juego.java`
- `Main.java`

### Ejecución
```bash
javac -d out src/*.java
java -cp out Main
```

### Resultado esperado
Los niveles Cripta, Castillo y Glaciar deben generar sus enemigos correspondientes. El nivel Volcán debe generar dos dragones que realizan su ataque de fuego (-25 HP).

### Autor
Solución desarrollada para el Taller 11 de patrones de diseño.
