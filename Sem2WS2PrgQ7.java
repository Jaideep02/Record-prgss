import java.util.*;
public class Sem2WS2PrgQ7 {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            String zoom[] = new String[10];
            int i = 0;
            System.out.println("Enter 10 strings ~ ");
            for(i = 0; i<zoom.length; i++)
                zoom[i] = in.nextLine();
            
            System.out.println("The even length strings are ~ ");
            
            for(i = 0; i<zoom.length; i++){
            if(zoom[i].length()%2==0)
                System.out.println(zoom[i]);
            }
        }
        
    }
}
/*Define a class to accept and store 10 strings into the array and print the strings with even number of characters.*/
