package com.example.funciones;

import java.util.ArrayList;
import java.util.Random;

public class Funciones {
    public static String aleatorio(ArrayList<String> palabras){
        Random ran = new Random();
        int randomitem = ran.nextInt(palabras.size());
        String randomElement = palabras.get(randomitem);
        return randomElement;
    }

    public static void validar(String aleatoria, String test) {

    }
}
