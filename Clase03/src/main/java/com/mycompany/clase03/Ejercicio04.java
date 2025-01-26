/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license/default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author andresvargasrivera
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        // Mostrar valores entre 20 y 30 usando diferentes ciclos
        System.out.println("Valores entre 20 y 30 usando FOR:");
        mostrarValoresFor();

        System.out.println("\nValores entre 20 y 30 usando WHILE:");
        mostrarValoresWhile();

        System.out.println("\nValores entre 20 y 30 usando DO-WHILE:");
        mostrarValoresDoWhile();
    }

    /**
     * Muestra valores entre 20 y 30 junto con su cuadrado usando un ciclo FOR.
     */
    public static void mostrarValoresFor() {
        for (int i = 20; i <= 30; i++) {
            System.out.println("Número: " + i + ", Cuadrado: " + (i * i));
        }
    }

    /**
     * Muestra valores entre 20 y 30 junto con su cuadrado usando un ciclo WHILE.
     */
    public static void mostrarValoresWhile() {
        int i = 20;
        while (i <= 30) {
            System.out.println("Número: " + i + ", Cuadrado: " + (i * i));
            i++;
        }
    }

    /**
     * Muestra valores entre 20 y 30 junto con su cuadrado usando un ciclo DO-WHILE.
     */
    public static void mostrarValoresDoWhile() {
        int i = 20;
        do {
            System.out.println("Número: " + i + ", Cuadrado: " + (i * i));
            i++;
        } while (i <= 30);
    }
}
