import java.util.*;

public class Sem2WS4Prg1 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            double arr[] = new double[28];

            System.out.println("Enter Feb daily temperatures:");
            for (int i = 0; i < 28; i++) {
                arr[i] = in.nextDouble();
            }

            double avg = 0.0;
            int l = 0, h = 0;
            for (int i = 0; i < 28; i++) {
                if (arr[i] < arr[l])
                    l = i;

                if (arr[i] > arr[h])
                    h = i;

                avg += arr[i];
            }

            System.out.println("Hottest day = " + (h + 1));
            System.out.println("Coldest day = " + (l + 1));
            System.out.println("Average Temperature = " + (avg/28));
        }
    }
}
