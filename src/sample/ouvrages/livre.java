package sample.ouvrages;

import java.util.ArrayList;

public class livre {

    private int Nisbn;
    private String titre;
    private String editeur;
    private ArrayList<String> auteurs;    // possible creer la classe auteur
    private enum specialite { info,mat,physique};

    // getters && setters && constructors


    public livre() {
    }

    public livre(int nisbn, String titre, String editeur, ArrayList<String> auteurs) {
        Nisbn = nisbn;
        this.titre = titre;
        this.editeur = editeur;
        this.auteurs = auteurs;
    }

    public int getNisbn() {
        return Nisbn;
    }

    public void setNisbn(int nisbn) {
        Nisbn = nisbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public ArrayList<String> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(ArrayList<String> auteurs) {
        this.auteurs = auteurs;
    }
}
