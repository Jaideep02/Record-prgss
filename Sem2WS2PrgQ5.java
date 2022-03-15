import java.util.*;
public class Sem2WS2PrgQ5 {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter 2 words");
            String j = in.next();
            String aa = in.next();
            j = j.toUpperCase();
            aa = aa.toUpperCase();
            if(j.equals(aa)){
                System.out.println("Both strings are equal");
            }
            else if(j.length() == aa.length())
                System.out.println("Both strings have equal length");
            else if(j.length() > aa.length())
                System.out.println(j);
            else
                System.out.println(aa);
        }

    }
}
