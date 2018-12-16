package sample.Abonnes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import sample.ouvrages.Ouvrages;

import java.util.ArrayList;

public class employe extends Personne{

    private SimpleIntegerProperty NMatricule;
    private SimpleStringProperty Fonction;
    private SimpleStringProperty DateRecrutement;


    // getters && setters && constructors




    public employe(int NMatricule, String nom,String prenom ,String adresse, String fonction, String dateRecrutement, ArrayList<Ouvrages> reservation,int penalite) {
		super(nom,prenom,adresse,reservation,penalite);
		this.NMatricule = new SimpleIntegerProperty(NMatricule);
        Fonction = new SimpleStringProperty(fonction);
        DateRecrutement = new SimpleStringProperty(dateRecrutement);
    }
   
    public int NMatricule() {
		return NMatricule.get();
	}
	public SimpleIntegerProperty NMatriculeProperty() {
        return NMatricule;
    }

	   public void setNMatricule(int NMatricule) {
	        this.NMatricule.set(NMatricule);
	    }


	public String getFonction() {
		return Fonction.get();
	}
	 public SimpleStringProperty fonctionProperty() {
	        return Fonction;
	    }

	public void setFonction(String fonction) {
		this.Fonction.set(fonction);
	}
	public String getDateRecrutement() {
		return DateRecrutement.get();
	}
	 public SimpleStringProperty daterecrutementProperty() {
	        return DateRecrutement;
	    }

	public void setDateRecrutement(String daterecrutement) {
		this.DateRecrutement.set(daterecrutement);
	}


}
