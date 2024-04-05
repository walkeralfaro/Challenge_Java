import java.util.Scanner;

public class FinancialChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int transaction;
        boolean operating = true;
        double balance = 1599.99;

        String clientName = "Tony Stark";
        String accountType = "Corriente";

        System.out.println("*****************************************\n");
        System.out.println("Nombre del cliente: " + clientName);
        System.out.println("Tipo de cuenta: " + accountType);
        System.out.println("Saldo disponible: " + balance + "$\n");
        System.out.println("*****************************************");

        while (operating) {

            menu();

            try {
                transaction = keyboard.nextInt();
                keyboard.nextLine();
            } catch (Exception e) {
                System.out.println("Por favor, ingrese una opción válida");
                keyboard.nextLine();
                continue;
            }

            switch (transaction) {
                case 1:
                    checkBalance(balance);
                    break;
                case 2:
                    balance = withdrawal(balance, keyboard);
                    break;
                case 3:
                    balance = deposit(balance, keyboard);
                    break;
                case 9:
                    operating = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void checkBalance(Double balance) {
        System.out.printf("El saldo actualizado es: %.2f$%n", balance);
    }

    private static double withdrawal(Double balance, Scanner keyboard) {
        System.out.println("¿Cual es el valor que deseas retirar?");

        try {
            double moneyOut = keyboard.nextDouble();
            keyboard.nextLine();

            double newBalance = balance - moneyOut;
            if ( newBalance < 0 ) {
                System.out.println("Saldo insuficiente");
                return balance;
            } else {
                System.out.printf("Saldo restante: %.2f$%n", newBalance);
                return newBalance;
            }

        } catch (Exception e) {
            System.out.println("Por favor, ingresa un valor válido");
            keyboard.nextLine();
            return balance;
        }
    }

    private static double deposit(Double balance, Scanner keyboard) {
        System.out.println("¿Cual es el valor que quieres depositar?");

        try {
            double moneyIn = keyboard.nextDouble();
            keyboard.nextLine();
            double newBalance = balance + moneyIn;
            checkBalance(newBalance);
            return newBalance;
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un valor válido");
            keyboard.nextLine();

            return balance;
        }
    }

    private static void menu() {
        System.out.println("** Escriba el número de la opción deseada **");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Retirar");
        System.out.println("3 - Depositar");
        System.out.println("9 - Salir");
    }
}
