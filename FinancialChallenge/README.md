# Reto Financiero

Este reto propone administrar una cuenta bancaria a través de un menú interactivo, se tienen 4 casos: verificar saldo, retirar dinero, depositar dinero, salir del programa.

## Reto

El programa pinta en la terminal el estado actual del cliente junto al menú para las transacciones.

```
*****************************************

Nombre del cliente: Tony Stark
Tipo de cuenta: Corriente
Saldo disponible: 1599.99$

*****************************************
** Escriba el número de la opción deseada **
1 - Consultar Saldo
2 - Retirar
3 - Depositar
9 - Salir
```
Se accede a la **consulta del saldo** presionando la tecla **1**, lo que nos debe devolver el monto `El saldo actualizado es: 1599,99$` y el menú para realizar otra consulta.

```
El saldo actualizado es: 1599,99$
** Escriba el número de la opción deseada **
1 - Consultar Saldo
2 - Retirar
3 - Depositar
9 - Salir
```
Y así consecutivamente con las demás operaciones. 

La opción 2, de retirar dinero, nos pedirá el monto a retirar `¿Cual es el valor que deseas retirar?`, una vez ingresado el monto se actualizará el saldo en la cuenta.

La opción 3 pide ingresar el monto a depositar `¿Cual es el valor que quieres depositar?`, este nuevo monto se debe sumar al saldo.

Tener en cuenta que se deben preveer el manejo de excepciones para el ingreso incorrecto de valores, por ejemplo, cuando se pide un monto, que sea un número la entrada de teclado y no un string.

## Solución

El programa se dividió en 4 funciones, la principal `main` y una por cada transacción. El bucle principal está dentro de la función `main`.

```
main() {
  while() {
    checkBalance();
        
    withdrawal();
        
    deposit();
  }
}

checkBalance(){
  // retorna en pantalla el saldo
}

withdrawal(){
  // resta del saldo el valor ingresado
}

deposit(){
  // aumenta al saldo el valor ingresado
}
```

### Ingreso por teclado
El ingreso por teclado se hace con la clase `Scanner`, la cual se debe instaciar, posee varios métodos que retornan el valor captado desde el teclado.

```java
// instanciando la clase Scanner:
Scanner keyboard = new Scanner(System.in); 
// Definiiendo variables:
int transaction;
boolean operating = true;
double balance = 1599.99;
```

### Manejar Excepciones
Una parte importante cuando se ingresan datos a una función, es que sean del tipo que se requiere por la función, de lo contrario se puede romper la ejecución del programa, una manera de manejar estas excepciones es con un `try - catch`.

En el bloque `try` se lee la entrada por teclado, si esta no es correcta salta el error que es manejado por el bloque `catch`.

```java
while(/*condition*/) {
    
    try {
        transaction = keyboard.nextInt();
        keyboard.nextLine();
    } catch (Exception e) {
        System.out.println("Por favor, ingrese una opción válida");
        keyboard.nextLine();
        continue;
    }
}
```
En el código anterior se está utilizando el método `nextInt()` del objeto `keyboard`, este método retorna un entero desde teclado, si desde el teclado no se introdujo un número entero entonces se produce un error de incompatibilidad de tipo.

El bloque `catch` entra en acción manejando el error imprimiendo el mensaje de que se ingrese un valor válido (en este caso un entero), luego se limpia el buffer de `Scanner` ya que tiene almacenado el enter `\n` presionado la última vez, esta limpiza del buffer se hace con `keyboard.nextLine();` ya que ejecuta el caracte de enter.

El comando `continue;` retorna al comienzo del buble `while()` para volver a tener la oportunidad de ingresar el valor.
