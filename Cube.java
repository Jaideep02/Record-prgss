import java.util.Scanner;
class Cube {
    public int findCube(int x){
        int c = x * x * x;
        return c;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n, cb, i;
        Cube j25 = new Cube();

        for(i=1; i<=10; i++){
            System.out.print("Enter a number ~ ");
            n = in.nextInt();

            cb = j25.findCube(n);
            
            System.out.println("Cube of "+n+" is ~ "+cb);
            in.close();
        }
    }
}
