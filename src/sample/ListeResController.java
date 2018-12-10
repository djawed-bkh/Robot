package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import sample.Abonnes.Personne;
import sample.ouvrages.Ouvrages;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListeResController implements Initializable {

    @FXML
    private TableColumn<Ouvrages, Integer> NisbnCol;
    @FXML
    private TableColumn<Personne, String> NomDemandeur;

    @FXML
    private TableColumn<Personne, String> PrenomDemandeur;

    @FXML
    private TableView<Personne> listprofs;

    @FXML
    private TextField RechercheBarre;

    @FXML
    private TableColumn<Ouvrages, String> NomCol;
    final ObservableList<Personne> data = FXCollections.observableArrayList();
    @FXML
    private MenuItem retourMenu;
    @FXML
    private MenuItem closeButton;
    @FXML
    private Button retour;
    
    
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

/*
    public void remplissageTableau(){
        for (int i=0;i<enseigantController.listprofs.size();i++){
            data.add(enseigantController.listprofs.get(i));
        }
        System.out.println("    marcheeeeee 00"+data.get(0).getNom());
        listprofs.setItems(data);
        System.out.println("    marcheeeeee 00"+data.get(0).getNom());
    }
*/
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("    marcheeeeee 00"+data.get(0).getNom());
        NomCol.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        NisbnCol.setCellValueFactory(cellData -> cellData.getValue().nisbnProperty().asObject());
        NomDemandeur.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        PrenomDemandeur.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());



   //     remplissageTableau();
        // pour faire la recherche (additionnel)
      /*  FilteredList<Ouvrages> filteredData = new FilteredList<>(data, p -> true);
        RechercheBarre.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(employe -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (employe.getNom().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (Ouvrages.getNom().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }

                return false; // Does not match.
            });
        });
        SortedList<Ouvrages> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        //sortedData.get(0).setNom("naoui");
        System.out.println(sortedData.get(0).getNom());
        // 5. Add sorted (and filtered) data to the table.
        TableauLivres.setItems(sortedData);*/
    }


}
