package com.example.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conector extends PlantillaConector {
    private static Conector instancia = null;

    private Conector(){}
    public static Conector getInstancia() {
        if (instancia == null) {
            instancia = new Conector();
        }
        return instancia;
    }

    @Override
    public void connect() {
        URL = ".\\TrabajoWordleDB.db";
        super.connect();
    }
    @Override
    public void close() {
        super.close();
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
