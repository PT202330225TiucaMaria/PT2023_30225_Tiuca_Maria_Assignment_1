package Functions;
import Model.Polinom;

public class Functions {
    public static Polinom Adunare(Polinom P1, Polinom P2) {
        Polinom Rez = new Polinom();
        for (Integer PutereP1 : P1.getTermeni().keySet()) {
            Rez.getTermeni().put(PutereP1, P1.getTermeni().get(PutereP1));
        }
        for (Integer PutereP2 : P2.getTermeni().keySet()) {
            if (Rez.getTermeni().containsKey(PutereP2)) {
                Rez.getTermeni().put(PutereP2, Rez.getTermeni().get(PutereP2) + P2.getTermeni().get(PutereP2));
            } else
                Rez.getTermeni().put(PutereP2, P2.getTermeni().get(PutereP2));
        }
        System.out.println(Rez.getTermeni());
        return Rez;
    }
    public static Polinom Scadere(Polinom P1, Polinom P2) {
        Polinom Rez = new Polinom();
        for (Integer PutereP1 : P1.getTermeni().keySet()) {
            Rez.getTermeni().put(PutereP1, P1.getTermeni().get(PutereP1));
        }
        for (Integer PutereP2 : P2.getTermeni().keySet()) {
            if (Rez.getTermeni().containsKey(PutereP2)) {
                Rez.getTermeni().put(PutereP2, Rez.getTermeni().get(PutereP2) - P2.getTermeni().get(PutereP2));
            } else
                Rez.getTermeni().put(PutereP2,  - P2.getTermeni().get(PutereP2));
        }
        System.out.println(Rez.getTermeni());
        return Rez;
    }
    public static Polinom Inmultire(Polinom P1, Polinom P2) {
        Polinom Rez = new Polinom();
        for (Integer PutereP1 : P1.getTermeni().keySet()) {
            for (Integer PutereP2 : P2.getTermeni().keySet()) {
                Integer Putere=PutereP1+PutereP2;
                if(Rez.getTermeni().containsKey(Putere)){
                    Rez.getTermeni().put(Putere,Rez.getTermeni().get(Putere)+P1.getTermeni().get(PutereP1)*P2.getTermeni().get(PutereP2));
                }
                else
                    Rez.getTermeni().put(Putere,P1.getTermeni().get(PutereP1)*P2.getTermeni().get(PutereP2));
            }
        }
        System.out.println(Rez.getTermeni());
        return Rez;
    }
    public static Polinom Derivare(Polinom P1) {
        Polinom Rez = new Polinom();
        for (Integer PutereP1 : P1.getTermeni().keySet()) {
            if (PutereP1 - 1 >= 0) {
                Integer Putere = PutereP1 - 1;
                if (Rez.getTermeni().containsKey(Putere)) {
                    Rez.getTermeni().put(Putere, Rez.getTermeni().get(Putere) + P1.getTermeni().get(PutereP1) * PutereP1);
                } else
                    Rez.getTermeni().put(Putere, P1.getTermeni().get(PutereP1) * PutereP1);
            }
        }
        System.out.println(Rez.getTermeni());
        return Rez;
    }

    public static Polinom Integrare(Polinom P1) {
        Polinom Rez = new Polinom();
        for (Integer PutereP1 : P1.getTermeni().keySet()) {
            Integer Putere=PutereP1+1;
           if(Rez.getTermeni().containsKey(Putere))
               Rez.getTermeni().put(Putere,Rez.getTermeni().get(Putere)+(double)P1.getTermeni().get(PutereP1)/Putere);
            else
               Rez.getTermeni().put(Putere,(double)P1.getTermeni().get(PutereP1)/Putere);

        }
        System.out.println(Rez.getTermeni());
        return Rez;
    }

}
