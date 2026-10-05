import javax.swing.JOptionPane;

public class grosspayJOption {

    public static void main (String[] args){

        String pay = JOptionPane.showInputDialog("Enter hourly pay.");
        double hourlyPay = Double.parseDouble(pay);

        String hour = JOptionPane.showInputDialog("Enter hours worked.");
        double hoursWorked = Double.parseDouble(hour);

             //Gross pay calculation
             double grossPay = hourlyPay * hoursWorked;

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

        JOptionPane.showMessageDialog(null, "Gross pay: " + grossPay +
                                                                    "\n Withholding tax: " + withHoldingtax +
                                                                    "\n Net pay: " + netpay);

    }

}
