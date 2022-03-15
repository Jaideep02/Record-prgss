import java.util.*;
public class Sem2WS2PrgQ4 {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            double arr[] = new double[20];
            int i = 0;
            double sum = 0, max = 0 ;
            System.out.println("Enter the 20 numbers");
            for(i = 0; i<arr.length; i++){
                arr[i] = in.nextDouble();
            }
            for(i = 0; i<arr.length;i++){
                sum += arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("\nSum ~ "+sum+"\nHighest number ~ "+max);
        }
    }    
}
