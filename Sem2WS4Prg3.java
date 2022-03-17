import java.util.*;
public class Sem2WS4Prg3 {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any sentence: ");
            String s=in.nextLine();
            s = s+" ";
            int l=s.length();
            int pos=0, woo=0;
            char ch1;
            String w;
            for(int i=0; i<l; i++){
                ch1 = s.charAt(i);
                if(ch1 == ' '){
                    w = s.substring(pos,i); // extracting words one by one
                    if(w.charAt(0) == 'a' || w.charAt(0) == 'A'){
                        System.out.println(w+"  "); 
                        woo++;
                    }
                    pos = i+1;
                }
            }
            System.out.println("Number of words that begin with A are ~ "+woo);
        }
   }
}