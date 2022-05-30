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
        if (text_1_1.isFocused()) {
            text_1_1.setText("Q");
            text_1_2.requestFocus();
        } else if (text_1_2.isFocused()) {
            text_1_2.setText("Q");
            text_1_3.requestFocus();
        } else if (text_1_3.isFocused()) {
            text_1_3.setText("Q");
            text_1_4.requestFocus();
        } else if (text_1_4.isFocused()) {
            text_1_4.setText("Q");
            text_1_5.requestFocus();
        } else if (text_1_5.isFocused()) {
            text_1_5.setText("Q");
        } else if (text_2_1.isFocused()) {
            text_2_1.setText("Q");
            text_2_2.requestFocus();
        } else if (text_2_2.isFocused()) {
            text_2_2.setText("Q");
            text_2_3.requestFocus();
        } else if (text_2_3.isFocused()) {
            text_2_3.setText("Q");
            text_2_4.requestFocus();
        } else if (text_2_4.isFocused()) {
            text_2_4.setText("Q");
            text_2_5.requestFocus();
        } else if (text_2_5.isFocused()) {
            text_2_5.setText("Q");
        } else if (text_3_1.isFocused()) {
            text_3_1.setText("Q");
            text_3_2.requestFocus();
        } else if (text_3_2.isFocused()) {
            text_3_2.setText("Q");
            text_3_3.requestFocus();
        } else if (text_3_3.isFocused()) {
            text_3_3.setText("Q");
            text_3_4.requestFocus();
        } else if (text_3_4.isFocused()) {
            text_3_4.setText("Q");
            text_3_5.requestFocus();
        } else if (text_3_5.isFocused()) {
            text_3_5.setText("Q");
        } else if (text_4_1.isFocused()) {
            text_4_1.setText("Q");
            text_4_2.requestFocus();
        } else if (text_4_2.isFocused()) {
            text_4_2.setText("Q");
            text_4_3.requestFocus();
        } else if (text_4_3.isFocused()) {
            text_4_3.setText("Q");
            text_4_4.requestFocus();
        } else if (text_4_4.isFocused()) {
            text_4_4.setText("Q");
            text_4_5.requestFocus();
        } else if (text_4_5.isFocused()) {
            text_4_5.setText("Q");
        } else if (text_5_1.isFocused()) {
            text_5_1.setText("Q");
            text_5_2.requestFocus();
        } else if (text_5_2.isFocused()) {
            text_5_2.setText("Q");
            text_5_3.requestFocus();
        } else if (text_5_3.isFocused()) {
            text_5_3.setText("Q");
            text_5_4.requestFocus();
        } else if (text_5_4.isFocused()) {
            text_5_4.setText("Q");
            text_5_5.requestFocus();
        } else if (text_5_5.isFocused()) {
            text_5_5.setText("Q");
        } else if (text_6_1.isFocused()) {
            text_6_1.setText("Q");
            text_6_2.requestFocus();
        } else if (text_6_2.isFocused()) {
            text_6_2.setText("Q");
            text_6_3.requestFocus();
        } else if (text_6_3.isFocused()) {
            text_6_3.setText("Q");
            text_6_4.requestFocus();
        } else if (text_6_4.isFocused()) {
            text_6_4.setText("Q");
            text_6_5.requestFocus();
        } else if (text_6_5.isFocused()) {
            text_6_5.setText("Q");
        }
    }
    public void btnW(){
        if (text_1_1.isFocused()) {
            text_1_1.setText("W");
            text_1_2.requestFocus();
        } else if (text_1_2.isFocused()) {
            text_1_2.setText("W");
            text_1_3.requestFocus();
        } else if (text_1_3.isFocused()) {
            text_1_3.setText("W");
            text_1_4.requestFocus();
        } else if (text_1_4.isFocused()) {
            text_1_4.setText("W");
            text_1_5.requestFocus();
        } else if (text_1_5.isFocused()) {
            text_1_5.setText("W");
        } else if (text_2_1.isFocused()) {
            text_2_1.setText("W");
            text_2_2.requestFocus();
        } else if (text_2_2.isFocused()) {
            text_2_2.setText("W");
            text_2_3.requestFocus();
        } else if (text_2_3.isFocused()) {
            text_2_3.setText("W");
            text_2_4.requestFocus();
        } else if (text_2_4.isFocused()) {
            text_2_4.setText("W");
            text_2_5.requestFocus();
        } else if (text_2_5.isFocused()) {
            text_2_5.setText("W");
        } else if (text_3_1.isFocused()) {
            text_3_1.setText("W");
            text_3_2.requestFocus();
        } else if (text_3_2.isFocused()) {
            text_3_2.setText("W");
            text_3_3.requestFocus();
        } else if (text_3_3.isFocused()) {
            text_3_3.setText("W");
            text_3_4.requestFocus();
        } else if (text_3_4.isFocused()) {
            text_3_4.setText("W");
            text_3_5.requestFocus();
        } else if (text_3_5.isFocused()) {
            text_3_5.setText("W");
        } else if (text_4_1.isFocused()) {
            text_4_1.setText("W");
            text_4_2.requestFocus();
        } else if (text_4_2.isFocused()) {
            text_4_2.setText("W");
            text_4_3.requestFocus();
        } else if (text_4_3.isFocused()) {
            text_4_3.setText("W");
            text_4_4.requestFocus();
        } else if (text_4_4.isFocused()) {
            text_4_4.setText("W");
            text_4_5.requestFocus();
        } else if (text_4_5.isFocused()) {
            text_4_5.setText("W");
        } else if (text_5_1.isFocused()) {
            text_5_1.setText("W");
            text_5_2.requestFocus();
        } else if (text_5_2.isFocused()) {
            text_5_2.setText("W");
            text_5_3.requestFocus();
        } else if (text_5_3.isFocused()) {
            text_5_3.setText("W");
            text_5_4.requestFocus();
        } else if (text_5_4.isFocused()) {
            text_5_4.setText("W");
            text_5_5.requestFocus();
        } else if (text_5_5.isFocused()) {
            text_5_5.setText("W");
        } else if (text_6_1.isFocused()) {
            text_6_1.setText("W");
            text_6_2.requestFocus();
        } else if (text_6_2.isFocused()) {
            text_6_2.setText("W");
            text_6_3.requestFocus();
        } else if (text_6_3.isFocused()) {
            text_6_3.setText("W");
            text_6_4.requestFocus();
        } else if (text_6_4.isFocused()) {
            text_6_4.setText("W");
            text_6_5.requestFocus();
        } else if (text_6_5.isFocused()) {
            text_6_5.setText("W");
        }
    }
    public void btnE(){
        if (text_1_1.isFocused()) {
            text_1_1.setText("E");
            text_1_2.requestFocus();
        } else if (text_1_2.isFocused()) {
            text_1_2.setText("E");
            text_1_3.requestFocus();
        } else if (text_1_3.isFocused()) {
            text_1_3.setText("E");
            text_1_4.requestFocus();
        } else if (text_1_4.isFocused()) {
            text_1_4.setText("E");
            text_1_5.requestFocus();
        } else if (text_1_5.isFocused()) {
            text_1_5.setText("E");
        } else if (text_2_1.isFocused()) {
            text_2_1.setText("E");
            text_2_2.requestFocus();
        } else if (text_2_2.isFocused()) {
            text_2_2.setText("E");
            text_2_3.requestFocus();
        } else if (text_2_3.isFocused()) {
            text_2_3.setText("E");
            text_2_4.requestFocus();
        } else if (text_2_4.isFocused()) {
            text_2_4.setText("E");
            text_2_5.requestFocus();
        } else if (text_2_5.isFocused()) {
            text_2_5.setText("E");
        } else if (text_3_1.isFocused()) {
            text_3_1.setText("E");
            text_3_2.requestFocus();
        } else if (text_3_2.isFocused()) {
            text_3_2.setText("E");
            text_3_3.requestFocus();
        } else if (text_3_3.isFocused()) {
            text_3_3.setText("E");
            text_3_4.requestFocus();
        } else if (text_3_4.isFocused()) {
            text_3_4.setText("E");
            text_3_5.requestFocus();
        } else if (text_3_5.isFocused()) {
            text_3_5.setText("E");
        } else if (text_4_1.isFocused()) {
            text_4_1.setText("E");
            text_4_2.requestFocus();
        } else if (text_4_2.isFocused()) {
            text_4_2.setText("E");
            text_4_3.requestFocus();
        } else if (text_4_3.isFocused()) {
            text_4_3.setText("E");
            text_4_4.requestFocus();
        } else if (text_4_4.isFocused()) {
            text_4_4.setText("E");
            text_4_5.requestFocus();
        } else if (text_4_5.isFocused()) {
            text_4_5.setText("E");
        } else if (text_5_1.isFocused()) {
            text_5_1.setText("E");
            text_5_2.requestFocus();
        } else if (text_5_2.isFocused()) {
            text_5_2.setText("E");
            text_5_3.requestFocus();
        } else if (text_5_3.isFocused()) {
            text_5_3.setText("E");
            text_5_4.requestFocus();
        } else if (text_5_4.isFocused()) {
            text_5_4.setText("E");
            text_5_5.requestFocus();
        } else if (text_5_5.isFocused()) {
            text_5_5.setText("E");
        } else if (text_6_1.isFocused()) {
            text_6_1.setText("E");
            text_6_2.requestFocus();
        } else if (text_6_2.isFocused()) {
            text_6_2.setText("E");
            text_6_3.requestFocus();
        } else if (text_6_3.isFocused()) {
            text_6_3.setText("E");
            text_6_4.requestFocus();
        } else if (text_6_4.isFocused()) {
            text_6_4.setText("E");
            text_6_5.requestFocus();
        } else if (text_6_5.isFocused()) {
            text_6_5.setText("E");
        }
    }

}