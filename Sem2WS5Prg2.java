import java.util.*;

public class Sem2WS5Prg2 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Number of words to enter ~ ");
            int r = in.nextInt(), i = 0, un = r;
            String wor[] = new String[r];

            System.out.println("Enter the words");
            for (i = 0; i < r; i++)
                wor[i] = in.nextLine();

            System.out.println("Words having odd length are ~ ");
            for (i = 0; i < r; i++) {
                if (wor[i].length() % 2 == 0)
                    un--;
                else
                    System.out.print(wor[i] + ", ");
            }
            System.out.println("\nFrequency of words with odd length ~ " + un);

        }
    }
}
