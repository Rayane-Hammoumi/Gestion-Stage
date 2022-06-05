package modele;

public class Convention{


    public Personne signataires[];

    public Boolean approbations[];  

    public Offre offre;
    /*tableau de 3 cases
    Case 0: approbation du stagiaire
    Case 1: approbation de l'entreprise d'accueil
    Case 2: approbation de la direction de l'ecole*/

    public Convention(Personne[] signataires, Offre offre)
    {
        this.signataires = signataires;
        Boolean approbations[] = new Boolean[3];
        for(int i=0; i<3; i++)
        {
            approbations[i]=false;
        }
        this.approbations = approbations;
        this.offre = offre;
    }

}