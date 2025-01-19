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

public class Clase01Practica02 {

    public static void main(String[] args) {
        // Solicitar al usuario el ingreso mensual mediante un cuadro de diálogo
        String ingresoMensualStr = JOptionPane.showInputDialog("Ingrese su ingreso mensual:");

        // Convertir el ingreso ingresado de tipo String a un número decimal (double)
        double ingresoMensual = Double.parseDouble(ingresoMensualStr);

        // Solicitar al usuario el gasto mensual por alimentación mediante un cuadro de diálogo
        String gastoAlimentacionStr = JOptionPane.showInputDialog("Ingrese su gasto mensual en alimentación:");

        // Convertir el gasto ingresado de tipo String a un número decimal (double)
        double gastoAlimentacion = Double.parseDouble(gastoAlimentacionStr);

        // Calcular el porcentaje de gastos en alimentación
        double porcentajeAlimentacion = (gastoAlimentacion / ingresoMensual) * 100;

        // Calcular el porcentaje restante disponible para otros gastos
        double porcentajeDisponible = 100 - porcentajeAlimentacion;

        // Mostrar los resultados al usuario en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Porcentaje de gastos en alimentación: " + porcentajeAlimentacion + "%\n" +
                "Porcentaje disponible para otros gastos: " + porcentajeDisponible + "%");
    }
}

