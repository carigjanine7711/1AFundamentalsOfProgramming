import javax.swing.JOptionPane;

public class loopAct2Joptionpane {
    public static void main(String[] args) {

        String output = "";

        for (int e = 2; e <= 100; e += 2) {

            output += e + " ";

            if (e % 20 == 0) {
                output += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}