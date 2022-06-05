package modele;

public class Entreprise {

    public String nom;
    
    public Entreprise(String nom) {
        this.nom = nom;
    }

    public void designer_encadrant(Offre offre, Personne encadrant) {
        offre.encadrant=encadrant;
    }

    /**
     * @param convention
     */
    public void approuver(Convention convention) {
        convention.approbations[1]=true; //la case d'indice 1 correspond toujours à l'approbation de l'entreprise d'accueil
    }

}