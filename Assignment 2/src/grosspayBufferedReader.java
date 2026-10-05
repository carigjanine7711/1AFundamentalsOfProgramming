import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class grosspayBufferedReader {

    public static void main (String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.print("Enter hourly pay: ");
            String payInput = input.readLine();
            double payRate = Double.parseDouble(payInput);

            System.out.print("Enter hours worked: ");
            String hourInput = input.readLine();
            double hourWorked = Double.parseDouble(hourInput);

                //Gross pay calculation
                double grossPay = payRate * hourWorked;

            System.out.println("Gross pay: " + grossPay);

                //Withholding Tax calculation
                    double taxRate;
                if (grossPay <=2000) {
                    taxRate = 0.10;
                }
                 else if (grossPay <= 4000) {
                    taxRate = 0.12;
                }
                 else if (grossPay <= 10000) {
                    taxRate = 0.15;
                }
                 else {
                    taxRate = 0.20;
                }

                 double withHoldingtax = grossPay * taxRate;
                 double netpay = grossPay - withHoldingtax;

                 System.out.println("Withholding tax: " + withHoldingtax);

            System.out.println("Net pay: " + netpay);


        } catch (IOException e) {
            System.err.println("Error reading input stream.");

        }

    }
}
