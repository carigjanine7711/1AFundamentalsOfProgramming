import java.util.Scanner;

public class loopAct1Scanner {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num, highest, lowest;

        System.out.print("Enter number 1: ");
        num = input.nextInt();

        highest = num;
        lowest = num;

        for (int d = 2; d <= 10; d++) {

            System.out.print("Enter number " + d + ": ");
            num = input.nextInt();

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);

        input.close();
    }
}




