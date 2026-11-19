
public class CoffeeShopAnalyzer { // Class na nag-aanalyze ng weekly sales ng Java Beans coffee shop

    public static void main(String[] args) { // main method: dito nagsisimulang mag-run ang program

        // 1. Initialize the array
        // weeklySales array: dito nakalagay ang cups na nabenta bawat araw (Monday hanggang Sunday)
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        // daysOfWeek array: mga pangalan ng araw. Parallel ito sa weeklySales, kaya pareho ang index (index 0 = Monday)
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Part 2: Printing the Data
        // Title muna bago i-print ang listahan ng sales
        System.out.println("--- Daily Sales ---");
        // for loop: ang i ay nagsisimula sa 0 at titigil bago umabot sa length ng array (7 items)
        for (int i = 0; i < weeklySales.length; i++) {
            // Kinukuha ang day name at sales gamit ang parehong index i, tapos ipi-print nang magkasama
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        // Part 3: Calculating Total and Average
        // totalSales: dito iipunin ang sum ng lahat ng sales, kaya 0 ang simula
        int totalSales = 0;
        // for-each loop: kukunin ang bawat value sa weeklySales one by one (hindi na kailangan ng index)
        for (int dailySale : weeklySales) {
            // Idagdag ang sales ng araw na ito sa running total
            totalSales += dailySale;
        }

        // I-cast sa double para may decimal ang result. Kung hindi, int division ang mangyayari at mapuputol ang decimal
        double averageSales = (double) totalSales / weeklySales.length;
        // \n para may blank line sa pagitan ng mga section
        System.out.println("\n--- Weekly Summary ---");
        // I-print ang total cups na nabenta sa buong week
        System.out.println("Total Sales: " + totalSales + " cups");
        // I-print ang average cups kada araw
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Part 4 & Bonus: Find the maximum and minimum sales values
        // Assume muna na ang first day (index 0) ang pinakamataas at pinakamababa, tapos ico-compare sa iba
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];
        // bestDay at worstDay: para ma-track kung anong araw ang may max at min na sales
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];
        // Nagsisimula sa index 1 dahil index 0 na ang starting value natin, kaya hindi na kailangang i-compare sa sarili
        for (int i = 1; i < weeklySales.length; i++) {
            // Check kung mas mataas ang sales ngayon kaysa sa kasalukuyang max
            if (weeklySales[i] > maxSales) {
                // Kapag mas mataas, update ang max value
                maxSales = weeklySales[i];
                // Update din ang best day para tugma sa bagong max
                bestDay = daysOfWeek[i];
            }
            // Check kung mas mababa ang sales ngayon kaysa sa kasalukuyang min
            if (weeklySales[i] < minSales) {
                // Kapag mas mababa, update ang min value
                minSales = weeklySales[i];
                // Update din ang worst day para tugma sa bagong min
                worstDay = daysOfWeek[i];
            }
        }

        // Title ng section para sa best at worst days
        System.out.println("\n--- Bests and Worsts ---");
        // I-print ang araw na pinakamarami ang nabenta at kung ilang cups
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        // I-print ang araw na pinakakaunti ang nabenta at kung ilang cups
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}