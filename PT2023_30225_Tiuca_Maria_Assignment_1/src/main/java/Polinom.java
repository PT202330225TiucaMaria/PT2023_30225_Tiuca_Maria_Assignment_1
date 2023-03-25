import java.util.*;
public class Polinom {
    HashMap<Integer,Integer>termeni=new HashMap<Integer,Integer>();     //cheie=putere,coef=valoare
    public Polinom() {
        Scanner scan = new Scanner(System.in);
        String polinom = scan.nextLine();
        String plusminus= polinom.replace("-","+-");
        String[] result= plusminus.split("([+])",0);
        for (String monom : result) {
            String[] coef_putere=monom.split("([*[a-zA-Z]^])",0); // |-se trateaza mai multe cazuri
            if(coef_putere.length==4){
                Integer putere=Integer.valueOf(coef_putere[3]);
                if(coef_putere[0]=="-"){
                    termeni.put(putere,-1);
                }
                else{
                    Integer coef=Integer.valueOf(coef_putere[0]);
                    termeni.put(putere,coef);
                }
            }
            if(coef_putere.length==3){
                Integer putere=Integer.valueOf(coef_putere[2]);
                if(coef_putere[0]=="-")
                    termeni.put(putere,-1);
                else
                    termeni.put(putere,1);
            }
            if(coef_putere.length==1){
                Integer coef=Integer.valueOf(coef_putere[0]);
                if(coef_putere[0]=="x")
                    termeni.put(1,coef);
                else
                    termeni.put(0,coef);
            }
        }
        System.out.println(termeni);
    }

    //OPERATII

}
