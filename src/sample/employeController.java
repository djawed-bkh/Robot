package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sample.Abonnes.*;

import java.net.URL;
import java.util.ResourceBundle;

public class employeController implements Initializable {

    @FXML
    private TableView<employe> TableauEmploye;

    @FXML
    private TableColumn<employe,String> Fonction;

    @FXML
    private TableColumn<employe,String> adresse;

    @FXML
    private TableColumn<employe,String> DateRecrutement;

    @FXML
    private TableColumn<employe,Integer> Nimmat;

    @FXML
    private TextField barrerecherche;

    @FXML
    private TableColumn<employe,String> Nom;




    final ObservableList<employe> data = FXCollections.observableArrayList(
    		   new employe(01, "Hakim", "Fernand Ville","Concierge", "12/01/2015"),
    	       new employe(02, "Younes", "Senia","Photcopie", "16/03/2017"),
    	       new employe(03, "Ilyes", "Bir el djir","Agent de s�cu", "24/01/2013"),
    	       new employe(04, "Abdeka", "Maraval","Concierge", "15/04/2010"),
    	       new employe(05, "Pirlo", "Yaghmourasen","Photocopie", "30/09/2014")
    );




    public void remplissageTableau(){

        TableauEmploye.setItems(data);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Nom.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        Nimmat.setCellValueFactory(cellData -> cellData.getValue().NMatriculeProperty().asObject());
        Fonction.setCellValueFactory(cellData -> cellData.getValue().fonctionProperty());
        adresse.setCellValueFactory(cellData -> cellData.getValue().adresseProperty());
        DateRecrutement.setCellValueFactory(cellData -> cellData.getValue().daterecrutementProperty());
     
        remplissageTableau();

         FilteredList<employe> filteredData = new FilteredList<>(data, p -> true);
        barrerecherche.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(employe -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (employe.getNom().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (employe.getAdresse().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                else if(employe.getFonction().toLowerCase().contains(lowerCaseFilter)) {
                	return true;
                }
                return false; // Does not match.
            });
        });
        SortedList<employe> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        //sortedData.get(0).setNom("naoui");
        System.out.println(sortedData.get(0).getNom());
        // 5. Add sorted (and filtered) data to the table.
        TableauEmploye.setItems(sortedData);
    }



}
