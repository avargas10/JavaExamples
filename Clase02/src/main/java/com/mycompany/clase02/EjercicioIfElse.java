/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase02;

/**
 *
 * @author andresvargasrivera
 */
import javax.swing.JOptionPane;

public class EjercicioIfElse {

    public static void main(String[] args) {
        // Parte 1: Mostrar el nombre del día basado en el número ingresado

        // Solicitar al usuario que ingrese un número del 1 al 7
        String diaStr = JOptionPane.showInputDialog("Ingrese un número del 1 al 7 para obtener el día correspondiente:");

        // Convertir el valor ingresado a entero
        int dia = Integer.parseInt(diaStr);

        // Variable para almacenar el nombre del día
        String nombreDia;
        String tipoDia;

        // Usar if-else para determinar el nombre y tipo de día
        if (dia == 1) {
            nombreDia = "Domingo";
            tipoDia = "libre";
        } else if (dia == 2) {
            nombreDia = "Lunes";
            tipoDia = "laborable";
        } else if (dia == 3) {
            nombreDia = "Martes";
            tipoDia = "laborable";
        } else if (dia == 4) {
            nombreDia = "Miércoles";
            tipoDia = "laborable";
        } else if (dia == 5) {
            nombreDia = "Jueves";
            tipoDia = "laborable";
        } else if (dia == 6) {
            nombreDia = "Viernes";
            tipoDia = "laborable";
        } else if (dia == 7) {
            nombreDia = "Sábado";
            tipoDia = "libre";
        } else {
            // Manejar casos de entrada no válida
            nombreDia = "Número inválido";
            tipoDia = "no aplicable";
        }

        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "El número ingresado corresponde a: " + nombreDia + "\nEste día es: " + tipoDia);

        // Parte 2: Encontrar el mayor de cuatro números

        // Solicitar los cuatro números al usuario
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto número:"));

        // Variable para almacenar el mayor número
        int mayor;

        // Usar if-else para determinar el mayor número
        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            mayor = num2;
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            mayor = num3;
        } else {
            mayor = num4;
        }

        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "El mayor de los números ingresados es: " + mayor);
    }
}
