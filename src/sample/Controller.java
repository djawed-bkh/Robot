package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button buttonReservations;
    @FXML
    private Button ButtonListeNoir;

    @FXML
    private Button ButtonOuvrages;

    @FXML
    private Button liste;

    @FXML
    private Button listeetudiant;

    @FXML
    private Button listemploye;

    @FXML
    private Button listeenseignant;
    @FXML
    private MenuItem closeButton;

    @FXML
    void afficheretudiants(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/etudiant.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Etudiants");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void afficherDoctorants(ActionEvent event) throws IOException{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Doctorants.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Doctorants");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void afficheremploye(ActionEvent event) throws IOException{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/employe.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Employes");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void afficherenseignant(ActionEvent event) throws IOException{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/enseignant.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Enseignants");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    // partie ouvrages


    @FXML
    void afficherOuvrages(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Demandes.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Ouvrages");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    @FXML
    void AfficherListeNoir(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/employe.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Liste noir");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void afficherlisteReservations(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Reservations.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Reservations");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    @FXML
    void closeMet(ActionEvent event){
    	System.exit(0);
    }

}
