package sample.Abonnes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import sample.ouvrages.Ouvrages;

import java.util.ArrayList;

public class Personne {

    protected  SimpleStringProperty nom;
    protected SimpleStringProperty prenom;
    protected SimpleStringProperty addresse;
    protected ArrayList<Ouvrages> Reservation;
    protected SimpleIntegerProperty penalite;

    public Personne() {
    }



    public Personne(String nom, String prenom, String addresse, ArrayList<Ouvrages> reservation, int penalite) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.addresse = new SimpleStringProperty(addresse);
        Reservation =  reservation;
        this.penalite= new SimpleIntegerProperty(penalite);
    }

    public Personne(SimpleStringProperty nom, SimpleStringProperty prenom, SimpleStringProperty addresse, ArrayList<Ouvrages> reservation) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        Reservation = reservation;
    }

    public  String getNom() {
        return nom.get();
    }

    public SimpleStringProperty nomProperty() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public SimpleStringProperty prenomProperty() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public String getAddresse() {
        return addresse.get();
    }

    public SimpleStringProperty addresseProperty() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse.set(addresse);
    }
    public int getPenalite() {
        return penalite.get();
    }

    public SimpleIntegerProperty penaliteProperty() {
        return penalite;
    }

    public void setPenalite(int penalite) {
        this.penalite.set(penalite);
    }
}
