package com.example.trabajowordle;

import com.example.conexion.Conector;
import com.example.funciones.Funciones;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Wordle extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Wordle.class.getResource("wordle2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Wordle");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Conector cn = Conector.getInstancia();
        cn.connect();
        System.out.println(Funciones.pAleatoria);
        launch();
        cn.close();
    }



}
