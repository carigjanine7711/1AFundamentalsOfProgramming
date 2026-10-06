import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class scholarshipBufferedReader {

    public static void main (String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.print("Enter NSAT score: ");
            String nsatInput = input.readLine();
            double nsat = Double.parseDouble(nsatInput);

            System.out.print("Enter parents' monthly salary: ");
            String salaryInput = input.readLine();
            double salary = Double.parseDouble(salaryInput);

            System.out.print("Enter entrance exam score: ");
            String entranceInput = input.readLine();
            double entrance = Double.parseDouble(entranceInput);

                //Average calculation
                double average = (nsat + entrance) / 2;

                //Scholarship decision
                 if (salary > 10000 || nsat < 90 || entrance < 85) {
                System.out.println("Application status: Rejected");
                  }
                else if (salary <= 3500 && average >= 91) {
                System.out.println("Application status: Accepted");
                }
                else {
                System.out.println("Application status: Further study");
            }

        } catch (IOException e) {
            System.err.println("Error reading input stream.");

        }

    }
}