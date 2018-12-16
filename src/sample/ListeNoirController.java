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
import javafx.stage.Stage;
import sample.Abonnes.*;
import sample.ouvrages.Ouvrages;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class ListeNoirController implements Initializable {

    @FXML
    private TableColumn<Personne, String> addressecolumn;

    @FXML
    private TableColumn<Personne, Integer> Penalitecol;

    @FXML
    private TableColumn<Personne, String> nomcolumn;

    @FXML
    private TextField rechercheprof;

    @FXML
    private Button retour;

    @FXML
    private MenuItem closeButton;

    @FXML
    private TableView<Personne> listenoir;

    @FXML
    private MenuItem retourMenu;

    @FXML
    private TableColumn<Personne, String> prenomCol;

    public static final ObservableList<Personne> data = FXCollections.observableArrayList(
            new enseignant(1,"naoui","naoui","senia","informatique","professeur","28/02/2000",1,new ArrayList<Ouvrages>(Arrays.asList(DocumentsDemandesController.listeOuvrages.get(0),DocumentsDemandesController.listeOuvrages.get(1),DocumentsDemandesController.listeOuvrages.get(2))),500),
            new enseignant(2,"loukil","lakhdar","senia","informatique","maitre assistant","28/02/2003",2,new ArrayList<Ouvrages>(Arrays.asList(DocumentsDemandesController.listeOuvrages.get(0),DocumentsDemandesController.listeOuvrages.get(1),DocumentsDemandesController.listeOuvrages.get(2))),200),
            new enseignant(3,"bentata","bentata","maraval","informatique","assistant","28/02/2010",0,new ArrayList<Ouvrages>(Arrays.asList(DocumentsDemandesController.listeOuvrages.get(0),DocumentsDemandesController.listeOuvrages.get(1),DocumentsDemandesController.listeOuvrages.get(2))),800),
            new etudiant(03,"Patoshik", "Ismail", "Palmiers","Medecine",new ArrayList<Ouvrages>(),750),
            new etudiant(04,"Fortas", "Oussama", "200","Informatique",new ArrayList<Ouvrages>(),200),
            new etudiant(05,"Beldjilali", "Youcef", "Belgaid","mathematique",new ArrayList<Ouvrages>(),250)
    );

    public void remplissageTableau(){


       listenoir.setItems(data);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nomcolumn.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        prenomCol.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
        addressecolumn.setCellValueFactory(cellData -> cellData.getValue().addresseProperty());
        Penalitecol.setCellValueFactory(cellData -> cellData.getValue().penaliteProperty().asObject());
        nomcolumn.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        remplissageTableau();


    }





    @FXML
    void closeMet(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void retourButton(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
