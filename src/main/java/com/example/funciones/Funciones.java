package com.example.funciones;

import com.example.conexion.Conector;
import javafx.scene.control.TextField;

import javax.swing.*;
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

    public static void validar(String aleatoria, TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5) {
        String test = tf1.getText() + tf2.getText() + tf3.getText() + tf4.getText() + tf5.getText();
        System.out.println(aleatoria + "   " + test);
        boolean foco = false;
        if (cn.comprobar(test)==false){
            tf4.requestFocus();
            JOptionPane.showMessageDialog(null,"ESTA PALABRA NO EXISTE EN LA BASE DE DATOS");
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
                if (aleatoria.charAt(0) == tf1.getText().charAt(0)) {
                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf1.getText().charAt(0)))) {
                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                }

                if (aleatoria.charAt(1) == tf2.getText().charAt(0)) {
                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf2.getText().charAt(0)))) {
                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                }

                if (aleatoria.charAt(2) == tf3.getText().charAt(0)) {
                    tf3.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf3.getText().charAt(0)))) {
                    tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                }

                if (aleatoria.charAt(3) == tf4.getText().charAt(0)) {
                    tf4.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf4.getText().charAt(0)))) {
                    tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                }

                if (aleatoria.charAt(4) == tf5.getText().charAt(0)) {
                    tf5.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else if (aleatoria.contains(("" + tf5.getText().charAt(0)))) {
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
