package sample.Abonnes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class etudiant {

    protected SimpleIntegerProperty NInscription;
    protected SimpleStringProperty Nom;
    protected SimpleStringProperty Prenom;
    protected SimpleStringProperty Adresse;
    protected SimpleStringProperty Specialite;


    // getters && setters  && constructors


    public etudiant() {
    }

    public etudiant(int NInscription, String nom, String prenom, String adresse,String specialite) {
        this.NInscription = new SimpleIntegerProperty(NInscription);
        Nom = new SimpleStringProperty(nom);
        Prenom = new SimpleStringProperty(prenom);
        Adresse = new SimpleStringProperty(adresse);
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
