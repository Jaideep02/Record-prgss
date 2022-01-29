import java.util.*;

class EWorld {
    String name;
    double totCost, dis, amt;

    EWorld() {
        name = null;
        totCost = 0.0;
        dis = 0.0;
        amt = 0.0;
    }

    EWorld(String n, double p) {
        name = n;
        totCost = p;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name and total cost of items purchased");
        name = in.next();
        totCost = in.nextDouble();
        
        in.close();
    }

    void compute() {
        if (totCost <= 5000)
            dis = 5.0 / 100 * totCost;
        else if (totCost > 5000 && totCost <= 20000)
            dis = 12.0 / 100 * totCost;
        else if (totCost > 20000 && totCost <= 50000)
            dis = 20.0 / 100 * totCost;
        else if (totCost > 50000)
            dis = 30.0 / 100 * totCost;
        amt = totCost - dis;

    }

    void display() {
        System.out.println("Name\tDiscount\tAmount");
        System.out.println(name + "\t" + dis + "\t\t" + amt);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        EWorld jai = new EWorld();
        jai.input();
        jai.compute();
        jai.display();

        /* From here parameterized constructor starts :-
        String n1;
        double p1;

        System.out.println("Enter the name and total cost of items purchased");

        n1 = in.next();
        p1 = in.nextDouble();

        EWorld abc = new EWorld(n1, p1);
        abc.compute();
        abc.display();
        */

        in.close();
    }
}