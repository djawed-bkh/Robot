package sample.ouvrages;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class livre  extends Ouvrages{

    private SimpleStringProperty editeur;
    private ArrayList<String> auteurs;    // possible creer la classe auteur
    private enum specialite { info,mat,physique};

    // getters && setters && constructors


    public livre() {
        super();
    }

    public livre(String editeur, ArrayList<String> auteurs) {
        this.editeur =new SimpleStringProperty(editeur);
        this.auteurs = auteurs;
    }

    public livre(SimpleIntegerProperty nisbn, SimpleStringProperty nom, SimpleStringProperty dateApparition, SimpleStringProperty editeur, ArrayList<String> auteurs) {
        super(nisbn, nom, dateApparition);
        this.editeur = editeur;
        this.auteurs = auteurs;
    }

    public String getEditeur() {
        return editeur.get();
    }

    public SimpleStringProperty editeurProperty() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur.set(editeur);
    }

    public ArrayList<String> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(ArrayList<String> auteurs) {
        this.auteurs = auteurs;
    }
}
