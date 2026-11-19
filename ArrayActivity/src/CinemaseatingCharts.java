// I-import ang Arrays class para magamit ang deepToString()
// Kapag walang import na ito, magka-compile error
import java.util.Arrays;


public class CinemaseatingCharts { // Ang class ng program


    public static void main(String[] args) { // Dito nagsisimula ang program

        // Gumawa ng 2D String array na may rows at columns
        // Ang bawat inner { } ay isang row
        String[][] seats = {

                {"Alice", "Bob", "Charlie"},   // Row 1 (index 0)

                {"David", "Emma", "Frank"}     // Row 2 (index 1)

        }; // Tapos na ang array. Huwag kalimutan ang semicolon

        // Kunin ang nasa second row, third column
        // Unang bracket = row, pangalawang bracket = column
        // Bawas isa ang index sa position, kaya [1][2]. Ang lalabas ay "Frank"
        System.out.println(seats[1][2]);

        // Si Bob ay nasa first row, second column, so [0][1] ang location niya
        // Palitan siya ng "Vacant"
        seats[0][1] = "Vacant";

        // I-print ang buong 2D array sa isang line gamit ang deepToString()
        // Kung println(seats) lang, memory address ang lalabas at hindi ang mga pangalan
        System.out.println(Arrays.deepToString(seats));

    } // Tapos na ang main method
} // Tapos na ang class