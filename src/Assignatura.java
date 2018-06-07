import java.util.ArrayList;

/**
 * Representa una assginatura
 * @author jgcabotd
 * @version 1.0
 */
public class Assignatura {

    public long id = 0;
    private String nom = "";
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;

    /**
     * Costructor de la assginatura
     * @param id ID unic per cada assginatura
     * @param nom Nom de l'assginatura
     * @param hores Hores de l'assginatura
     * @param credits Credits que costa la assginatura
     * @param disponible Dispoinibilitat de l'assginatura
     */
    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
