package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Abonnes.*;
import sample.ouvrages.Ouvrages;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class employeController implements Initializable {

    @FXML
    private TableColumn<employe, String> Prenom;
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
    @FXML 
    private MenuItem retourMenu;
    @FXML 
    private MenuItem closeButton;
    @FXML 
    private AnchorPane employe;
    @FXML
    private Button retour;



    final ObservableList<employe> data = FXCollections.observableArrayList(
    		   new employe(01, "Hakim","belaich", "Fernand Ville","Concierge", "12/01/2015",new ArrayList<Ouvrages>()),
    	       new employe(02, "Younes","belaich", "Senia","Photcopie", "16/03/2017",new ArrayList<Ouvrages>()),
    	       new employe(03, "Ilyes","belaich", "Bir el djir","Agent de s�cu", "24/01/2013",new ArrayList<Ouvrages>()),
    	       new employe(04, "Abdeka","belaich", "Maraval","Concierge", "15/04/2010",new ArrayList<Ouvrages>()),
    	       new employe(05, "Pirlo","belaich", "Yaghmourasen","Photocopie", "30/09/2014",new ArrayList<Ouvrages>())
    );




    public void remplissageTableau(){

        TableauEmploye.setItems(data);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Nom.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        Prenom.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
        Nimmat.setCellValueFactory(cellData -> cellData.getValue().NMatriculeProperty().asObject());
        Fonction.setCellValueFactory(cellData -> cellData.getValue().fonctionProperty());
        adresse.setCellValueFactory(cellData -> cellData.getValue().addresseProperty());
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
                } else if (employe.getAddresse().toLowerCase().contains(lowerCaseFilter)) {
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
    @FXML
    void backMenu(ActionEvent event) throws IOException  {
       ((Node) (event.getSource())).getScene().getWindow().hide();
       Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
       Stage primaryStage = new Stage();
       primaryStage.setTitle("Menu");
       primaryStage.setScene(new Scene(root));
       primaryStage.setResizable(false);
       primaryStage.show();
   }
    @FXML
    void retourButton(ActionEvent event) throws IOException {
    	((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
   }
        
    @FXML
    void closeMet(ActionEvent event) {
    	System.exit(0);
    }



}
