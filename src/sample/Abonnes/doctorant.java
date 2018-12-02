package sample.Abonnes;

import javafx.beans.property.SimpleStringProperty;
import sample.ouvrages.Ouvrages;

import java.util.ArrayList;

public class doctorant extends etudiant {

    protected SimpleStringProperty theme;
    protected SimpleStringProperty DateInscription;
    protected  SimpleStringProperty DirecteurThese;


        // getters && setters && constructors
    public doctorant(int NInscription, String nom, String prenom, String adresse, String specialite, String theme, String dateInscription, String directeurThese, ArrayList<Ouvrages> reservations) {
        super(NInscription, nom, prenom, adresse,specialite,reservations);
        this.theme = new SimpleStringProperty(theme);
        DateInscription = new SimpleStringProperty(dateInscription);
        DirecteurThese = new SimpleStringProperty(directeurThese);
    }

    public String getTheme() {
        return theme.get();
    }

    public SimpleStringProperty themeProperty() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme.set(theme);
    }

    public String getDateInscription() {
        return DateInscription.get();
    }

    public SimpleStringProperty dateInscriptionProperty() {
        return DateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.DateInscription.set(dateInscription);
    }

    public  String getDirecteurThese() {
        return DirecteurThese.get();
    }

    public SimpleStringProperty directeurTheseProperty() {
        return DirecteurThese;
    }

    public void setDirecteurThese(String directeurThese) {
        this.DirecteurThese.set(directeurThese);
    }
}
