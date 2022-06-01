package com.example.conexion;

import java.sql.*;
import java.util.ArrayList;
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
        try {
            String [] array = datos.split(" ");
            PreparedStatement st;
            for (int i = 0; i < array.length; i++) {
                st = connect.prepareStatement("insert into palabras (nombre) values((?))");
                st.setString(1, array[i]);
                st.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> select(){
        ArrayList<String> palabras = new ArrayList<>();
        ResultSet result;
        try {
            PreparedStatement st=connect.prepareStatement("select nombre from palabras");
            result=st.executeQuery();
            while(result.next()){
                palabras.add(result.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return palabras;
    }
    public boolean comprobar(String test){
        try {
            ResultSet result;
            PreparedStatement st=connect.prepareStatement("select count(*)  as count from palabras where nombre=(?)");
            st.setString(1,test);
            result=st.executeQuery();
            if(result.getInt("count")>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
