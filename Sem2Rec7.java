import java.util.Scanner;

public class Sem2Rec7
{
    public static void main(String args[]) {
        
        try (Scanner in = new Scanner(System.in)) {
            int n;
            System.out.print("The length of the array ~ ");
            n = in.nextInt();
            float arr[] = new float[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.print("Enter number to search: ");
            int z = in.nextInt();
            
            int l = 0, h = arr.length - 1, ind = -1;
            while (l <= h) {
                int m = (l + h) / 2;
                if (arr[m] < z)
                    l = m + 1;
                else if (arr[m] > z)
                    h = m - 1;
                else {
                    ind = m;
                    break;
                }
                    
            }
            
            if (ind == -1)
                System.out.println("Element not found");
            else
                System.out.println(z + " found at position " + (ind+1));
        }
    }
}