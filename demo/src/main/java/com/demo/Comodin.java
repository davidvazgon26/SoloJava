package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Comodin {
    // Método que acepta una lista de cualquier tipo y lo imprime
    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    // Método que acepta una lista de cualquier tipo acotado por una superclase de
    // Tipo
    public static void agregarElemento(List<? super Integer> lista) {
        lista.add(42);
    }

    public static void main(String[] args) {
        // Uso del comodín no acotado
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Hola");
        listaStrings.add("Mundo");
        imprimirLista(listaStrings);

        // Uso del comodín acotado superior
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);
        imprimirLista(listaEnteros);

        // Uso del comodín acotado inferior
        List<Number> listaNumeros = new ArrayList<>();
        agregarElemento(listaNumeros);
        imprimirLista(listaNumeros);
    }
}
