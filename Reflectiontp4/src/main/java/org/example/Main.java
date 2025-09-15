package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        System.out.println("Lista de Enteros:");
        ListaImpresora.imprimirLista(listaEnteros);


        List<String> listaCadenas = List.of("Uno", "Dos", "Tres", "Cuatro", "Cinco");
        System.out.println("\nLista de Cadenas:");
        ListaImpresora.imprimirLista(listaCadenas);
    }
}
