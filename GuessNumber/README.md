# Reto adivina el número

Este reto te pide que adivines un número entre 1 y 100, te da 5 intentos antes de que diga que fallaste, además, con cada intento te da la pista si el número a adivinar es mayor o menor al número que ingresaste.

## Solución

El juego utiliza un ciclo `for` para evaluar en cada iteración si el número ingresado conincide con el número random por adivinar.

```
for (int i = 1; i <= 5; i++) {

    // Leer número desde el teclado
    
    // Decidir si coincide, o es mayor, o es menor
    
    // Finalizar indicando si se adivió antes de los 5 intentos

}
```

Para el ingreso del valor, se debe manejar la excepción de que no sea un número entero, para eso se utiliza un bloque `try-catch`.

```java
try {
    numberUser = keyboard.nextInt();
    keyboard.nextLine();
} catch (Exception e) {
    System.out.println("Por favor, ingresa un número válido.");
    keyboard.nextLine();
    i--;
    continue;
}
```

En el bloque `try` se lee en la variable `numberUser` un entero ingresado por teclado, si no fuera entero, entoces `catch` maneja el error que esto genera imprimiendo por consola que se ingrese un valor entero, además que retorna el contador `i` con el comando `--i`, y ejecuta `continue;` para regresar al comienzo del bucle y volver a tener la oportunidad de ingresar el valor.