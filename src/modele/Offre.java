package modele;

public class Offre
{
    public int date_debut[];
    public int date_fin[];
    public String lieu;
    public String sujet;
    public float indemnite;
    public String resultats_attendus;
    public String expositions_eleve;
    public String avantages[];
    public Personne encadrant;


    public Offre(int[] date_debut, int[] date_fin, String lieu, String sujet, float indemnite,
            String resultats_attendus, String expositions_eleve, String[] avantages, Personne encadrant)
    {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.lieu = lieu;
        this.sujet = sujet;
        this.indemnite = indemnite;
        this.resultats_attendus = resultats_attendus;
        this.expositions_eleve = expositions_eleve;
        this.avantages = avantages;
        this.encadrant = encadrant;
    }

}