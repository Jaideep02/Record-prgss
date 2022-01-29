import java.util.*;
public class Sem2Rec6 {
    public static boolean isVowel(char ch) {
        char letter = Character.toUpperCase(ch);
        
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
            return true;  
        return false;       
    }
    
    public static void main(String args[]) {
        String cities[] = new String[10];
        int i=0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter 10 city names");
            for (i = 0; i < cities.length; i++) 
                cities[i] = in.nextLine();
        }
        System.out.println("\n\nThe cities which start with a consonant & end with a vowel ~ ");

        for (i = 0; i < cities.length; i++) {

            if (!isVowel(cities[i].charAt(0)) && isVowel(cities[i].charAt(cities[i].length() - 1)))
                System.out.println(cities[i]);
        }
        System.out.println("\n\nThe cities which end with \"uru\" ~ ");
        for (i = 0; i < cities.length; i++) {
            String tst = cities[i];
            if (tst.endsWith("uru")) {
                System.out.println(cities[i]);
            }
        }
        System.out.println("\n\n");
    }
}
