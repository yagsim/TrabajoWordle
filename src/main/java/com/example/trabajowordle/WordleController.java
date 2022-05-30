package com.example.trabajowordle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class WordleController {
    public TextField text_1_1;
    public TextField text_1_2;
    public TextField text_1_3;
    public TextField text_1_4;
    public TextField text_1_5;
    public TextField text_2_1;
    public TextField text_2_2;
    public TextField text_2_3;
    public TextField text_2_4;
    public TextField text_2_5;
    public Pane pane;

    public void typeTextF1_1() {
        text_1_1.setText(text_1_1.getText().toUpperCase());
        text_1_2.requestFocus();
    }
    public void typeTextF1_2() {
        text_1_2.setText(text_1_2.getText().toUpperCase());
        text_1_3.requestFocus();
    }
    public void typeTextF1_3() {
        text_1_3.setText(text_1_3.getText().toUpperCase());
        text_1_4.requestFocus();
    }
    public void typeTextF1_4() {
        text_1_4.setText(text_1_4.getText().toUpperCase());
        text_1_5.requestFocus();
    }
    public void typeTextF1_5() {
        text_1_5.setText(text_1_5.getText().toUpperCase());
    }
}