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
public class Ejercicio05 {

    public static void main(String[] args) {
        // Solicitar cantidad de estudiantes mediante JOptionPane
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = Integer.parseInt(input);

        System.out.println("\nResultados usando FOR:");
        procesarNotasFor(cantidadEstudiantes);

        System.out.println("\nResultados usando WHILE:");
        procesarNotasWhile(cantidadEstudiantes);

        System.out.println("\nResultados usando DO-WHILE:");
        procesarNotasDoWhile(cantidadEstudiantes);
    }

    /**
     * Procesa las notas usando un ciclo FOR.
     */
    public static void procesarNotasFor(int cantidadEstudiantes) {
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int aprobados = 0;

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            String input = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + ":");
            int nota = Integer.parseInt(input);
            suma += nota;
            
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

        mostrarResultados(cantidadEstudiantes, suma, mayor, menor, aprobados);
    }

    /**
     * Procesa las notas usando un ciclo WHILE.
     */
    public static void procesarNotasWhile(int cantidadEstudiantes) {
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int aprobados = 0;

        int i = 1;
        while (i <= cantidadEstudiantes) {
            String input = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + ":");
            int nota = Integer.parseInt(input);
            suma += nota;
            
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

        mostrarResultados(cantidadEstudiantes, suma, mayor, menor, aprobados);
    }

    /**
     * Procesa las notas usando un ciclo DO-WHILE.
     */
    public static void procesarNotasDoWhile(int cantidadEstudiantes) {
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int aprobados = 0;

        int i = 1;
        do {
            String input = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + ":");
            int nota = Integer.parseInt(input);
            suma += nota;
            
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
        } while (i <= cantidadEstudiantes);

        mostrarResultados(cantidadEstudiantes, suma, mayor, menor, aprobados);
    }

    /**
     * Muestra los resultados del procesamiento de notas.
     */
    public static void mostrarResultados(int cantidadEstudiantes, int suma, int mayor, int menor, int aprobados) {
        double promedio = (double) suma / cantidadEstudiantes;
        System.out.println("\nResultados:");
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
    }
}
