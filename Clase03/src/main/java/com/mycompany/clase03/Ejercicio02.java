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
public class Ejercicio02 {

    public static void main(String[] args) {
        // Solicitar al usuario un número mediante JOptionPane
        String input = JOptionPane.showInputDialog("Ingrese un número para generar su tabla de multiplicar:");
        int numero = Integer.parseInt(input);

        // Mostrar la tabla de multiplicar utilizando diferentes ciclos
        System.out.println("Tabla de multiplicar usando FOR:");
        mostrarTablaFor(numero);

        System.out.println("\nTabla de multiplicar usando WHILE:");
        mostrarTablaWhile(numero);

        System.out.println("\nTabla de multiplicar usando DO-WHILE:");
        mostrarTablaDoWhile(numero);
    }

    /**
     * Muestra la tabla de multiplicar usando un ciclo FOR.
     */
    public static void mostrarTablaFor(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Muestra la tabla de multiplicar usando un ciclo WHILE.
     */
    public static void mostrarTablaWhile(int numero) {
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }

    /**
     * Muestra la tabla de multiplicar usando un ciclo DO-WHILE.
     */
    public static void mostrarTablaDoWhile(int numero) {
        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
    }
}
