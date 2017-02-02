package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Salary Calculator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        //gross salary section
        Label grossSalary = new Label("Gross Salary");
        GridPane.setConstraints(grossSalary, 10, 25);

        TextField grossSalaryInput = new TextField();
        GridPane.setConstraints(grossSalaryInput, 11, 25);
        grossSalaryInput.setPromptText("Gross Salary");


         //net salary section
        /*Label netSalary = new Label("Net Salary");
        GridPane.setConstraints(netSalary, 10, 26);

        TextField netSalaryInput = new TextField();
        GridPane.setConstraints(netSalaryInput, 11, 26);
        netSalaryInput.setPromptText("Net Salary");*/



        //button section
        Button enterButton = new Button("Calculate");
        GridPane.setConstraints(enterButton, 11, 26);

        //clicked
        enterButton.setOnAction(e -> enterButtonClicked());


        grid.getChildren().addAll(grossSalary,  grossSalaryInput, enterButton);


        Scene scene = new Scene(grid, 520, 520);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // enter Button clicked
    public  void enterButtonClicked() {

    }

}



