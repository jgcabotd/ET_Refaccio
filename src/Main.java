import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Assignatura ass1 = new Assignatura(1,"Xarxes",150,6,true);
        Assignatura ass2 = new Assignatura(2,"Sistemes Operatius",100,4,true);
        Assignatura ass3 = new Assignatura(2,"Entorns",75,3,true);
        ArrayList<Assignatura> assignatures = new ArrayList<Assignatura>();
        assignatures.add(ass1);
        assignatures.add(ass2);
        assignatures.add(ass3);
        Matricula prova = new Matricula(2018090103, "Josep", "Garcia Marti", "12345678X", 1, assignatures);
        System.out.print("Cost de la matricula " + prova.costMatricula());
    }
}
