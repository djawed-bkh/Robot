package sample.Abonnes;

public class doctorant extends etudiant {

    protected String theme;
    protected String DateInscription;
    protected String DirecteurThese;


        // getters && setters && constructors
    public doctorant(int NInscription, String nom, String prenom, String adresse,String specialite, String theme, String dateInscription, String directeurThese) {
        super(NInscription, nom, prenom, adresse,specialite);
        this.theme = theme;
        DateInscription = dateInscription;
        DirecteurThese = directeurThese;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDateInscription() {
        return DateInscription;
    }

    public void setDateInscription(String dateInscription) {
        DateInscription = dateInscription;
    }

    public String getDirecteurThese() {
        return DirecteurThese;
    }

    public void setDirecteurThese(String directeurThese) {
        DirecteurThese = directeurThese;
    }



}
