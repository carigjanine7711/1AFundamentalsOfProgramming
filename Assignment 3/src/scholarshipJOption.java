import javax.swing.JOptionPane;

public class scholarshipJOption {

    public static void main (String[] args){

        String nsatInput = JOptionPane.showInputDialog("Enter NSAT score: ");
        double nsat = Double.parseDouble(nsatInput);

        String salaryInput = JOptionPane.showInputDialog("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(salaryInput);

        String entranceInput = JOptionPane.showInputDialog("Enter entrance exam score: ");
        double entrance = Double.parseDouble(entranceInput);

        //Average calculation
        double average = (nsat + entrance) / 2;

        //Scholarship decision
        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Application status: Rejected";
        }
        else if (salary <= 3500 && average >= 91) {
            result = "Application status: Accepted";
        }
        else {
            result = "Application status: Further study";
        }

        JOptionPane.showMessageDialog(null, result);

    }
}