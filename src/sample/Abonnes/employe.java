package sample.Abonnes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class employe {

    private SimpleIntegerProperty NMatricule;
    private SimpleStringProperty Nom;
    private SimpleStringProperty Adresse;
    private SimpleStringProperty Fonction;
    private SimpleStringProperty DateRecrutement;


    // getters && setters && constructors


    public employe() {
    }

    public employe(int NMatricule, String nom,String adresse, String fonction, String dateRecrutement) {
        this.NMatricule = new SimpleIntegerProperty(NMatricule);
        Nom = new SimpleStringProperty(nom);
     
        Adresse = new SimpleStringProperty(adresse);
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
	public String getNom() {
		return Nom.get();
	}
	public SimpleStringProperty nomProperty() {
        return Nom;
    }

	   public void setNom(String nom) {
	        this.Nom.set(nom);
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
