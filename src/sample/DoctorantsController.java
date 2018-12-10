package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import sample.Abonnes.*;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.ouvrages.Ouvrages;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class DoctorantsController implements Initializable {

    @FXML
    private TableColumn<doctorant, String> Prenom;

    @FXML
    private TableColumn<doctorant, String> Adresse;

    @FXML
    private TableView<doctorant> Tableauetudiants;

    @FXML
    private TableColumn<doctorant, String> ThemeThese;

    @FXML
    private TextField barreetudiant;

    @FXML
    private TableColumn<doctorant, String> DirecteurThese;

    @FXML
    private MenuItem closeButton;
    @FXML 
    private MenuItem retourMenu;

    @FXML
    private TableColumn<doctorant, String> Specialite;

    @FXML
    private TableColumn<doctorant, Integer> Ninscription;



    @FXML
    private TableColumn<doctorant, String> Nom;
    @FXML
    private Button retour;


    @FXML
     void closeMet(ActionEvent event){
    	System.exit(0);
    }
    @FXML
     void backMenu(ActionEvent event) throws IOException {
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
    final ObservableList<doctorant> data = FXCollections.observableArrayList(
           new doctorant(01,"Bekkoucha", "Djawed", "Bir el djir","Informatique","iot","28/4/9", enseigantController.data.get(0).getNom(),new ArrayList<Ouvrages>( )),
            new doctorant(01,"negadi", "toufik", "Bir el djir","Informatique","iot","28/4/9",  enseigantController.data.get(1).getNom(),new ArrayList<Ouvrages>( )),
            new doctorant(02,"BRAHIMI", "Aziz", "Bir el djir","Informatique","iot","28/4/9", enseigantController.data.get(2).getNom(),new ArrayList<Ouvrages>( )),
            new doctorant(03,"Fortas", "Oussama", "Bir el djir","Informatique","iot","28/4/9", enseigantController.data.get(3).getNom(),new ArrayList<Ouvrages>( )),
            new doctorant(04,"Haffaf", "ezio", "Bir el djir","Informatique","iot","28/4/9", enseigantController.data.get(1).getNom(),new ArrayList<Ouvrages>( ))

    );
    public void remplissageTableau(){

        Tableauetudiants.setItems(data);

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Prenom.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
        Nom.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        Ninscription.setCellValueFactory(cellData -> cellData.getValue().NInsriptionProperty().asObject());
        Specialite.setCellValueFactory(cellData -> cellData.getValue().specialiteProperty());
        Adresse.setCellValueFactory(cellData -> cellData.getValue().addresseProperty());
        ThemeThese.setCellValueFactory(cellData -> cellData.getValue().themeProperty());
        DirecteurThese.setCellValueFactory(cellData -> cellData.getValue().directeurTheseProperty());
        remplissageTableau();

        FilteredList<doctorant> filteredData = new FilteredList<>(data, p -> true);
        barreetudiant.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(doctorant -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (doctorant.getNom().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (doctorant.getSpecialite().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                else if(doctorant.getDirecteurThese().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }
                return false; // Does not match.
            });
        });

        SortedList<doctorant> sortdData = new SortedList<>(filteredData);

        System.out.println(sortdData.get(0).getNom());

        Tableauetudiants.setItems(sortdData);}
}
