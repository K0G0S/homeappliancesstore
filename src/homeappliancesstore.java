import java.lang.String;
import java.util.Scanner;

public class homeappliancesstore {

    public static String Namecomp, Idcomp;
    public static int Stuffcomp;

    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Grapse onoma etairias: ");
            String Namecomp = myObj.nextLine();
            if (Namecomp != " ") {
                System.out.println("To onoma tis etairias einai:");
                System.out.println(Namecomp);
            }

            {
                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Grapse dieu8insi tis etairias: ");
                String Idcomp = myObj2.nextLine();
                if (Idcomp != " ") {
                    System.out.println("To id tis etairias:");
                    System.out.println(Idcomp);
                }
            }

            {
                Scanner myObj3 = new Scanner(System.in);
                System.out.println("Posa atoma vouleuoun stin etairia: ");
                int Stuffcomp = Integer.parseInt(myObj3.nextLine());
                if (Stuffcomp > 0) {
                    System.out.println("To prosopiko tis etairias einai:");
                    System.out.println(Idcomp);
                }
            }
        } catch (Exception e) {
            System.out.println(Namecomp);
            System.out.println(Idcomp);
            System.out.println(Stuffcomp);
        }
    }
}