import java.util.Scanner;
public class MenuCajero {

    public static void mostrarMenu(int saldoInicial) {
        Scanner sc = new Scanner(System.in);
        int saldo = saldoInicial;
        int opcion;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. balance inquiry");
            System.out.println("4. exit");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                 
                System.out.println("how much do you want to deposit?");
                int deposito = sc.nextInt();
                saldo = saldo + deposito; // le sumamos el deposito al saldo
                break;

                case 2:
                    System.out.print("¿how much do you want to withdraw? ");
                    int retiro = sc.nextInt();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Withdrawal successful. Your new balance is: $" + saldo);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 3:
                    System.out.print("Your current balance is: $" + saldo);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. See you soon!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (opcion != 4);
    }
}
