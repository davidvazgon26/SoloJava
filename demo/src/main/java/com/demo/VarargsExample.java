package com.demo;

public class VarargsExample {

    // public static void sumarEnteros() {
    // System.out.println("No pasaste argumentos");
    // }

    // public static void sumarEnteros(int valor1) {
    // System.out.println("No puedo sumar un solo valor, el valor es: " + valor1);
    // }

    // public static String sumarEnteros(int valor1, int valor2) {
    // int result = valor1 + valor2;
    // return "La suma de los valores es: " + result;
    // }

    /* Reemplazar los metodos sobrecargados por varargs */

    public static int sumarEnteros(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumarEnteros());
        System.out.println(sumarEnteros(5));
        System.out.println(sumarEnteros(5, 8));
        System.out.println(sumarEnteros(5, 8, 7, 12));

    }
}
