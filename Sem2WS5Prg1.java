import java.util.*;

public class Sem2WS5Prg1 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int arr[] = new int[15];
            int i = 0, div = 0, neg = 0, sing = 0;
            System.out.println("Enter 15 numbers");
            for (i = 0; i < 15; i++) {
                arr[i] = in.nextInt();

                if (arr[i] >= -9 && arr[i] <= 9)
                    sing++;

                if (arr[i] % 5 == 0)
                    div++;

                if (arr[i] < 0)
                    neg++;

            }
            System.out.println("No. of values divisible by 5 ~ " + div);
            System.out.println("No. of values which are negative ~ " + neg);
            System.out.println("No. of values which are single digit ~ " + sing);

        }
    }
}
