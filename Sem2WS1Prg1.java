import java.util.*;

public class Sem2WS1Prg1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int vowels = 0, consonants = 0, digits = 0, spaces = 0;

            System.out.println("Enter a sentence");
            String line = in.nextLine();

            line = line.toLowerCase();
            for (int i = 0; i < line.length(); ++i) {
                char ch = line.charAt(i);

                // check if character is any of a, e, i, o, u
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                    ++vowels;
                else if ((ch >= 'a' && ch <= 'z')) // check if character is in between a to z
                    ++consonants;
                else if (ch >= '0' && ch <= '9') // check if character is in between 0 to 9
                    ++digits;
                else if (ch == ' ') // check if character is a white space
                    ++spaces;
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("White spaces: " + spaces);
        }
    }
}
