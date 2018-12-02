package sample.ouvrages;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import sample.Abonnes.Personne;

import java.util.ArrayList;

public class Ouvrages {



    protected SimpleIntegerProperty nisbn;
    protected  SimpleStringProperty Nom;
    protected SimpleStringProperty dateApparition;
    protected ArrayList<Personne> Reservations;
    protected IntegerProperty nbrdemandes;
                             // doit etre de type personne (mais on fais ça parceque j'ai la flemme// )

    public Ouvrages() {

    }
    public Ouvrages(int  nisbn, String nom, String dateApparition,int nbrdemandes) {
        this.nisbn = new SimpleIntegerProperty(nisbn);
        this.Nom = new SimpleStringProperty(nom);
        this.dateApparition = new SimpleStringProperty(dateApparition);
        this.nbrdemandes=new SimpleIntegerProperty(nbrdemandes);
    }

    public Ouvrages(SimpleIntegerProperty nisbn, SimpleStringProperty nom, SimpleStringProperty dateApparition) {
        this.nisbn = nisbn;
        Nom = nom;
        this.dateApparition = dateApparition;
    }


    public ArrayList<Personne> getReservations() {
        return Reservations;
    }

    public void setReservations(ArrayList<Personne> reservations) {
        Reservations = reservations;
    }

    public int getNbrdemandes() {
        return nbrdemandes.get();
    }

    public IntegerProperty nbrdemandesProperty() {
        return nbrdemandes;
    }

    public void setNbrdemandes(int nbrdemandes) {
        this.nbrdemandes.set(nbrdemandes);
    }

    public int getNisbn() {
        return nisbn.get();
    }

    public SimpleIntegerProperty nisbnProperty() {
        return nisbn;
    }

    public void setNisbn(int nisbn) {
        this.nisbn.set(nisbn);
    }

    public  String getNom() {
        return Nom.get();
    }

    public SimpleStringProperty nomProperty() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom.set(nom);
    }

    public String getDateApparition() {
        return dateApparition.get();
    }

    public SimpleStringProperty dateApparitionProperty() {
        return dateApparition;
    }

    public void setDateApparition(String dateApparition) {
        this.dateApparition.set(dateApparition);
    }


}
