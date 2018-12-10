package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
import javafx.stage.Stage;
import sample.Abonnes.enseignant;
import sample.Abonnes.etudiant;
import sample.ouvrages.Ouvrages;

public class etudiantController implements Initializable  {

    @FXML
    private TableColumn<etudiant, String> Prenom;
    @FXML
    private MenuItem closeButton;
    @FXML
    private MenuItem retourMenu;

    @FXML
    private TableColumn<etudiant,String> Adresse;

    @FXML
    private TableView<etudiant> Tableauetudiants;

    @FXML
    private TableColumn<etudiant, String> ThemeThese;

    @FXML
    private TextField barreetudiant;

    @FXML
    private TableColumn<etudiant, String> DirecteurThese;

    @FXML
    private TableColumn<etudiant, String> Specialite;

    @FXML
    private TableColumn<etudiant, Integer> Ninscription;

    @FXML
    private TableColumn<etudiant, String> Nom;
    @FXML
    private Button retour;
    
    private ArrayList<etudiant>  proflist= new ArrayList<etudiant>();
    final ObservableList<etudiant> data = FXCollections.observableArrayList(
    		 new etudiant(01,"Bekkoucha", "Djawed", "Bir el djir","Informatique",new ArrayList<Ouvrages>()),
    	      new etudiant(02,"Brahimi", "Aziz", "Maraval","Informatique",new ArrayList<Ouvrages>()),
    	      new etudiant(03,"Patoshik", "Ismail", "Palmiers","Medecine",new ArrayList<Ouvrages>()),
    	      new etudiant(04,"Fortas", "Oussama", "200","Informatique",new ArrayList<Ouvrages>()),
    	      new etudiant(05,"Beldjilali", "Youcef", "Belgaid","mathematique",new ArrayList<Ouvrages>())
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
     
        remplissageTableau();

         FilteredList<etudiant> filteredData = new FilteredList<>(data, p -> true);
        barreetudiant.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(etudiant -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (etudiant.getNom().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (etudiant.getAddresse().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                else if(etudiant.getSpecialite().toLowerCase().contains(lowerCaseFilter)) {
                	return true;
                }
                return false; // Does not match.
            });
        });
        SortedList<etudiant> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        //sortedData.get(0).setNom("naoui");
        System.out.println(sortedData.get(0).getNom());
        // 5. Add sorted (and filtered) data to the table.
        Tableauetudiants.setItems(sortedData);
    }



    @FXML
    void backMenu(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
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

}
