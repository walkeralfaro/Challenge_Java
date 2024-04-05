import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        boolean play = true;
        Scanner keyboard = new Scanner(System.in);

        while (play) {
            Integer random = new Random().nextInt(100);
            Integer numberUser = 0;

            System.out.println("======================================================");
            System.out.println("!BIENVENIDO AL JUEGO! - Adivina un número del 1 al 100");
            System.out.println("======================================================");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingresa un número: ");

                try {
                    numberUser = keyboard.nextInt();
                    keyboard.nextLine();
                } catch (Exception e) {
                    System.out.println("Por favor, ingresa un número válido.");
                    keyboard.nextLine();
                    i--;
                    continue;
                }

                if (numberUser.equals(random)) {
                    System.out.println("ADIVINASTE en "+ i + " intentos! El número era: " + random);
                    break;
                } else if ( i == 5) {
                    System.out.println("Qué pena, no adivinaste, el número era: " + random);
                } else if (numberUser < random) {
                    System.out.println("El número es mayor");
                } else {
                    System.out.println("El número es menor");
                }
            }

            System.out.println("¿Quieres seguir jugando? [y/n]: ");
            String continueGame = keyboard.nextLine();
            if (!continueGame.equals("y")) {
                play = false;
            }
        }
    }
}
