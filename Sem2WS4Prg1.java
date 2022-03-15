import java.util.*;
public class Sem2WS4Prg1 {
   public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int i = 0; 
    int arr[] = new int[28]; 
    System.out.println("Enter the temperatures of 28 days in the month of Feb");
    for(i=0; i<28; i++)
        arr[i] = in.nextInt();

    int hd = arr[0];
    int cd = arr[0];
    double avg = 0;
    for(i=1; i<28; i++){
        if(arr[i] > hd)
            hd = i;
        else if(arr[i] < cd)
            cd = i;

        avg += arr[i];
    }
    avg = avg/28;
    System.out.println("Average ~ "+avg);
    System.out.println("Coldest day ~ "+(cd+1));
    System.out.println("Hottest day ~ "+(hd+1));
   }    
}
