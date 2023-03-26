import Model.Polinom;
import Functions.Functions;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
       // new GUI();
        Scanner scan = new Scanner(System.in);
        String Pol1 = scan.nextLine();
        String Pol2 = scan.nextLine();
        Polinom p1=new Polinom(Pol1);
        Polinom p2=new Polinom(Pol2);
        Polinom rezultat = Functions.Adunare(p1, p2);
        System.out.println(rezultat.toString());
    }
}

