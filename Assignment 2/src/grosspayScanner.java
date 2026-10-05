import java.util.Scanner;

public class grosspayScanner {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter hourly pay: ");
            double Hourlypay = input.nextDouble();

            System.out.print("Enter hours worked; ");
            double Hoursworked = input.nextDouble();

        //Gross pay calculation
        double grossPay = Hourlypay * Hoursworked;

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


    }
}
