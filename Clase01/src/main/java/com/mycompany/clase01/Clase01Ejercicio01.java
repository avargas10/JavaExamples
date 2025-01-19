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

public class Clase01Ejercicio01 {

    public static void main(String[] args) {
        // Ejercicio 1: Suma y promedio de cuatro números con valores asignados
        // Paso 1: Declarar las variables y asignar valores
        int num1 = 10; // Primer número
        int num2 = 20; // Segundo número
        int num3 = 30; // Tercer número
        int num4 = 40; // Cuarto número

        // Calcular la suma y el promedio
        int suma = num1 + num2 + num3 + num4; // Suma de los números
        double promedio = suma / 4.0; // Promedio de los números

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        // Ejercicio 2: Suma y promedio de cuatro números ingresados por el usuario
        // Paso 1: Leer los números del usuario
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));
        int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto número:"));

        // Paso 2: Calcular la suma y el promedio
        int sumaUsuario = numero1 + numero2 + numero3 + numero4;
        double promedioUsuario = sumaUsuario / 4.0;

        // Paso 3: Mostrar los resultados al usuario
        JOptionPane.showMessageDialog(null, "Suma: " + sumaUsuario + "\nPromedio: " + promedioUsuario);

        // Ejercicio 3: Saludar al usuario
        // Paso 1: Leer el nombre del usuario
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        // Paso 2: Mostrar el saludo personalizado
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", bienvenida a este programa desarrollado en JAVA con Netbeans");
    }
}
