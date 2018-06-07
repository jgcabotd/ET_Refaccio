import java.util.Collection;
import java.util.Iterator;

/**
 * Serveix per reprsentar una matricula
 * que te un alumna.
 * @author jgcabotd
 * @version 1.5
 */
public class Matricula {

    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";
    private int curs = 0;
    private Collection assignatures;

    public Matricula(){}

    /**
     * Conctructor de la matricula on li passam un conjunt de parametres.
     * @param id ID autogenerada
     * @param nom Nom del alumna
     * @param cognoms Cognoms del alumna
     * @param dni DNI del alumna
     * @param curs Curs on anira l'alumna
     * @param assignatures Les assginaturs de curdarà.
     */
    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        getEstudiant(nom, cognoms, dni).invoke();
        this.curs = curs;
        this.assignatures = assignatures;
    }

    //He fet un 'extract method' al new Estudiant per un getEstudiant.
    /**
     * Mètode que servex per obtenir un estudiant
     * @param nom Nom del estudiant
     * @param cognoms Cognoms del estudiant
     * @param dni DNI del estudiant
     * @return Retorna la classe que represneta un estudiant.
     */
    private Estudiant getEstudiant(String nom, String cognoms, String dni) {
        return new Estudiant(nom, cognoms, dni);
    }

    /**
     * La màtricula treu el cost depenent de les assginatures.
     * @return Retorna el cost total de la matricula.
     */
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

    /**
     * Representa un alumna.
     * @author jgcabotd
     * @version 1.6
     */
    private class Estudiant {
        private String nom;
        private String cognoms;
        private String dni;

        /**
         * Contructor de estudiant
         * @param nom Nom del estudiant
         * @param cognoms Cognoms del estudiant
         * @param dni DNI del estudiant
         */
        public Estudiant(String nom, String cognoms, String dni) {
            this.nom = nom;
            this.cognoms = cognoms;
            this.dni = dni;
        }

        /**
         * Invoca els seus atributs
         */
        public void invoke() {
            Matricula.this.nom = nom;
            Matricula.this.cognoms = cognoms;
            Matricula.this.dni = dni;
        }
    }
}