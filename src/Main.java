import java.util.ArrayList;

/**
 * Main on tenim les mètode per comprovar
 * si funciona correctament l'aplicació.
 * @author jgcabotd
 * @version 1.0
 */
public class Main {

    public static final Assignatura ASS_1 = new Assignatura(1,"Xarxes",150,6,true);
    public static final Assignatura ASS_2 = new Assignatura(2,"Sistemes Operatius",100,4,true);
    public static final Assignatura ASS_3 = new Assignatura(2,"Entorns",75,3,true);

    /**
     * Main on executam la aplicació.
     * @param args Li pasa els arguments per defecte.
     */
    public static void main(String[] args) {
        ArrayList<Assignatura> assignatures = new ArrayList<Assignatura>();
        assignatures.add(ASS_1);
        assignatures.add(ASS_2);
        assignatures.add(ASS_3);
        Matricula prova = new Matricula(2018090103, "Josep", "Garcia Marti", "12345678X", 1, assignatures);
        System.out.print("Cost de la matricula " + prova.costMatricula());
    }
}
