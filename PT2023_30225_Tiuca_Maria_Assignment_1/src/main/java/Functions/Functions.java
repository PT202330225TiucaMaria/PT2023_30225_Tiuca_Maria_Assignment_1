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
                Rez.getTermeni().put(PutereP2, Rez.getTermeni().get(PutereP2));
        }
        return Rez;
    }
}
