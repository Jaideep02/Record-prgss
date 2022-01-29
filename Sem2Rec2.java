import java.util.*;
class Sem2Rec2
{
    public static void main(String args[])
    {
        String nm;
        int c=0,i=0;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a sentence");
            nm=in.nextLine();
        }
        nm = nm.toLowerCase();
        System.out.println("\nThe consecutive letters are -: ");
        while(i<nm.length()-1)
        {
            if(nm.charAt(i)-nm.charAt(i+1)==-1)
            {
                System.out.println(""+nm.charAt(i)+nm.charAt(i+1));
                c++;
            }
            i++;
        }
        System.out.println("\nFreq. of consecutive letters ~ "+c);
    }
}