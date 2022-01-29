import java.util.*;

class Sem2Rec4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String j, pw;
        char c;
        int i;
        String newsent = "", word = "";
        char wo;
        System.out.println("Enter a string");
        j = in.next();
        in.close();
        for (i = 0; i < j.length(); i++) {
            c = j.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                break;
        }
        pw = j.substring(i) + j.substring(0, i) + "ay";
        j = j + " ";
        for (i = 0; i < j.length(); i++) {
            wo = j.charAt(i);
            if (wo != ' ')
                word = wo + word;
            else if (wo == ' ') {
                newsent = newsent + " " + word;
                word = "";
            }
        }
        System.out.println("Piglatin form of the word ~ " + pw);
        System.out.println(" The string with reversed characters in each word is ~ " + newsent);
    }
}