package com.example.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    private final String URL = ".\\TrabajoWordleDB.db";
    private Connection connect;
    private static Conector instancia = null;

    private Conector(){}
    public static Conector getInstancia() {
        if (instancia == null) {
            instancia = new Conector();
        }
        return instancia;
    }

    public void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:"+URL);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
    }
    public void close() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void vertirStringaBD(String datos)  {

    }
}
