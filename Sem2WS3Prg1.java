import java.util.*;
public class Sem2WS3Prg1 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String ab[] = new String[5];
            int i;
            for(i = 0; i < ab.length; i++)
                ab[i] = in.nextLine();

            String tmp = ab[0];
            for(i = 0; i < ab.length; i++){
                if(ab[i].length() > tmp.length()){
                    tmp = ab[i];
                }
            }

            System.out.println("Longest word ~ "+tmp+" length ~"+tmp.length());
        }
    }

}
