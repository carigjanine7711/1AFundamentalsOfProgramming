import java.util.Scanner;

public class labQuiz2 {

    public static void main (String[] args){
        String msg;
        String name;
       String kgofPork;
       double ratioOfSoy;
       double ratioOfVinegar;

       double soy = 0.5;
       double vinegar = 0.33;
       double pork = 1.5;

       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Welcome to Adobo Cooking Show");
       name = inputDevice.nextLine();
       System.out.print("Enter your name ");
       kgofPork = inputDevice.nextLine();
       System.out.print("How many kilo of pork will you cook? ");
       ratioOfSoy = inputDevice.nextDouble();
       System.out.print("The ratio of soy sauce for " + pork + "kg is = " + soy);
       ratioOfVinegar = inputDevice.nextDouble();
       System.out.print("The ratio of vinegar for " + pork + "kg is = " + vinegar);


    }
}
