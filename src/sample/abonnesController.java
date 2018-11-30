package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class abonnesController {

    @FXML
    private TableColumn<?, ?> StatutCol;

    @FXML
    private TableColumn<?, ?> AddresseCol;

    @FXML
    private TextField recherchebarre;

    @FXML
    private TableColumn<?, ?> Nomcol;

    @FXML
    private TableView<?> abonnesTable;

}
