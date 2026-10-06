import java.util.Scanner;

public class scholarshipScanner {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double entrance = input.nextDouble();

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

    }
}