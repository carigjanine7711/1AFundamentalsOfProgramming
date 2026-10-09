import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class militaryAcademyBufferedReader {

    public static void main (String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Enter your height: ");
            String heightInput = input.readLine();
            double height = Double.parseDouble(heightInput);

            System.out.print("Enter your age: ");
            String ageInput = input.readLine();
            int age = Integer.parseInt(ageInput);

            System.out.print("Citizenship code (C/N): ");
            String citizenshipInput = input.readLine();

            System.out.print("Recommendee code (R/N): ");
            String recommendeeInput = input.readLine();

            //Exceptions
            if ((!citizenshipInput.equals("C") && !citizenshipInput.equals("N")) ||
                    (!recommendeeInput.equals("R") && !recommendeeInput.equals("N"))) {
                System.out.println("Invalid code entered.");
            }
            else if (recommendeeInput.equals("R")) {
                System.out.println("Applicant is accepted.");
            }
            else if (height >= 200 && age >= 21 && age <= 25 && citizenshipInput.equals("C")) {
                System.out.println("Applicant is accepted.");
            }
            else {
                System.out.println("Applicant is rejected.");
            }

        } catch (IOException e) {
            System.err.println("Error reading input.");

        }

    }
}