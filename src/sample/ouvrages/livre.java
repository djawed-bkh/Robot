package sample.ouvrages;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class livre  extends Ouvrages{

    private SimpleStringProperty editeur;
    private SimpleStringProperty auteurs;    // possible creer la classe auteur
    private enum specialite { info,mat,physique};

    // getters && setters && constructors


    public livre() {
        super();
    }

    public livre(String editeur, String auteurs) {
        this.editeur =new SimpleStringProperty(editeur);
        this.auteurs = new SimpleStringProperty(auteurs);
    }

    public livre(int nisbn, String nom, String dateApparition, String editeur, String auteurs) {
        super(nisbn, nom, dateApparition);
        this.editeur =new SimpleStringProperty(editeur);
        this.auteurs = new SimpleStringProperty(auteurs);
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


    public String getAuteurs() {
        return auteurs.get();
    }

    public SimpleStringProperty auteursProperty() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs.set(auteurs);
    }
}
