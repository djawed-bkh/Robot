package sample.ouvrages;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class revues extends Ouvrages {



    private SimpleStringProperty specialite ;

    public revues(String specialite) {
        this.specialite = new SimpleStringProperty(specialite);
    }

    public revues(int nisbn, String nom, String dateApparition, String specialite,int nbrdemandes) {
        super(nisbn, nom, dateApparition,nbrdemandes);
        this.specialite = new SimpleStringProperty(specialite);
    }

    public String getSpecialite() {
        return specialite.get();
    }

    public SimpleStringProperty specialiteProperty() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite.set(specialite);
    }
}
