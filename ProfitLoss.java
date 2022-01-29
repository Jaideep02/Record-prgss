import java.util.Scanner;

public class ProfitLoss {
    double cp, sp, per;

    public ProfitLoss(double sellingprice, double costprice) {
        sp = sellingprice;
        cp = costprice;
    }

    void caldisplay() {
        if (sp > cp) {
            per = ((sp - cp) / cp) * 100;

            System.out.println("\n Profit Percentage =  " + per + "%");
        }
        else if (cp > sp) {
            per = ((cp - sp) / cp) * 100;

            System.out.println("\n Loss Percentage =  " + per + "%");
        } 
        else
            System.out.println("\n No Profit No Loss! ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cp, sp;
        System.out.print(" Please Enter the Cost Price : ");
        cp = in.nextDouble();

        System.out.print(" Please Enter the Selling Price : ");
        sp = in.nextDouble();

        ProfitLoss jai = new ProfitLoss(sp, cp);
        jai.caldisplay();
        
        in.close();
    }
}