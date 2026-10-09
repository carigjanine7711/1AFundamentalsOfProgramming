import java.util.Scanner;

public class militaryAcademyScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = input.nextLine().toUpperCase();

        System.out.print("Enter recommendee code (R/N): ");
        String recommendee = input.nextLine().toUpperCase();

        // Acceptance decision
        if ((!citizenship.equals("C") && !citizenship.equals("N")) ||
                (!recommendee.equals("R") && !recommendee.equals("N"))) {
            System.out.println("Invalid code entered.");
        }
        else if (recommendee.equals("R")) {
            System.out.println("Applicant is accepted.");
        }
        else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            System.out.println("Applicant is accepted.");
        }
        else {
            System.out.println("Applicant is rejected.");
        }

        input.close();

    }
}

