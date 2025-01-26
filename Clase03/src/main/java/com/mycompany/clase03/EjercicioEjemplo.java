/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license/default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author andresvargasrivera
 */
public class EjercicioEjemplo {

    public static void main(String[] args) {
        System.out.println("Rectángulo usando FOR:");
        dibujarRectanguloFor();

        System.out.println("\nRectángulo usando WHILE:");
        dibujarRectanguloWhile();

        System.out.println("\nRectángulo usando DO-WHILE:");
        dibujarRectanguloDoWhile();
    }

    /**
     * Dibuja un rectángulo de 10 símbolos @ en 5 líneas usando un ciclo FOR.
     */
    public static void dibujarRectanguloFor() {
        for (int i = 0; i < 5; i++) { // Ciclo externo para las líneas
            for (int j = 0; j < 10; j++) { // Ciclo interno para los símbolos
                System.out.print("@");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    /**
     * Dibuja un rectángulo de 10 símbolos @ en 5 líneas usando un ciclo WHILE.
     */
    public static void dibujarRectanguloWhile() {
        int i = 0; // Inicialización del contador para las líneas
        while (i < 5) {
            int j = 0; // Inicialización del contador para los símbolos
            while (j < 10) {
                System.out.print("@");
                j++; // Incremento del contador interno
            }
            System.out.println(); // Salto de línea al final de cada fila
            i++; // Incremento del contador externo
        }
    }

    /**
     * Dibuja un rectángulo de 10 símbolos @ en 5 líneas usando un ciclo DO-WHILE.
     */
    public static void dibujarRectanguloDoWhile() {
        int i = 0; // Inicialización del contador para las líneas
        do {
            int j = 0; // Inicialización del contador para los símbolos
            do {
                System.out.print("@");
                j++; // Incremento del contador interno
            } while (j < 10); // Condición para los símbolos
            System.out.println(); // Salto de línea al final de cada fila
            i++; // Incremento del contador externo
        } while (i < 5); // Condición para las líneas
    }
}
