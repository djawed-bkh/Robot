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

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
    
        public static  ArrayList<Ouvrages> listeOuvrages= new ArrayList<> (
                Arrays.asList(
                        new livre(1,"le vielle homme et la mer","20/01/1986",5,"el marsa","albert"),
                        new proceedings(2,"nom","28/01/120","oran","maths",3),
                        new revues(3,"voitures","1999","mecanique",8),
                        new livre(5,"le vielle homme et la mer","20/01/1986",2,"el marsa","albert"),
                        new proceedings(4,"nom","28/01/120","oran","maths",5),
                        new revues(5,"voitures","1999","mecanique",3),
                        new livre(6,"le vielle homme et la mer","20/01/1986",7,"el marsa","albert"),
                        new proceedings(7,"nom","28/01/120","oran","maths",6),
                        new revues(8,"voitures","1999","mecanique",6)
                ));



    final ObservableList<Ouvrages> data = FXCollections.observableArrayList();



    public void remplissageTableau(){
            for (int i=0;i<listeOuvrages.size();i++){
               data.add(listeOuvrages.get(i));
            }
        TableauLivres.setItems(data);
    }


     @Override
  public void initialize(URL location, ResourceBundle resources) {

        NomCol.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
       NisbnCol.setCellValueFactory(cellData -> cellData.getValue().nisbnProperty().asObject());
        DateApparitionCol.setCellValueFactory(cellData -> cellData.getValue().dateApparitionProperty());
         NombreDemandesCol.setCellValueFactory(cellData -> cellData.getValue().nbrdemandesProperty().asObject());

        remplissageTableau();

    }





}
