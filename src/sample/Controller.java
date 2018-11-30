package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
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
    void afficheretudiants(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/etudiant.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("etudiants");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void affichertout(ActionEvent event) throws IOException{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/abonnes.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("abonnes");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void afficheremploye(ActionEvent event) throws IOException{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/employe.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("employe");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void afficherenseignant(ActionEvent event) throws IOException{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/enseignant.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("enseignants");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    // partie ouvrages


    @FXML
    void afficherOuvrages(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Demandes.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("employe");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    @FXML
    void AfficherListeNoir(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/employe.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("employe");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
