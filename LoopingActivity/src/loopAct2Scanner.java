import java.util.Scanner;

public class loopAct2Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int e = 2; e <= 100; e += 2) {

            System.out.print(e + " ");

            if (e % 20 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}