package com.example.trabajowordle;


import com.example.funciones.Funciones;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
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
    public TextField text_3_1;
    public TextField text_3_2;
    public TextField text_3_3;
    public TextField text_3_4;
    public TextField text_3_5;
    public TextField text_4_1;
    public TextField text_4_2;
    public TextField text_4_3;
    public TextField text_4_4;
    public TextField text_4_5;
    public TextField text_5_1;
    public TextField text_5_2;
    public TextField text_5_3;
    public TextField text_5_4;
    public TextField text_5_5;
    public TextField text_6_1;
    public TextField text_6_2;
    public TextField text_6_3;
    public TextField text_6_4;
    public TextField text_6_5;
    public GridPane grid_textF;
    public Pane pane;


    public void typeTextF1_1(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            text_1_1.setText("");
        } else {
            text_1_1.setText(text_1_1.getText().toUpperCase());
            text_1_2.requestFocus();
        }
    }
    public void typeTextF1_2(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_1_2.getText().isEmpty()) {
                text_1_1.requestFocus();
                text_1_1.deselect();
            }
            text_1_2.setText("");
        } else {
               text_1_2.setText(text_1_2.getText().toUpperCase());
               text_1_3.requestFocus();
        }
    }
    public void typeTextF1_3(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_1_3.getText().isEmpty()) {
                text_1_2.requestFocus();
                text_1_2.deselect();
            }
            text_1_3.setText("");
        } else {
            text_1_3.setText(text_1_3.getText().toUpperCase());
            text_1_4.requestFocus();
        }
    }
    public void typeTextF1_4(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_1_4.getText().isEmpty()) {
                text_1_3.requestFocus();
                text_1_3.deselect();
            }
            text_1_4.setText("");
        } else {
            text_1_4.setText(text_1_4.getText().toUpperCase());
            text_1_5.requestFocus();
        }
    }
    public void typeTextF1_5(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            text_2_1.requestFocus();
            Funciones.validar(Funciones.pAleatoria, text_1_1, text_1_2, text_1_3, text_1_4, text_1_5);
        } else if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_1_5.getText().isEmpty()) {
                text_1_4.requestFocus();
                text_1_4.deselect();
            }
            text_1_5.setText("");
        } else {
            text_1_5.setText(text_1_5.getText().toUpperCase());
        }

    }
    public void typeTextF2_1(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            text_2_1.setText("");
            text_2_1.deselect();
        } else {
            text_2_1.setText(text_2_1.getText().toUpperCase());
            text_2_2.requestFocus();
        }
    }
    public void typeTextF2_2(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_2_2.getText().isEmpty()) {
                text_2_1.requestFocus();
                text_2_1.deselect();
            }
            text_2_2.setText("");
        } else {
            text_2_2.setText(text_2_2.getText().toUpperCase());
            text_2_3.requestFocus();
        }
    }
    public void typeTextF2_3(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_2_3.getText().isEmpty()) {
                text_2_2.requestFocus();
                text_2_2.deselect();
            }
            text_2_3.setText("");
        } else {
            text_2_3.setText(text_2_3.getText().toUpperCase());
            text_2_4.requestFocus();
        }
    }
    public void typeTextF2_4(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_2_4.getText().isEmpty()) {
                text_2_3.requestFocus();
                text_2_3.deselect();
            }
            text_2_4.setText("");
        } else {
            text_2_4.setText(text_2_4.getText().toUpperCase());
            text_2_5.requestFocus();
        }
    }
    public void typeTextF2_5(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            text_3_1.requestFocus();
            Funciones.validar(Funciones.pAleatoria, text_2_1, text_2_2, text_2_3, text_2_4, text_2_5);
        } else if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_2_5.getText().isEmpty()) {
                text_2_4.requestFocus();
                text_2_4.deselect();
            }
            text_2_5.setText("");
        } else {
            text_2_5.setText(text_2_5.getText().toUpperCase());
        }
    }
    public void typeTextF3_1(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            text_3_1.setText("");
        } else{
            text_3_1.setText(text_3_1.getText().toUpperCase());
            text_3_2.requestFocus();
        }
    }
    public void typeTextF3_2(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_3_2.getText().isEmpty()) {
                text_3_1.requestFocus();
                text_3_1.deselect();
            }
            text_3_2.setText("");
        } else {
            text_3_2.setText(text_3_2.getText().toUpperCase());
            text_3_3.requestFocus();
        }
    }
    public void typeTextF3_3(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_3_3.getText().isEmpty()) {
                text_3_2.requestFocus();
                text_3_2.deselect();
            }
            text_3_3.setText("");
        } else {
            text_3_3.setText(text_3_3.getText().toUpperCase());
            text_3_4.requestFocus();
        }
    }
    public void typeTextF3_4(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_3_4.getText().isEmpty()) {
                text_3_3.requestFocus();
                text_3_3.deselect();
            }
            text_3_4.setText("");
        } else {
            text_3_4.setText(text_3_4.getText().toUpperCase());
            text_3_5.requestFocus();
        }
    }
    public void typeTextF3_5( KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            text_4_1.requestFocus();
            Funciones.validar(Funciones.pAleatoria, text_3_1, text_3_2, text_3_3, text_3_4, text_3_5);
        } else if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_3_5.getText().isEmpty()) {
                text_3_4.requestFocus();
                text_3_4.deselect();
            }
            text_3_5.setText("");
        } else {
            text_3_5.setText(text_3_5.getText().toUpperCase());
        }
    }
    public void typeTextF4_1(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            text_4_1.setText("");
        } else{
            text_4_1.setText(text_4_1.getText().toUpperCase());
            text_4_2.requestFocus();
        }
    }
    public void typeTextF4_2(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_4_2.getText().isEmpty()) {
                text_4_1.requestFocus();
                text_4_1.deselect();
            }
            text_4_2.setText("");
        } else {
            text_4_2.setText(text_4_2.getText().toUpperCase());
            text_4_3.requestFocus();
        }
    }
    public void typeTextF4_3(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_4_3.getText().isEmpty()) {
                text_4_2.requestFocus();
                text_4_2.deselect();
            }
            text_4_3.setText("");
        } else {
            text_4_3.setText(text_4_3.getText().toUpperCase());
            text_4_4.requestFocus();
        }
    }
    public void typeTextF4_4(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_4_4.getText().isEmpty()) {
                text_4_3.requestFocus();
                text_4_3.deselect();
            }
            text_4_4.setText("");
        } else {
            text_4_4.setText(text_4_4.getText().toUpperCase());
            text_4_5.requestFocus();
        }
    }
    public void typeTextF4_5(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            text_5_1.requestFocus();
            Funciones.validar(Funciones.pAleatoria, text_4_1, text_4_2, text_4_3, text_4_4, text_4_5);
        } else if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_4_5.getText().isEmpty()) {
                text_4_4.requestFocus();
                text_4_4.deselect();
            }
            text_4_5.setText("");
        } else {
            text_4_5.setText(text_4_5.getText().toUpperCase());
        }
    }

    public void typeTextF5_1(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            text_5_1.setText("");
        } else{
            text_5_1.setText(text_5_1.getText().toUpperCase());
            text_5_2.requestFocus();
        }
    }
    public void typeTextF5_2(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_5_2.getText().isEmpty()) {
                text_5_1.requestFocus();
                text_5_1.deselect();
            }
            text_5_2.setText("");
        } else {
            text_5_2.setText(text_5_2.getText().toUpperCase());
            text_5_3.requestFocus();
        }
    }
    public void typeTextF5_3(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_5_3.getText().isEmpty()) {
                text_5_2.requestFocus();
                text_5_2.deselect();
            }
            text_5_3.setText("");
        } else {
            text_5_3.setText(text_5_3.getText().toUpperCase());
            text_5_4.requestFocus();
        }
    }
    public void typeTextF5_4(KeyEvent evt) {
         if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_5_4.getText().isEmpty()) {
                text_5_3.requestFocus();
                text_5_3.deselect();
            }
            text_5_4.setText("");
        } else {
            text_5_4.setText(text_5_4.getText().toUpperCase());
            text_5_5.requestFocus();
        }
    }
    public void typeTextF5_5(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            text_6_1.requestFocus();
            Funciones.validar(Funciones.pAleatoria, text_5_1, text_5_2, text_5_3, text_5_4, text_5_5);
        } else if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_5_5.getText().isEmpty()) {
                text_5_4.requestFocus();
                text_5_4.deselect();
            }
            text_5_5.setText("");
        } else {
            text_5_5.setText(text_5_5.getText().toUpperCase());
        }
    }
    public void typeTextF6_1(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            text_6_1.setText("");
        } else{
            text_6_1.setText(text_6_1.getText().toUpperCase());
            text_6_2.requestFocus();
        }
    }
    public void typeTextF6_2(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_6_2.getText().isEmpty()) {
                text_6_1.requestFocus();
                text_6_1.deselect();
            }
            text_6_2.setText("");
        } else {
            text_6_2.setText(text_6_2.getText().toUpperCase());
            text_6_3.requestFocus();
        }
    }
    public void typeTextF6_3(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_6_3.getText().isEmpty()) {
                text_6_2.requestFocus();
                text_6_2.deselect();
            }
            text_6_3.setText("");
        } else {
            text_6_3.setText(text_6_3.getText().toUpperCase());
            text_6_4.requestFocus();
        }
    }
    public void typeTextF6_4(KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_6_4.getText().isEmpty()) {
                text_6_3.requestFocus();
                text_6_3.deselect();
            }
            text_6_4.setText("");
        } else {
            text_6_4.setText(text_6_4.getText().toUpperCase());
            text_6_5.requestFocus();
        }
    }
    public void typeTextF6_5(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            Funciones.validar(Funciones.pAleatoria, text_6_1, text_6_2, text_6_3, text_6_4, text_6_5);
        } else if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (text_6_5.getText().isEmpty()) {
                text_6_4.requestFocus();
                text_6_4.deselect();
            }
            text_6_5.setText("");
        } else {
            text_6_5.setText(text_6_5.getText().toUpperCase());
        }
    }

    public void btnQ(){
        Funciones.botonTeclado("Q",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);

    }
    public void btnW(){
        Funciones.botonTeclado("W",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnE() {
        Funciones.botonTeclado("E", text_1_1, text_1_2, text_1_3, text_1_4, text_1_5,
                text_2_1, text_2_2, text_2_3, text_2_4, text_2_5,
                text_3_1, text_3_2, text_3_3, text_3_4, text_3_5,
                text_4_1, text_4_2, text_4_3, text_4_4, text_4_5,
                text_5_1, text_5_2, text_5_3, text_5_4, text_5_5,
                text_6_1, text_6_2, text_6_3, text_6_4, text_6_5);
    }
    public void btnR(){
        Funciones.botonTeclado("R",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnT(){
        Funciones.botonTeclado("T",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnY(){
        Funciones.botonTeclado("Y",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnU(){
        Funciones.botonTeclado("U",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnI(){
        Funciones.botonTeclado("I",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnO(){
        Funciones.botonTeclado("O",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnP(){
        Funciones.botonTeclado("P",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnA(){
        Funciones.botonTeclado("A",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnS(){
        Funciones.botonTeclado("S",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnD(){
        Funciones.botonTeclado("D",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnF(){
        Funciones.botonTeclado("F",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnG(){
        Funciones.botonTeclado("G",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnH(){
        Funciones.botonTeclado("H",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnJ(){
        Funciones.botonTeclado("J",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnK(){
        Funciones.botonTeclado("K",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnL(){
        Funciones.botonTeclado("L",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnÑ(){
        Funciones.botonTeclado("Ñ",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnZ(){
        Funciones.botonTeclado("Z",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnX(){
        Funciones.botonTeclado("X",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnC(){
        Funciones.botonTeclado("C",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnV(){
        Funciones.botonTeclado("V",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnB(){
        Funciones.botonTeclado("B",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnN(){
        Funciones.botonTeclado("N",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnM(){
        Funciones.botonTeclado("M",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    }