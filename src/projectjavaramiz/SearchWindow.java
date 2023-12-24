/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjavaramiz;

/**
 *
 * @author Smart
 */
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SearchWindow {

    public static void display() {
        Stage searchStage = new Stage();
        searchStage.setTitle("Search Books");

        // Implement search window components
        Label searchLabel = new Label("Enter search criteria:");
        TextField searchField = new TextField();
        Button searchButton = new Button("Search");

        searchButton.setOnAction(e -> searchBooks(searchField.getText()));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(searchLabel, searchField, searchButton);

        Scene scene = new Scene(layout, 300, 200);
        searchStage.setScene(scene);
        searchStage.show();
    }

    private static void searchBooks(String criteria) {
        // Implement search logic based on the criteria
    }
}

    

