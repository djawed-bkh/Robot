package sample;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Abonnes.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;

public class enseigantController implements Initializable {
//initialisations
    @FXML
   private TableColumn<enseignant,Integer> thesecolumn;
    @FXML
    private TextField rechercheprof;
    @FXML
    private Button ensienneté;

    @FXML
    private TableView<enseignant> enseignattableau;

    @FXML
    private Button grade;
    @FXML
    private Button theses;
    @FXML
    private Button rechercheButton;
    @FXML
    private Button nbrthese;
    @FXML
    private TableColumn<enseignant, Integer> nimmatcolumn;
    @FXML
    private TableColumn<enseignant, String> addressecolumn;

    @FXML
    private TableColumn<enseignant, String> nomcolumn;
    @FXML
    private TableColumn<enseignant, String> departementcolumn;

    @FXML
    private TableColumn<enseignant, String> gradecolumn;

    @FXML
    private TableColumn<enseignant, String> datercolumn;

    private ArrayList<enseignant>  proflist= new ArrayList<enseignant>();
    final ObservableList<enseignant> data = FXCollections.observableArrayList(
      new enseignant(1,"naoui","naoui","senia","informatique","professeur","28/02/2000",1),
            new enseignant(2,"loukil","lakhdar","senia","informatique","maitre assistant","28/02/2001",2),
            new enseignant(3,"bentata","bentata","maraval","informatique","assistant","28/02/2002",0),
            new enseignant(4,"benyamina","benyamina","st-eugene","informatique","maitre de conference","28/02/2003",3),
            new enseignant(5,"dali","el abassia","sid-el-houari","Medecine","professeur","28/02/2004",4),
            new enseignant(6,"timimoun","el abassia","gambetta","Mathematiques","professeur","28/02/2004",5)
    );




    public void remplissageTableau(){

        /*for (int i=0;i<data.size();i++){
            System.out.println(data.get(i).getNom());
            System.out.println(data.get(i).getPrenom());
        }*/


        enseignattableau.setItems(data);

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        departementcolumn.setCellValueFactory(cellData -> cellData.getValue().departementProperty());
        gradecolumn.setCellValueFactory(cellData -> cellData.getValue().gradeProperty());
        datercolumn.setCellValueFactory(cellData -> cellData.getValue().dateRecrutementProperty());
        nimmatcolumn.setCellValueFactory(cellData -> cellData.getValue().NImmatProperty().asObject());
        nomcolumn.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        addressecolumn.setCellValueFactory(cellData -> cellData.getValue().adresseProperty());
        thesecolumn.setCellValueFactory(cellData -> cellData.getValue().nbrTjeseDirrigeProperty().asObject());
        remplissageTableau();

         FilteredList<enseignant> filteredData = new FilteredList<>(data, p -> true);
        rechercheprof.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(enseignant -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (enseignant.getNom().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (enseignant.getAdresse().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                else if(enseignant.getGrade().toLowerCase().contains(lowerCaseFilter)) {
                	return true;
                }
                return false; // Does not match.
            });
        });
        SortedList<enseignant> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        //sortedData.get(0).setNom("naoui");
        System.out.println(sortedData.get(0).getNom());
        // 5. Add sorted (and filtered) data to the table.
        enseignattableau.setItems(sortedData);
    }





    // methodes



    @FXML
    void closeMeth(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void BackMenu(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    @FXML
    void Afficherparthese(ActionEvent event) {
        Comparator<enseignant> comparator = Comparator.comparingInt(enseignant::getNbrTjeseDirrige);

            comparator = comparator.reversed();
        FXCollections.sort(data, comparator);
    }




}