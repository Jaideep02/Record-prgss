import java.util.*;

public class Sem2WS2PrgQ6 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String z = "", rev = "";
            System.out.println("Enter the word");
            z = in.next();

            for (int i = (z.length() - 1); i >= 0; --i) 
                rev += z.charAt(i);

            if (z.toLowerCase().equals(rev.toLowerCase()))
                System.out.println(z + " is a Palindrome String.");
            else
                System.out.println(z + " is not a Palindrome String.");
        }
    }
}
