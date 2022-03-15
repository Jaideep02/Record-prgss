/*Design a class to accept a sentence and convert cases of letters only, leaving other 
characters as it is. Display both the string entered and the new String. 
Sample Input : Today is Monday, 31st day
Sample Output : tODAY IS mONDAY, 31ST DAY*/
import java.util.*;
public class Sem2Rec1 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String j, a="";
        char e;
        int i;
        System.out.println("Enter a sentence");
        j=in.nextLine();
        in.close();
        for(i=0;i<j.length();i++)
        {
            e=j.charAt(i);
            if(e>=65 && e<=90)
                a=a+(char)(e+32);
            else if(e>=97 && e<=122)
                a=a+(char)(e-32);
            else
                a=a+e;
        }
        System.out.println("Sentence entered : " +j);
        System.out.println("Element".startsWith("e")
        );

    }
}
