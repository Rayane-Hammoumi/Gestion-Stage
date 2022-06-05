package modele;


public class Responsable_stage extends Membre_ecole
{
    public Membre_commission membres[];

    public void modifier_comission(Membre_commission membre0, Membre_commission membre1, Membre_commission membre2, Membre_commission membre3, Membre_commission membre4) {
       this.membres[0]=membre0;
       this.membres[1]=membre1;
       this.membres[2]=membre2;
       this.membres[3]=membre3;
       this.membres[4]=membre4;
    }

   

    public Responsable_stage(String nom, String prenom, String adresse, String mail, int telephone[], int date_naissance[])
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.date_naissance = date_naissance;
        this.membres = new Membre_commission[5];
    }

}