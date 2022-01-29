import java.util.*;

class Record_Result {
    String name, grade;
    int total, per;

    void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your total marks scored out of 600");
        total = in.nextInt();
        in.close();
    }

    void calculate() {
        per = (total*100) /600;
        if (per >= 85)
            grade = "Distinction";
        else if (per >= 60 && per < 85)
            grade = "First Class";
        else if (per >= 50 && per < 60)
            grade = "Second Class";
        else if (per >= 35 && per < 50)
            grade = "Third Class";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("Your name : " + name);
        System.out.println("Your total marks scored : " + total);
        System.out.println("Your percentage : " + per);
        System.out.println("Your grade : " + grade);
    }

    public static void main(String args[]) {
        Record_Result stud = new Record_Result();
        stud.inputData();
        stud.calculate();
        stud.display();
    }
}