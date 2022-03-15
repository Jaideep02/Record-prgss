import java.util.*;
class Sem2WS2PrgQ3 {
    public static boolean isVowel(char ch) {
        char letter = Character.toUpperCase(ch);
        
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
            return true;  
        return false;       
    }
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            char arr[] = new char[10];
            int vow = 0, cap = 0, i = 0;
            System.out.println("Enter 10 characters ~ ");
            for(i = 0;i<arr.length;i++)
                arr[i] = in.nextLine().charAt(0);
            
            for(i = 0; i<arr.length; i++){

                if(Character.isUpperCase(arr[i]))
                    cap++;
                if(isVowel(arr[i]))
                    vow++;
            }
            System.out.println("Total cap letters ~ "+cap);
            System.out.println("Total vowels ~ "+vow);
        }
    }
}