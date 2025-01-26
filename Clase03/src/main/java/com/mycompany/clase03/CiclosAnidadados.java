/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author andresvargasrivera
 */
public class CiclosAnidadados {

    public static void main(String[] args) {
        // Ejemplo 1: Ciclo anidado con dos niveles (i, j)
        System.out.println("Ejemplo 1: Ciclo anidado con dos niveles");
        for (int i = 0; i < 3; i++) { // Ciclo externo
            System.out.println("Ciclo externo i = " + i);
            for (int j = 0; j < 2; j++) { // Ciclo interno
                System.out.println("\tCiclo interno j = " + j);
            }
        }

        // Ejemplo 2: Ciclo anidado con tres niveles (i, j, k)
        System.out.println("\nEjemplo 2: Ciclo anidado con tres niveles");
        for (int i = 0; i < 2; i++) { // Ciclo externo
            System.out.println("Ciclo externo i = " + i);
            for (int j = 0; j < 2; j++) { // Ciclo intermedio
                System.out.println("\tCiclo intermedio j = " + j);
                for (int k = 0; k < 2; k++) { // Ciclo interno
                    System.out.println("\t\tCiclo interno k = " + k);
                }
            }
        }
    }
}
