package kz.stargazer.arkham_horror_client.view_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;


public class MenuController{

    @FXML
    public void onSinglePlayerClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/single-creation.fxml"));
        ((Node)actionEvent.getSource()).getScene().setRoot(root);
    }

}