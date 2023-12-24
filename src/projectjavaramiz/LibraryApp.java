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
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LibraryApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Registration System");

        // Create components
        Button searchButton = new Button("Search Books");
        Button loanButton = new Button("Check Loans");

        // Add event handlers
        searchButton.setOnAction(e -> showSearchWindow());
        loanButton.setOnAction(e -> showLoanWindow());

        // Create layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(searchButton, loanButton);

        // Create scene
        Scene scene = new Scene(layout, 300, 200);

        // Set the scene
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private void showSearchWindow() {
        // Implement logic to display search window
    }

    private void showLoanWindow() {
        // Implement logic to display loan window
    }
}

    

