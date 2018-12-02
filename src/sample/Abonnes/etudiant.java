package sample.Abonnes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import sample.ouvrages.Ouvrages;

import java.util.ArrayList;

public class etudiant extends Personne {

    protected SimpleIntegerProperty NInscription;
    protected SimpleStringProperty Specialite;


    // getters && setters  && constructors



    public etudiant(int NInscription, String nom, String prenom, String adresse, String specialite, ArrayList<Ouvrages> reservations) {
		super(nom,prenom,adresse,reservations);
		this.NInscription = new SimpleIntegerProperty(NInscription);
        Specialite = new SimpleStringProperty(specialite);
    }

	public SimpleIntegerProperty getNInscription() {
		return NInscription;
	}
	 public SimpleIntegerProperty NInsriptionProperty() {
	        return NInscription;
	    }


	public void setNInscription(SimpleIntegerProperty nInscription) {
		NInscription = nInscription;
	}

	public String getSpecialite() {
		return Specialite.get();
	}
	 public SimpleStringProperty specialiteProperty() {
	        return Specialite;
	    }

	public void setSpecialite(String specialite) {
		this.Specialite.set(specialite);
	}
    





   
}
