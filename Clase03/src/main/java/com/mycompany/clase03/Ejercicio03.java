/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license/default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

import javax.swing.JOptionPane;

/**
 *
 * @author andresvargasrivera
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        // Solicitar al usuario un número mediante JOptionPane
        String input = JOptionPane.showInputDialog("Ingrese el número de filas para dibujar un triángulo:");
        int filas = Integer.parseInt(input);

        // Dibujar el triángulo utilizando diferentes ciclos
        System.out.println("Triángulo usando FOR:");
        dibujarTrianguloFor(filas);

        System.out.println("\nTriángulo usando WHILE:");
        dibujarTrianguloWhile(filas);

        System.out.println("\nTriángulo usando DO-WHILE:");
        dibujarTrianguloDoWhile(filas);
    }

    /**
     * Dibuja un triángulo usando un ciclo FOR.
     */
    public static void dibujarTrianguloFor(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    /**
     * Dibuja un triángulo usando un ciclo WHILE.
     */
    public static void dibujarTrianguloWhile(int filas) {
        int i = 1;
        while (i <= filas) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Salto de línea al final de cada fila
            i++;
        }
    }

    /**
     * Dibuja un triángulo usando un ciclo DO-WHILE.
     */
    public static void dibujarTrianguloDoWhile(int filas) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);
            System.out.println(); // Salto de línea al final de cada fila
            i++;
        } while (i <= filas);
    }
}
