/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase02;

/**
 *
 * @author andresvargasrivera
 */
import javax.swing.JOptionPane;

public class EjercicioIntroductorio {

    public static void main(String[] args) {
        // Programa 1: Verificar si el usuario puede votar
        
        // Paso 1: Solicitar la edad al usuario
        String edadStr = JOptionPane.showInputDialog("Ingrese su edad:");

        // Paso 2: Convertir la edad de String a entero
        int edad = Integer.parseInt(edadStr);

        // Paso 3: Verificar si el usuario tiene 18 años o más
        if (edad >= 18) {
            // Si la condición se cumple, puede votar
            JOptionPane.showMessageDialog(null, "Tiene " + edad + " años, por lo tanto puede votar.");
        } else {
            // Si la condición no se cumple, no puede votar
            JOptionPane.showMessageDialog(null, "Tiene " + edad + " años, por lo tanto no puede votar.");
        }

        // Programa 2: Verificar si el usuario aprobó el curso anterior
        
        // Paso 1: Solicitar la nota final del curso anterior
        String notaStr = JOptionPane.showInputDialog("Ingrese su nota final del curso anterior:");

        // Paso 2: Convertir la nota de String a decimal (double)
        double nota = Double.parseDouble(notaStr);

        // Paso 3: Verificar si la nota es igual o superior a 70
        if (nota >= 70) {
            // Si la condición se cumple, el usuario aprobó
            JOptionPane.showMessageDialog(null, "Su nota fue " + nota + ". Felicidades, ¡aprobó el curso!");
        } else {
            // Si la condición no se cumple, el usuario no aprobó
            JOptionPane.showMessageDialog(null, "Su nota fue " + nota + ". Lo siento, no aprobó el curso. ¡Siga esforzándose!");
        }
    }
}
