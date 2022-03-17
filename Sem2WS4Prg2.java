import java.util.*;

public class Sem2WS4Prg2 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of characters");
            int n = in.nextInt();
            double rn = 0;

            char wor[] = new char[n]; int i = 0, it = 1;
            System.out.println("Enter the characters");
            for(i = 0; i<n; i++)
                wor[i] = in.next().charAt(0);
            
            for(i = 0; i < n; i++, it++){
                if(wor[i] == (wor[wor.length-it]))
                    rn++;
                else{
                    rn = -1;
                    break;
                }
            }
            if(rn == -1)
                System.out.println("Word isn't palindrome");
            else
                System.out.println("Word is palindrome");
        }
    }
}