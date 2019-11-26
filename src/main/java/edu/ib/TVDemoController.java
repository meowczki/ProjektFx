package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TVDemoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Person> tvData;

    @FXML
    private TableColumn<String, Person> column1;

    @FXML
    private TableColumn<String, Person> column2;

    @FXML
    private Button btnLoad;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnSortFirst;

    @FXML
    private Button btnSortLast;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        tvData.getItems().clear();
    }

    @FXML
    void loadButtonPressed(ActionEvent event) {
        tvData.getItems().add(new Person("ola", "s"));
        tvData.getItems().add(new Person("John", "Doe"));
        tvData.getItems().add(new Person("Jane", "Deer"));
    }

    @FXML
    void sortFirstButtonPressed(ActionEvent event) {
    }

    @FXML
    void sortLastButtonPressed(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tvData != null : "fx:id=\"tvData\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert column1 != null : "fx:id=\"column1\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert column2 != null : "fx:id=\"column2\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnLoad != null : "fx:id=\"btnLoad\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnSortFirst != null : "fx:id=\"btnSortFirst\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnSortLast != null : "fx:id=\"btnSortLast\" was not injected: check your FXML file 'tvdemo.fxml'.";
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));//nazwa pola Person
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));//nazwa pola Person

    }
}
