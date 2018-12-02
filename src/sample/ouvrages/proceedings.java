package sample.ouvrages;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class proceedings extends Ouvrages{

    private SimpleStringProperty lieu;
    private SimpleStringProperty specialite ;

    public proceedings(String lieu, String specialite) {
        this.lieu = new SimpleStringProperty(lieu);
        this.specialite = new SimpleStringProperty(specialite);
    }

    public proceedings(int nisbn, String nom, String dateApparition, String lieu, String specialite) {
        super(nisbn, nom, specialite);
        this.lieu = new SimpleStringProperty(lieu);
        this.specialite = new SimpleStringProperty(specialite);
    }



    public String getLieu() {
        return lieu.get();
    }

    public SimpleStringProperty lieuProperty() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu.set(lieu);
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
