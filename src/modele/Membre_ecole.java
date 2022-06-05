package modele;

public class Membre_ecole extends Personne {

    public Membre_ecole()
    {

    }

    //public Boolean ayant_droit;

    /**
     * @param demande_validation
     */

    public Convention creer_convention(Demande_validation demande_validation, Personne[] signataires)
    {

        if(demande_validation.validee==true)
        {
            Convention convention = new Convention(signataires, demande_validation.offre);
            return convention;
        }
        else
        {
            return null;
        }
        
    }


}