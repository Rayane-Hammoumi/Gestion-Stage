package modele;

public class Direction extends Membre_ecole
{
    public Direction(String nom, String prenom, String adresse, String mail, int telephone[], int date_naissance[])
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.date_naissance = date_naissance;

    }

    /**
     * @param convention
     */
    
    public void approuver(Convention convention) {
        convention.approbations[2]=true;    //la case d'indice 2 correspond toujours à l'approbation de la direction
    }

}