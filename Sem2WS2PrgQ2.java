import java.util.*;

class Sem2WS2PrgQ2 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int seano, i = 0;
            int fo = -1;
            System.out.print("Number of elements to be inputted ~ ");
            int n = in.nextInt();
            int no[] = new int[n];
            System.out.println("Enter the numbers");
            for (i = 0; i < no.length; i++)
                no[i] = in.nextInt();

            System.out.println("Enter the number to search ");
            seano = in.nextInt();
            for (i = 0; i < no.length; i++) {
                if (no[i] == seano) {
                    fo = i;
                    break;
                }
            }  
            if (fo >= 0)
                System.out.println(seano + " is found at position " + (fo + 1));
            else
                System.out.println(seano + " is not found");
        }
    }
}