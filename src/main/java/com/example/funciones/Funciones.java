package com.example.funciones;

import com.example.conexion.Conector;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Funciones {

    private static Conector cn = Conector.getInstancia();
    public static String pAleatoria = Funciones.aleatorio(cn.select());

    public static String aleatorio(ArrayList<String> palabras) {
        Random ran = new Random();
        int randomitem = ran.nextInt(palabras.size());
        String randomElement = palabras.get(randomitem);
        return randomElement;
    }

    public static void validar(String aleatoria, TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5) {
        String test = tf1.getText() + tf2.getText() + tf3.getText() + tf4.getText() + tf5.getText();
        char letra1 = tf1.getText().charAt(0);
        char letra2 = tf2.getText().charAt(0);
        char letra3 = tf3.getText().charAt(0);
        char letra4 = tf4.getText().charAt(0);
        char letra5 = tf5.getText().charAt(0);
        int cont1 = 0;
        for (int i = 0; i < aleatoria.length(); i++) {
            if (aleatoria.charAt(i) == letra1)
                cont1++;
        }
        int cont2 = 0;
        for (int i = 0; i < aleatoria.length(); i++) {
            if (aleatoria.charAt(i) == letra2)
                cont2++;
        }
        int cont3 = 0;
        for (int i = 0; i < aleatoria.length(); i++) {
            if (aleatoria.charAt(i) == letra3)
                cont3++;
        }
        int cont4 = 0;
        for (int i = 0; i < aleatoria.length(); i++) {
            if (aleatoria.charAt(i) == letra4)
                cont4++;
        }
        if (cn.comprobar(test)==false) {
            tf4.requestFocus();
            JOptionPane.showMessageDialog(null, "ESTA PALABRA NO EXISTE EN LA BASE DE DATOS");
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
                    } else {
                        tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
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
}
