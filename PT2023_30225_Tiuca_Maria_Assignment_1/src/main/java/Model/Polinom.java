package Model;

import java.util.*;
import java.util.regex.*;
public class Polinom {

    private HashMap<Integer, Double>Termeni;

    public Polinom(){
        Termeni = new HashMap<>();
    }

    public Polinom(String Pol) {
        Termeni = new HashMap<>();
        String PlusMinus = Pol.replace("-", "+-");
        Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
        Matcher matcher = pattern.matcher(PlusMinus);
        while(matcher.find()){
            String Monom =matcher.group();
            String[] Coef = Monom.split("([*a-zA-Z^])");
            if (Coef.length == 4) {
                Termeni.put(Integer.valueOf(Coef[3]), Double.valueOf(Coef[0]));
            }
            if (Coef.length == 3) {
                if (Coef[0].equals("-"))
                    Termeni.put(Integer.valueOf(Coef[2]), (double) -1);
                else
                    Termeni.put(Integer.valueOf(Coef[2]), 1.0);
            }
            if (Coef.length == 1) {
                if (Coef[0].equals("")) continue;
                else {
                    char c = Monom.charAt(Monom.length()-1);
                    if (c == 'x') {
                        Termeni.put(1,Double.valueOf(Coef[0]));
                    } else {
                        if (Coef[0].equals("-"))
                            Termeni.put(1, (double) -1);
                        else
                            Termeni.put(0, Double.valueOf(Coef[0]));
                    }
                }
            }
            if (Coef.length == 0)
                    Termeni.put(1, (double) 1);
        }
        System.out.println(Termeni);
    }
    public HashMap<Integer, Double> getTermeni() {
        return Termeni;
    }
    public String toString(){
        String Rez="";
        for(Integer Putere:this.Termeni.keySet()){
            if(this.Termeni.get(Putere)!=null){
                if(Rez!=null&&this.Termeni.get(Putere)>0)
                    Rez+="+";
                if(Putere!=1) {
                    if (this.Termeni.get(Putere) == 1)
                        Rez += "x^" + Putere;
                    if (this.Termeni.get(Putere) == -1)
                        Rez += "-x^" + Putere;
                    if (this.Termeni.get(Putere) != 1 && this.Termeni.get(Putere) != -1 && Putere!=0)
                        Rez += this.Termeni.get(Putere) + "*x^" + Putere;
                    if(Putere==0)
                        Rez += this.Termeni.get(Putere);
                }
                else{
                    if (this.Termeni.get(Putere) == 1)
                        Rez += "x";
                    if (this.Termeni.get(Putere) == -1)
                        Rez += "-x";
                    if (this.Termeni.get(Putere) != 1 && this.Termeni.get(Putere) != -1)
                        Rez += this.Termeni.get(Putere) + "*x";
                }
            }
        }
        return Rez;
    }


}




