import java.util.*;
public class Sem2WS5Prg3 {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your mail id");
            String mail = in.nextLine();
            
            String user = mail.substring(0, mail.indexOf("@"));
            String dom = mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
            String ext = mail.substring(mail.indexOf(".")+1);

            System.out.println(user);
            System.out.println(dom);
            System.out.println(ext);
        }
    }
}
