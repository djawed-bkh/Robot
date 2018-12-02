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
import sample.ouvrages.*;
import sample.ouvrages.Ouvrages;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DocumentsDemandesController implements Initializable {

    @FXML
    private TextField RechercheBarre;
    @FXML
    private TableColumn<Ouvrages, Integer> NisbnCol;

    @FXML
    private TableColumn<Ouvrages,  String> DateApparitionCol;

    @FXML
    private TableColumn<Ouvrages, Integer> NombreDemandesCol;

    @FXML
    private TableView< Ouvrages> TableauLivres;

    @FXML
    private TableColumn<Ouvrages, String> NomCol;
    protected ArrayList<String> reservations;
    



    final ObservableList<Ouvrages> data = FXCollections.observableArrayList(
            new livre(2,"le vielle homme et la mer","20/01/1986","el marsa","albert"),
            new proceedings(3,"nom","28/01/120","oran","maths"),
            new revues(1,"voitures","1999","mecanique")

    );



    public void remplissageTableau(){

        TableauLivres.setItems(data);

    }


     @Override
  public void initialize(URL location, ResourceBundle resources) {

        NomCol.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
       NisbnCol.setCellValueFactory(cellData -> cellData.getValue().nisbnProperty().asObject());
        DateApparitionCol.setCellValueFactory(cellData -> cellData.getValue().dateApparitionProperty());


        remplissageTableau();
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
