package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>();
        cajaString.almacenar("Hola, Mundo");
        System.out.println("Contenido de Caja<String>: " + cajaString.obtener());


        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.almacenar(123);
        System.out.println("Contenido de Caja<Integer>: " + cajaInteger.obtener());


        List lista = new ArrayList();
        lista.add("Texto");
        lista.add(456);


        for (Object obj : lista) {
            System.out.println("Contenido de la lista sin genéricos: " + obj);
        }
    }
}
