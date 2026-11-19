import javax.swing.JOptionPane;

public class loopAct3Joptionpane {
    public static void main(String[] args) {

        double balance = 20000;
        double amount;

        JOptionPane.showMessageDialog(null,
                "Starting Balance: " + balance);

        amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter transaction amount (0 to stop):")
        );

        while (amount != 0) {

            if (amount > 0) {
                balance += amount;
            }

            else if (amount < 0) {

                if (Math.abs(amount) <= balance) {
                    balance += amount;
                }

                else {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                }
            }

            JOptionPane.showMessageDialog(null,
                    "Outstanding Balance: " + balance);

            amount = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter transaction amount (0 to stop):")
            );
        }

        JOptionPane.showMessageDialog(null,
                "Final Balance: " + balance);
    }
}