import java.util.*;

public class Parking2W_Record {
    String name;
    int hrs;
    double charge;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter the number of hours your vehicle was parked");
        hrs = in.nextInt();
        in.close();
    }

    void calculate() {
        if (hrs <= 4)
            charge = 5 * hrs;
        else if (hrs <= 10)
            charge = (4 * 5) + ((hrs - 4) * 4);
        else if (hrs <= 18)
            charge = (4 * 5) + (6 * 4) + ((hrs - 10) * 3);
        else if (hrs > 18)
            charge = (4 * 5) + (6 * 4) + (8 * 3) + ((hrs - 18) * 2);
    }

    void display() {
        System.out.println("Your name : " + name);
        System.out.println("Number of hours your vehicle was parked : " + hrs);
        System.out.println("Amount you need to pay : \u20B9" + charge);
    }

    public static void main(String args[]) {
        Parking2W_Record jai = new Parking2W_Record();
        jai.accept();
        jai.calculate();
        jai.display();
    }
}
