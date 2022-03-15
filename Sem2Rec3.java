import java.util.*;

public class Sem2Rec3 {

    public static void main(String args[]) {
        String sent, newsent = "", word = "";
        char ch;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        sent = in.nextLine();
        in.close();
        sent = sent + " ";
        for (i = 0; i < sent.length(); i++) {
            ch = sent.charAt(i);
            if (ch != ' ')
                word = ch + word;
            else if (ch == ' ') {
                newsent = newsent + " " + word;
                word = "";
            }
        }
        System.out.println("The string with reversed characters in each word is \n" + newsent);
    }
}
