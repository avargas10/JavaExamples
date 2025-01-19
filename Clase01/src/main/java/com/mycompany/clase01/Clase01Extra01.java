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

public class Clase01Extra01 {

    public static void main(String[] args) {
        // Solicitar el nombre del trabajador
        String nombreTrabajador = JOptionPane.showInputDialog("Ingrese el nombre del trabajador:");

        // Solicitar el salario semanal del trabajador
        String salarioSemanalStr = JOptionPane.showInputDialog("Ingrese el salario semanal del trabajador:");

        // Convertir el salario semanal a un número decimal (double)
        double salarioSemanal = Double.parseDouble(salarioSemanalStr);

        // Calcular el salario mensual sin deducciones (salario bruto)
        double salarioMensualBruto = salarioSemanal * 4; // Se asume un mes de 4 semanas

        // Calcular las deducciones (9.34% del salario bruto)
        double deducciones = salarioMensualBruto * 0.0934;

        // Calcular el salario neto (salario mensual después de deducciones)
        double salarioMensualNeto = salarioMensualBruto - deducciones;

        // Mostrar los resultados al usuario en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Nombre del trabajador: " + nombreTrabajador + "\n" +
                "Salario mensual bruto: " + String.format("%.2f", salarioMensualBruto) + "\n" +
                "Deducciones (9.34%): " + String.format("%.2f", deducciones) + "\n" +
                "Salario mensual neto: " + String.format("%.2f", salarioMensualNeto));
    }
}
