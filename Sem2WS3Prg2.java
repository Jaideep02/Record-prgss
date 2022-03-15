import java.util.*;

public class Sem2WS3Prg2 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String z = in.next();
            z = z.toUpperCase();

            if (z.charAt(0) == z.charAt(z.length() - 1))
                System.out.println("Hoomanity");
            else
                System.out.println("I am born through the sun");

        }
    }
}
