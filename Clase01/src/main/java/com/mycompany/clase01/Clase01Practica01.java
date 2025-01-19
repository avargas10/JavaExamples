/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase01;

/**
 *
 * @author andresvargasrivera
 */
import javax.swing.JOptionPane;

public class Clase01Practica01 {

    public static void main(String[] args) {
        // Solicitar al usuario su edad actual mediante un cuadro de diálogo
        String edadActualStr = JOptionPane.showInputDialog("Ingrese su edad actual:");

        // Convertir la edad ingresada de tipo String a un entero (int)
        int edadActual = Integer.parseInt(edadActualStr);

        // Calcular la edad proyectada en 5 años
        int edadProyectada = edadActual + 5;

        // Mostrar el resultado al usuario en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Dentro de 5 años, tendrá: " + edadProyectada + " años.");
    }
}
