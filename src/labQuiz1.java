import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labQuiz1 {

    public static void main (String[] args){
        BufferedReader dataln = new BufferedReader( new InputStreamReader(System.in));
        try {

            System.out.print("Enter your Birth Year: ");
            String yearInput = dataln.readLine();
            int year = Integer.parseInt(yearInput);
            System.out.println("You were born last " + year + ".");

            int yearnow = 2026;
            System.out.println("You are now " + (yearnow-year) + " years old.");  //To calculate age

        } catch (IOException e) {
            System.err.println("Error reading input stream");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");

        }
    }
}
