import java.util.Scanner;

class Agile_Network {
    String name;
    int speed;
    double amount;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter the speed of your network");
        speed = in.nextInt();
        in.close();
    }

    void calculate() {
        if (speed == 200)
            amount = 275 + 1000;
        else if (speed == 300)
            amount = 500 + 1000;
        else if (speed == 500)
            amount = 750 + 1000;
    }

    void display() {
        System.out.println("Your Name\t\t|\tYour Speed of network\t\t|\tThe amount to be paid by you");
        System.out.println(
                "~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(name + "\t\t\t|\t\t" + speed + "\t\t\t|\t\t" + amount);
    }

    public static void main(String args[]) {
        Agile_Network jai = new Agile_Network();
        jai.accept();
        jai.calculate();
        jai.display();
    }
}
