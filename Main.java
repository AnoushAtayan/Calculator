package sample;

import javafx.application.Application;

import javafx.geometry.Insets;

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


        //button section
        Button enterButton = new Button("Calculate");
        GridPane.setConstraints(enterButton, 11, 27);


        //net salary section
        Label netSalary = new Label("Net Salary");
        GridPane.setConstraints(netSalary, 10, 29);

        Label netSalaryInput = new Label();
        GridPane.setConstraints(netSalaryInput, 11, 29);



       enterButton.setOnAction(e -> {

            double inputValue;
            try {
                inputValue = Double.parseDouble(grossSalaryInput.getText());
                SalaryCalculation sc = new SalaryCalculation();
                double result = sc.netSalaryCalculation(inputValue);
                netSalaryInput.setText(String.valueOf(result));

            }
            catch (NumberFormatException ex){
                System.out.println("Invalid input");
                ex.printStackTrace();

            }
            catch (Exception ex){
                ex.printStackTrace();

            }
        });


        grid.getChildren().addAll(grossSalary, netSalary, netSalaryInput,  grossSalaryInput, enterButton);


        Scene scene = new Scene(grid, 520, 520);
        primaryStage.setScene(scene);
        primaryStage.show();
    }




}



