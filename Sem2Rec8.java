import java.util.*;

public class Sem2Rec8 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int nos[] = new int[10];
            int i = 0, sum = 0, prod = 1;
            System.out.println("Enter 10 numbers");
            for (i = 0; i < nos.length; i++){
                nos[i] = in.nextInt();
                if(nos[i]==0)
                    System.exit(0);
                }
            for (i = 0; i < nos.length; i++) {
                if ((nos[i] % 2 == 0) && (nos[i] >= 0))
                    sum += nos[i];
            }
            for (i=0; i<nos.length; i++){
                if((nos[i] >= 0) && (nos[i]<10))
                    prod *= nos[i];
            }
            System.out.println("\nSum of positive even numbers ~ " + sum + "\n");
            System.out.println("\nProduct of single digit positive numbers ~ " + prod + "\n");
            char c1='z';
int c2=c1-2;
System.out.println( (char)c2 );
            
        }
    }
}
