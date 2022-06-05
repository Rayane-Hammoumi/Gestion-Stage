package modele;

public class Membre_commission extends Membre_ecole
{
    public String valider(Eleve eleve, Offre offre)
    {
        for(int i=0; i<eleve.demandes_en_cours.size(); i++)
        {
            if(eleve.demandes_en_cours.get(i).offre==offre)
            {
                if(eleve.demandes_en_cours.get(i).validee==true)
                {
                    return "cette offre etait deja validee";
                }
                else
                {
                    eleve.demandes_en_cours.get(i).validee=true;
                    return "L'offre a ete validee";
                }

            }
        }

        return "l'offre choisie n'est pas dans les demandes en cours de cet eleve. Veuillez verifier l'identite de l'eleve choisi";
        
    }
    
    public Membre_commission(String nom, String prenom, String adresse, String mail, int telephone[], int date_naissance[])
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.date_naissance = date_naissance;

    }
    

}