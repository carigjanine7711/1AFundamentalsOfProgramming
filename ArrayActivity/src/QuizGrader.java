// Student's answer na ita-type sa input: ABBDCCCBAA
// Import ng Scanner class para makapag-read ng input mula sa keyboard
import java.util.Scanner;

public class QuizGrader { // Class na nag-gragrade ng quiz ng student by comparing ang sagot niya sa answer key
    public static void main(String[] args) { // main method: dito nagsisimulang mag-run ang program

        // Gumawa ng Scanner object para mabasa ang tina-type ng user sa console
        Scanner sc = new Scanner(System.in);

        // Part 1: answerKey ay naka-hardcode na (ito ang tamang sagot, hindi na ito iniinput)
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        // studentAnswers: walang laman muna, 10 slots; mapupunan ito ng input ng user
        char[] studentAnswers = new char[answerKey.length];

        // I-print muna ang answer key para kita ng user ang tamang sagot
        System.out.println("--- Answer Key ---");
        // Iikot sa bawat item ng answer key para i-print
        for (int i = 0; i < answerKey.length; i++) {
            // Format: question number (i + 1 dahil 0 ang simula ng index) at ang tamang sagot
            System.out.print((i + 1) + ":" + answerKey[i] + "  ");
        }
        // Bagong linya pagkatapos ng listahan
        System.out.println("\n");

        // Hingin ang student answers; uulit hanggang valid ang input
        while (true) {
            // Tanong na may example para alam ng user ang format
            System.out.print("Enter student answers (" + answerKey.length + " letters A-D, e.g. ABCDABCDAB): ");
            // Basahin ang buong linya, tanggalin ang spaces, at gawing uppercase para pantay ang 'a' at 'A'
            String line = sc.nextLine().replace(" ", "").toUpperCase();
            // Check kung eksaktong 10 ang haba
            if (line.length() != answerKey.length) {
                System.out.println("  Must be exactly " + answerKey.length + " letters. Try again.");
                continue; // Balik sa umpisa ng loop para magtanong ulit
            }
            // Check kung puro A hanggang D lang ang laman
            if (!line.matches("[A-D]+")) {
                System.out.println("  Only letters A-D are allowed. Try again.");
                continue;
            }
            // Valid na: hiwa-hiwalayin ang string sa bawat letra at ilagay sa studentAnswers
            studentAnswers = line.toCharArray();
            // Lumabas na sa loop
            break;
        }

        // Part 2: correctCount ay bilang ng tamang sagot, 0 muna sa simula
        int correctCount = 0;
        // Title ng missed questions (Bonus: Missed Questions Tracker)
        System.out.println("\n--- Missed Questions ---");
        // Iikot sa bawat question
        for (int i = 0; i < answerKey.length; i++) {
            // Kapag magkapareho ang sagot ng student at ng key, dagdagan ang correctCount
            if (studentAnswers[i] == answerKey[i]) {
                correctCount++;
            } else {
                // Kapag mali, i-print kung anong question, ano ang sinagot, at ano ang tama
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswers[i]
                        + "', correct answer is '" + answerKey[i] + "'");
            }
        }

        // Part 3: I-cast sa double para hindi maputol ang decimal (7 / 10 sa int ay 0), tapos i-multiply sa 100
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;
        // I-print ang result
        System.out.println("\n--- Quiz Result ---");
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score: " + scorePercentage + "%");

        // Part 4: Pass kapag 70.0 pataas, bagsak kapag mas mababa
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // Isara ang Scanner kapag tapos na
        sc.close();
    }
}