import java.util.Scanner;

public class loopAct3Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 20000;
        double amount;

        System.out.println("Starting Balance: " + balance);

        System.out.print("Enter transaction amount (0 to stop): ");
        amount = input.nextDouble();

        while (amount != 0) {

            if (amount > 0) {
                balance += amount;
            }

            else if (amount < 0) {

                if (Math.abs(amount) <= balance) {
                    balance += amount;
                }

                else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.println("Outstanding Balance: " + balance);

            System.out.print("Enter transaction amount (0 to stop): ");
            amount = input.nextDouble();
        }

        System.out.println("Final Balance: " + balance);

        input.close();
    }
}