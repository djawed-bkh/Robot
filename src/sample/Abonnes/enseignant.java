package sample.Abonnes;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class enseignant {

    private SimpleIntegerProperty NImmat;
    private SimpleStringProperty Nom;
    private SimpleStringProperty Prenom;
    private SimpleStringProperty Adresse;
    private SimpleStringProperty Departement;            // possible de changer le type en Enum
    private SimpleStringProperty grade;
    private SimpleStringProperty DateRecrutement;
    private SimpleIntegerProperty NbrTjeseDirrige;



// getters && setters && constructors


    public enseignant(int nimmat, String nom, String prenom, String adresse, String departement, String grade, String dateRecrutement, int nbrthesedirrige) {
        this.NImmat = new SimpleIntegerProperty(nimmat);
        this.Nom = new SimpleStringProperty(nom);
        this.Prenom = new SimpleStringProperty(prenom);
        this.Adresse = new SimpleStringProperty(adresse);
        this.Departement = new SimpleStringProperty(departement);
        this.grade = new SimpleStringProperty(grade);
        this.DateRecrutement = new SimpleStringProperty(dateRecrutement);
        this.NbrTjeseDirrige = new SimpleIntegerProperty(nbrthesedirrige);
    }

    public int getNImmat() {
        return NImmat.get();
    }

    public SimpleIntegerProperty NImmatProperty() {
        return NImmat;
    }

    public void setNImmat(int NImmat) {
        this.NImmat.set(NImmat);
    }

    public String getNom() {
        return Nom.get();
    }

    public SimpleStringProperty nomProperty() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom.set(nom);
    }

    public String getPrenom() {
        return Prenom.get();
    }

    public SimpleStringProperty prenomProperty() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        this.Prenom.set(prenom);
    }

    public String getAdresse() {
        return Adresse.get();
    }

    public SimpleStringProperty adresseProperty() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        this.Adresse.set(adresse);
    }

    public String getDepartement() {
        return Departement.get();
    }

    public SimpleStringProperty departementProperty() {
        return Departement;
    }

    public void setDepartement(String departement) {
        this.Departement.set(departement);
    }

    public String getGrade() {
        return grade.get();
    }

    public SimpleStringProperty gradeProperty() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade.set(grade);
    }

    public String getDateRecrutement() {
        return DateRecrutement.get();
    }

    public SimpleStringProperty dateRecrutementProperty() {
        return DateRecrutement;
    }

    public void setDateRecrutement(String dateRecrutement) {
        this.DateRecrutement.set(dateRecrutement);
    }

    public int getNbrTjeseDirrige() {
        return NbrTjeseDirrige.get();
    }

    public SimpleIntegerProperty nbrTjeseDirrigeProperty() {
        return NbrTjeseDirrige;
    }

    public void setNbrTjeseDirrige(int nbrTjeseDirrige) {
        this.NbrTjeseDirrige.set(nbrTjeseDirrige);
    }
}