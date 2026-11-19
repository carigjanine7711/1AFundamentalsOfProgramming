public class DailytemperatureTracker {                // Bawat Java program ay nasa loob ng isang class.
                                                        // Dapat magkapareho ang pangalan ng class at ng file
    public static void main(String[] args) {         // Ang main method, dito nagsisimula ang program

        double[] temperatures = new double[5];       // Ang double[] ay "array ng mga double" (mga numerong may decimal)
        // Ang new double[5] ay naglalaan ng memory para sa eksaktong 5 elements, lahat ay nagsisimula sa 0.0
        // Hindi na mababago ang laki ng array pagkatapos ng line ito

        // Nagsisimula sa 0 ang index ng array, kaya ang unang elemento ay index 0, hindi 1
        temperatures[0] = 32.5;   // Araw 1: ilagay ang 32.5 sa unang slot (index 0)
        temperatures[1] = 34.0;   // Araw 2: ilagay ang 34.0 sa pangalawang slot (index 1)
        temperatures[2] = 31.8;   // Araw 3: ilagay ang 31.8 sa pangatlong slot (index 2)
        temperatures[3] = 33.2;   // Araw 4: ilagay ang 33.2 sa pang-apat na slot (index 3)
        temperatures[4] = 35.1;   // Araw 5: ilagay ang 35.1 sa panlimang slot (index 4, ang last valid na index)


        // Mag-loop mula index 0 hanggang dulo ng array
        // Ginamit ang .length para kahit magbago ang size ng array, gagana pa rin ang loop
        for (int i = 0; i < temperatures.length; i++) {

            // I-print ang temperature sa bawat index
            // Nilagyan ng (i + 1) para "Day 1" ang lumabas at hindi "Day 0"
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);

        } // Tapos na ang loop

        // I-update ang temperature ng third day (index 2) mula 31.8 ay 32.0
        temperatures[2] = 32.0;

        // I-print ang updated temperature ng third day. Dapat 32.0 na ang lalabas
        System.out.println("Updated Day 3: " + temperatures[2]);

    } // Tapos na ang main method
} // Tapos na ang class