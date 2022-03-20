import java.util.*;
public class Sem2WS5Prg4 {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the password to verify");
            String pass = in.nextLine();
            int ck = 0;

            if((pass.charAt(0) >= 'a' && pass.charAt(0) <= 'z') || (pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z')){
                System.out.println("\u2713 Password starts with a letter");
                ck++;
            }
            else
                System.out.println("\u2717 Password doesn't start with a letter");

            if(pass.length() >= 8){
                System.out.println("\u2713 Password has above 8 characters");
                ck++;
            }
            else
                System.out.println("\u2717 Password has less than 8 characters");

            for(int i = 0; i < pass.length(); i++){
                if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                    System.out.println("\u2713 Password contains atleast a digit");
                    ck++;
                }
                else if(pass.charAt(i) == '$' || pass.charAt(i) == '@' || pass.charAt(i) == '_'){
                    System.out.println("\u2713 Password contains atleast a special character");
                    ck++;
                }
            }

            if(ck >= 4)
                System.out.println("Great job ! You have successfully created a safe & secure password");
            else
                System.out.println("You're missing a few parameters to qualify for making a safe password");
        }
    }
}