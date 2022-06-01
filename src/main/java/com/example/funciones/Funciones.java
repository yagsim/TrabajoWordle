package com.example.funciones;

import com.example.conexion.Conector;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Funciones {

    private static Conector cn = Conector.getInstancia();
    public static String pAleatoria = Funciones.aleatorio(cn.select());

    public static String aleatorio(ArrayList<String> palabras){
        Random ran = new Random();
        int randomitem = ran.nextInt(palabras.size());
        String randomElement = palabras.get(randomitem);
        return randomElement;
    }

    public static void validar(String aleatoria,Button q,Button w,Button e,Button r,Button t,Button y,Button u,Button i ,Button o,Button p ,Button a,Button s,Button d,Button f,Button g,Button h,Button j,Button k,Button l,Button ñ , Button z,Button x,Button c,Button v,Button b,Button n,Button m,  ToolBar msg_db, Button btn_msg_db, GridPane grdTF, GridPane grdBtn, TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5) {
        String test = tf1.getText() + tf2.getText() + tf3.getText() + tf4.getText() + tf5.getText();
        char letra1 = tf1.getText().charAt(0);
        char letra2 = tf2.getText().charAt(0);
        char letra3 = tf3.getText().charAt(0);
        char letra4 = tf4.getText().charAt(0);
        char letra5 = tf5.getText().charAt(0);
        int cont1 = 0;
        for (int is = 0; is < aleatoria.length(); is++) {
            if (aleatoria.charAt(is) == letra1)
                cont1++;
        }
        int cont2 = 0;
        for (int is = 0; is < aleatoria.length(); is++) {
            if (aleatoria.charAt(is) == letra2)
                cont2++;
        }
        int cont3 = 0;
        for (int is = 0; is < aleatoria.length(); is++) {
            if (aleatoria.charAt(is) == letra3)
                cont3++;
        }
        int cont4 = 0;
        for (int is = 0; is < aleatoria.length(); is++) {
            if (aleatoria.charAt(is) == letra4)
                cont4++;
        }
        if (cn.comprobar(test)==false) {
            msg_db.setVisible(true);
            grdBtn.setDisable(true);
            grdTF.setDisable(true);
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            btn_msg_db.requestFocus();
        } else {
            tf1.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
            tf2.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
            tf3.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
            tf4.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
            tf5.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
            if (aleatoria.equals(test)) {
                tf1.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                tf2.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                tf3.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                tf4.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                tf5.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
            } else {
                if (aleatoria.charAt(0) == letra1) {
                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + letra1))) {
                    if ((letra1==letra2 || letra1==letra3 || letra1==letra4 || letra1==letra5)) {
                        if (aleatoria.charAt(1)!=letra2 && aleatoria.charAt(2)!=letra3 && aleatoria.charAt(3)!=letra4 && aleatoria.charAt(4)!=letra5)
                            tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    } else {
                        tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }

                }

                if (aleatoria.charAt(1) == letra2) {
                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + letra2))) {
                    if (letra2==letra3 || letra2==letra4 || letra2==letra5) {
                        if (aleatoria.charAt(2) != letra3 && aleatoria.charAt(3) != letra4 && aleatoria.charAt(4) != letra5)
                            tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }else if ((letra2==letra1)) {
                        if (cont1 > 1)
                            tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    } else {
                        tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }
                }

                if (aleatoria.charAt(2) == tf3.getText().charAt(0)) {
                    tf3.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf3.getText().charAt(0)))) {
                    if (letra3==letra4 || letra3==letra5) {
                        if (aleatoria.charAt(3) != letra4 && aleatoria.charAt(4) != letra5)
                            tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }else if (letra3==letra1  || letra3==letra2 ) {
                        if (cont1 > 1 || cont2 > 1)
                            tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    } else {
                        tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }
                }

                if (aleatoria.charAt(3) == tf4.getText().charAt(0)) {
                    tf4.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf4.getText().charAt(0)))) {
                    if (letra4==letra5) {
                        if (aleatoria.charAt(4) != letra5)
                            tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    } else if (letra4==letra1  || letra4==letra2  || letra4==letra3) {
                        if (cont1 > 1 || cont2 > 1 || cont3 > 1)
                            tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    } else {
                        tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }
                }

                if (aleatoria.charAt(4) == tf5.getText().charAt(0)) {
                    tf5.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf5.getText().charAt(0)))) {
                    if (letra5==letra1 || letra5==letra2 || letra5==letra3 || letra5==letra4) {
                        if (cont1 > 1 || cont2 > 1 || cont3 > 1 || cont4 > 1)
                            tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            q.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            a.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    } else {
                        tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                    }
                    if(aleatoria.charAt(4)==tf5.getText().charAt(0)){
                        q.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        a.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        s.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        o.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                    }
                }
                tf1.setEditable(false);
                tf2.setEditable(false);
                tf3.setEditable(false);
                tf4.setEditable(false);
                tf5.setEditable(false);
            }
        }
    }
    public static void botonTeclado(String letra,TextField text_1_1,TextField text_1_2,TextField text_1_3,TextField text_1_4,TextField text_1_5,
                             TextField text_2_1,TextField text_2_2,TextField text_2_3,TextField text_2_4,TextField text_2_5,
                             TextField text_3_1,TextField text_3_2,TextField text_3_3,TextField text_3_4 ,TextField text_3_5,
                             TextField text_4_1, TextField text_4_2,TextField text_4_3,TextField text_4_4 ,TextField text_4_5,
                             TextField text_5_1,TextField text_5_2,TextField text_5_3,TextField text_5_4 ,TextField text_5_5,
                             TextField text_6_1,TextField text_6_2,TextField text_6_3,TextField text_6_4 ,TextField text_6_5) {
        if (text_1_1.isFocused()) {
            text_1_1.setText(letra);
            text_1_2.requestFocus();
        } else if (text_1_2.isFocused()) {
            text_1_2.setText(letra);
            text_1_3.requestFocus();
        } else if (text_1_3.isFocused()) {
            text_1_3.setText(letra);
            text_1_4.requestFocus();
        } else if (text_1_4.isFocused()) {
            text_1_4.setText(letra);
            text_1_5.requestFocus();
        } else if (text_1_5.isFocused()) {
            text_1_5.setText(letra);
        } else if (text_2_1.isFocused()) {
            text_2_1.setText(letra);
            text_2_2.requestFocus();
        } else if (text_2_2.isFocused()) {
            text_2_2.setText(letra);
            text_2_3.requestFocus();
        } else if (text_2_3.isFocused()) {
            text_2_3.setText(letra);
            text_2_4.requestFocus();
        } else if (text_2_4.isFocused()) {
            text_2_4.setText(letra);
            text_2_5.requestFocus();
        } else if (text_2_5.isFocused()) {
            text_2_5.setText(letra);
        } else if (text_3_1.isFocused()) {
            text_3_1.setText(letra);
            text_3_2.requestFocus();
        } else if (text_3_2.isFocused()) {
            text_3_2.setText(letra);
            text_3_3.requestFocus();
        } else if (text_3_3.isFocused()) {
            text_3_3.setText(letra);
            text_3_4.requestFocus();
        } else if (text_3_4.isFocused()) {
            text_3_4.setText(letra);
            text_3_5.requestFocus();
        } else if (text_3_5.isFocused()) {
            text_3_5.setText(letra);
        } else if (text_4_1.isFocused()) {
            text_4_1.setText(letra);
            text_4_2.requestFocus();
        } else if (text_4_2.isFocused()) {
            text_4_2.setText(letra);
            text_4_3.requestFocus();
        } else if (text_4_3.isFocused()) {
            text_4_3.setText(letra);
            text_4_4.requestFocus();
        } else if (text_4_4.isFocused()) {
            text_4_4.setText(letra);
            text_4_5.requestFocus();
        } else if (text_4_5.isFocused()) {
            text_4_5.setText(letra);
        } else if (text_5_1.isFocused()) {
            text_5_1.setText(letra);
            text_5_2.requestFocus();
        } else if (text_5_2.isFocused()) {
            text_5_2.setText(letra);
            text_5_3.requestFocus();
        } else if (text_5_3.isFocused()) {
            text_5_3.setText(letra);
            text_5_4.requestFocus();
        } else if (text_5_4.isFocused()) {
            text_5_4.setText(letra);
            text_5_5.requestFocus();
        } else if (text_5_5.isFocused()) {
            text_5_5.setText(letra);
        } else if (text_6_1.isFocused()) {
            text_6_1.setText(letra);
            text_6_2.requestFocus();
        } else if (text_6_2.isFocused()) {
            text_6_2.setText(letra);
            text_6_3.requestFocus();
        } else if (text_6_3.isFocused()) {
            text_6_3.setText(letra);
            text_6_4.requestFocus();
        } else if (text_6_4.isFocused()) {
            text_6_4.setText(letra);
            text_6_5.requestFocus();
        } else if (text_6_5.isFocused()) {
            text_6_5.setText(letra);
        }
    }

    public void resultado(){

    }
}
