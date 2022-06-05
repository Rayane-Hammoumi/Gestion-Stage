package modele;

public class Demande_validation
{

    public Personne ayant_droit;

    public Boolean validee;

    public Offre offre;

    public Demande_validation(Offre offre, Personne ayant_droit)
    {
        this.ayant_droit = ayant_droit;
        this.validee = false;
        this.offre=offre;
    }

}