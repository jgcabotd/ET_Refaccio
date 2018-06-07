import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";
    private int curs = 0;
    private Collection assignatures;

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        getEstudiant(nom, cognoms, dni).invoke();
        this.curs = curs;
        this.assignatures = assignatures;
    }

    //He fet un 'extract method' al new Estudiant per un getEstudiant.
    private Estudiant getEstudiant(String nom, String cognoms, String dni) {
        return new Estudiant(nom, cognoms, dni);
    }

    public float costMatricula(){

        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * 15;
        return cost;
    }

    private class Estudiant {
        private String nom;
        private String cognoms;
        private String dni;

        public Estudiant(String nom, String cognoms, String dni) {
            this.nom = nom;
            this.cognoms = cognoms;
            this.dni = dni;
        }

        public void invoke() {
            Matricula.this.nom = nom;
            Matricula.this.cognoms = cognoms;
            Matricula.this.dni = dni;
        }
    }
}