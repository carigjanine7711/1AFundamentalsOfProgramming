import javax.swing.JOptionPane;

public class militaryAcademyJOption {

    public static void main(String[] args) {

        String heightInput = JOptionPane.showInputDialog("Enter height in cm: ");
        double height = Double.parseDouble(heightInput);

        String ageInput = JOptionPane.showInputDialog("Enter age: ");
        int age = Integer.parseInt(ageInput);

        String citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N): ").toUpperCase();

        String recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R/N): ").toUpperCase();

        // Acceptance decision
        String result;

        if ((!citizenship.equals("C") && !citizenship.equals("N")) ||
                (!recommendee.equals("R") && !recommendee.equals("N"))) {
            result = "Invalid code entered.";
        }
        else if (recommendee.equals("R")) {
            result = "Applicant is accepted.";
        }
        else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            result = "Applicant is accepted.";
        }
        else {
            result = "Applicant is rejected.";
        }

        JOptionPane.showMessageDialog(null, result);

    }
}

