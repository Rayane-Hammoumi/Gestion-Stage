package modele;

import java.util.*;


public class Eleve extends Membre_ecole
{

    
    public Eleve(String nom, String prenom, String adresse, String mail, int telephone[], int date_naissance[])
    {   
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.date_naissance = date_naissance;
        this.catalogue = new ArrayList<>();
        this.demandes_en_cours= new ArrayList<>();
        this.demandes_validees = new ArrayList<>();
        this.convention = null;
        
    }

    
    public ArrayList<Offre> catalogue;
    public ArrayList<Demande_validation> demandes_en_cours;
    public ArrayList<Convention> demandes_validees;
    public Convention convention;

    
    public void ajouter_au_catalogue(Offre offre) {
        this.catalogue.add(offre);
    }

    /**
     * @param offre
     */
    public void demande_validation(Offre offre, Personne ayant_droit) {
        Demande_validation demande = new Demande_validation(offre, ayant_droit);
        this.demandes_en_cours.add(demande);
    }

    /**
     * @param convention
     */
    public void annuler_convention(Convention conventino) {
        this.convention=null;
    }

    /**
     * @param convention
     */
    public void approuver(Convention convention) {
        convention.approbations[0]=true; //la case d'indice 0 correspond toujours à l'approbation du stagiaire
    }

}