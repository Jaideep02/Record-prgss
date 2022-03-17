import java.util.*;
public class Sem2WS4Prg4{
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a name of 3 or more words:");
            String str = in.nextLine();

            System.out.print(str.charAt(0) + ".");
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    System.out.print(str.charAt(i+1)+".");
                }
            }
        }
    }
}