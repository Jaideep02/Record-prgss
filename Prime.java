import java.util.*;
public class Prime {
    public static int isComposite(int n) {
        int i, ctr = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                ctr++;
            }
            /* System.out.println("Chk ctr :   " + ctr);  Used only to test, can comment it out! */
        }

        if (ctr == 2)
            return 0;
        else
            return 1;
    }
    public static void main(String args[]) {
        int a, y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        a = in.nextInt();
        
        y = Prime.isComposite(a);

        if (y == 0)
            System.out.println(a + " is a prime number");
        else
            System.out.println(a + " is a composite number");

        in.close();
    }
}
