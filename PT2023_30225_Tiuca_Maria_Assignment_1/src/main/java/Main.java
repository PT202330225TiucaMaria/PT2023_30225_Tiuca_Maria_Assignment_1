import Model.Polinom;
import Functions.Functions;
import java.util.Scanner;

//4*x^6-2*x^5+x^4-x+1
//        -4*x^6+x-2

public class Main {
    public static void main( String[] args ) {
       // new GUI();
        Scanner scan = new Scanner(System.in);
        String Pol1 = scan.nextLine();
        String Pol2 = scan.nextLine();
        Polinom p1=new Polinom(Pol1);
        Polinom p2=new Polinom(Pol2);
        Polinom rezultat = Functions.Adunare(p1, p2);
        System.out.println("ADUNARE: "+rezultat.toString());

        rezultat = Functions.Scadere(p1, p2);
        System.out.println("SCADERE: "+rezultat.toString());

        rezultat = Functions.Inmultire(p1, p2);
        System.out.println("INMULTIRE: "+rezultat.toString());

        rezultat = Functions.Derivare(p1);
        System.out.println("DERIVARE: "+rezultat.toString());

        rezultat = Functions.Integrare(p1);
        System.out.println("INTEGRARE: "+rezultat.toString());


    }
}

