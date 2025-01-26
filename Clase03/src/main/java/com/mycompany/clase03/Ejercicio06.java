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
public class Ejercicio06 {

    public static void main(String[] args) {
        System.out.println("\nResultados usando FOR:");
        procesarNotasFor();

        System.out.println("\nResultados usando WHILE:");
        procesarNotasWhile();

        System.out.println("\nResultados usando DO-WHILE:");
        procesarNotasDoWhile();
    }

    /**
     * Procesa las notas usando un ciclo FOR.
     */
    public static void procesarNotasFor() {
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int aprobados = 0;
        int totalEstudiantes = 0;

        for (int i = 1;; i++) {
            String input = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + " (ingrese un número negativo para terminar):");
            int nota = Integer.parseInt(input);

            if (nota < 0) {
                break;
            }

            suma += nota;
            totalEstudiantes++;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 70) {
                aprobados++;
            }
        }

        mostrarResultados(suma, mayor, menor, aprobados, totalEstudiantes);
    }

    /**
     * Procesa las notas usando un ciclo WHILE.
     */
    public static void procesarNotasWhile() {
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int aprobados = 0;
        int totalEstudiantes = 0;

        int i = 1;
        while (true) {
            String input = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + " (ingrese un número negativo para terminar):");
            int nota = Integer.parseInt(input);

            if (nota < 0) {
                break;
            }

            suma += nota;
            totalEstudiantes++;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 70) {
                aprobados++;
            }

            i++;
        }

        mostrarResultados(suma, mayor, menor, aprobados, totalEstudiantes);
    }

    /**
     * Procesa las notas usando un ciclo DO-WHILE.
     */
    public static void procesarNotasDoWhile() {
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int aprobados = 0;
        int totalEstudiantes = 0;

        int i = 1;
        do {
            String input = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + " (ingrese un número negativo para terminar):");
            int nota = Integer.parseInt(input);

            if (nota < 0) {
                break;
            }

            suma += nota;
            totalEstudiantes++;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 70) {
                aprobados++;
            }

            i++;
        } while (true);

        mostrarResultados(suma, mayor, menor, aprobados, totalEstudiantes);
    }

    /**
     * Muestra los resultados del procesamiento de notas.
     */
    public static void mostrarResultados(int suma, int mayor, int menor, int aprobados, int totalEstudiantes) {
        System.out.println("\nResultados:");

        if (totalEstudiantes == 0) {
            System.out.println("No se ingresaron notas válidas.");
            return;
        }

        double promedio = (double) suma / totalEstudiantes;
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
    }
}
