package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField numberField;
    @FXML
    private Label answerLabel;
    @FXML
    private Label randomNumber1;



    public void guessNumber(ActionEvent actionEvent){
        String number = numberField.getText();

        Random rand = new Random();
        int randomNumber  = rand.nextInt(10) + 1;
        int a = Integer.parseInt(numberField.getText());


        if(a == randomNumber) {
            randomNumber1.setText("");
            answerLabel.setText("Valio atspejote " + number);

        }
            else{
                answerLabel.setText("");
                randomNumber1.setText("Deja jus nepataikete "+randomNumber);
            }

        }

    }

