import java.util.*;

public class Sem2Rec5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        double sum = 0;
        int i, max = 0;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Sum ~ " + sum);
        System.out.println("Highest value of the array is ~ " + max);
    }
}
