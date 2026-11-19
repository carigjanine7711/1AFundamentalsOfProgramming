import javax.swing.JOptionPane;

public class loopAct1Joptionpane {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter 10 numbers separated by spaces:");

        String[] numbers = input.split(" ");

        int num = Integer.parseInt(numbers[0]);

        int highest = num;
        int lowest = num;

        for (int d = 1; d < 10; d++) {

            num = Integer.parseInt(numbers[d]);

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest +
                        "\nLowest number: " + lowest);
    }
}