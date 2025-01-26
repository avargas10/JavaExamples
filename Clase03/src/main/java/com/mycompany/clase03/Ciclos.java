/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license/default.txt to change this license
 */

package com.mycompany.clase03;

/**
 *
 * @author andresvargasrivera
 */
public class Ciclos {

    public static void main(String[] args) {
        System.out.println("Ejemplos de ciclos en Java\n");

        // Llamar a los ejemplos de cada tipo de ciclo
        System.out.println("Ejemplo con ciclo FOR:");
        ejemploFor();

        System.out.println("\nEjemplo con ciclo WHILE:");
        ejemploWhile();

        System.out.println("\nEjemplo con ciclo DO-WHILE:");
        ejemploDoWhile();
    }

    /**
     * Método que demuestra el uso de un ciclo FOR.
     * Imprime los números del 1 al 5 en la consola.
     */
    public static void ejemploFor() {
        for (int i = 1; i <= 5; i++) {
            // En cada iteración se imprime el valor de 'i'
            System.out.println("Número: " + i);
        }
    }

    /**
     * Método que demuestra el uso de un ciclo WHILE.
     * Imprime los números del 1 al 5 en la consola.
     */
    public static void ejemploWhile() {
        int i = 1; // Inicialización del contador

        while (i <= 5) {
            // En cada iteración se imprime el valor de 'i'
            System.out.println("Número: " + i);
            i++; // Incremento del contador
        }
    }

    /**
     * Método que demuestra el uso de un ciclo DO-WHILE.
     * Imprime los números del 1 al 5 en la consola.
     */
    public static void ejemploDoWhile() {
        int i = 1; // Inicialización del contador

        do {
            // Se imprime el valor de 'i'
            System.out.println("Número: " + i);
            i++; // Incremento del contador
        } while (i <= 5); // Condición para continuar el ciclo
    }

    /**
     * Nota sobre static:
     * La palabra clave "static" indica que el método o variable pertenece a la clase y no a una instancia específica de la clase.
     * Esto significa que los métodos estáticos se pueden llamar directamente utilizando el nombre de la clase, sin necesidad de crear un objeto.
     * Por ejemplo, en este programa usamos el método main y los métodos de ejemplo como estáticos para poder llamarlos directamente
     * desde el contexto de la clase sin crear instancias. Esto es útil para métodos utilitarios o funciones que no dependen del estado de un objeto.
     */
}