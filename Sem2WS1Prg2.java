import java.util.*;

public class Sem2WS1Prg2 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int spaces = 0, i = 0, tot = 0;
            System.out.println("Enter a sentence");
            String line = in.nextLine();
            tot = line.length();
            char arr[] = line.toCharArray();
            System.out.println("\nNumber of characters are ~ ");
            for (i = 0; i < line.length(); ++i) {
                String s = "";
                while (i < line.length() && arr[i] != 32) {
                    s = s + arr[i];
                    i++;
                }
                if (s.length() > 0)
                    System.out.println(s + "  --> " + s.length());
            }
            for (i = 0; i < line.length(); ++i) {
                char ch = line.charAt(i);
                if (ch == 32)
                    ++spaces;
                    
            }
            System.out.println("\nNumber of spaces are ~ " + spaces);
            System.out.println("Total number of characters are ~ "+tot);
        }
    }
}