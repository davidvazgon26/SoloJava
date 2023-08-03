package com.demo;

import java.util.ArrayList;

public class MiClaseGenerica<T> {

    private T valor;

    public MiClaseGenerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    // Método genérico que imprime un valor específico del objeto genérico
    public <U> void imprimirValor(U otroValor) {
        System.out.println("Valor almacenado: " + valor);
        System.out.println("Otro valor: " + otroValor);
    }

    public static void main(String[] args) {
        // Crear una instancia de MiClaseGenerica con un tipo Integer
        MiClaseGenerica<Integer> miObjGenerico1 = new MiClaseGenerica<>(42);
        int valor1 = miObjGenerico1.getValor();
        System.out.println("Valor 1: " + valor1);

        // Crear una instancia de MiClaseGenerica con un tipo Integer
        MiClaseGenerica<String> miObjGenerico2 = new MiClaseGenerica<>("Hola Mundo");
        miObjGenerico2.setValor("Otra cosa");
        String valor2 = miObjGenerico2.getValor();
        System.out.println("Valor 2: " + valor2);

        // Crear una instancia de MiClaseGenerica con un tipo Boolean
        MiClaseGenerica<Boolean> miObjGenerico3 = new MiClaseGenerica<Boolean>(false);
        Boolean valor3 = miObjGenerico3.getValor();
        System.out.println("Valor 3 " + valor3);

        // También puedes utilizar tipos de referencia personalizados
        // Aquí, usaremos un ArrayList como tipo genérico
        MiClaseGenerica<ArrayList<Integer>> miObjGenerico4 = new MiClaseGenerica<>(new ArrayList<>());
        ArrayList<Integer> lista = miObjGenerico4.getValor();
        lista.add(15);
        lista.add(20);
        lista.add(26);
        System.out.println("Valores de la lista: " + lista);

        MiClaseGenerica<Integer> miObjetoGenerico = new MiClaseGenerica<>(33);
        miObjetoGenerico.imprimirValor("Hola, soy otro valor");
    }

}
