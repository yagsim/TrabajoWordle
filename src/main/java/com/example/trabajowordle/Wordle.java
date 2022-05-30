package com.example.trabajowordle;

import com.example.conexion.Conector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Wordle extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Wordle.class.getResource("wordle2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 697, 834);
        stage.setTitle("Wordle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Conector cn = Conector.getInstancia();
        cn.connect();
        cn.aleatorio(cn.select());
        launch();
    }



}
