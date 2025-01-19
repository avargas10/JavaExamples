package com.mycompany.clase01;

// Importamos la librería necesaria para usar JOptionPane
import javax.swing.JOptionPane;

/**
 * Ejemplo de cómo usar JOptionPane para leer datos desde un cuadro de diálogo
 * y mostrar resultados en otro cuadro de diálogo.
 *
 * Este código solicita al usuario su nombre, edad y salario y luego muestra
 * esa información formateada en un mensaje.
 * 
 * @author Andres Vargas
 */
public class EjercicioIntroductorio {

    public static void main(String[] args) {
        // Declaración de variables para almacenar los datos ingresados por el usuario
        String nombre;  // Variable para el nombre (cadena de texto)
        int edad;       // Variable para la edad (entero)
        double salario; // Variable para el salario (decimal)

        // Usamos JOptionPane para mostrar un cuadro de entrada y pedir el nombre
        // JOptionPane.showInputDialog devuelve siempre un String
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

        // Usamos JOptionPane para pedir la edad
        // Convertimos el String devuelto por showInputDialog a un int usando Integer.parseInt
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE));

        // Usamos JOptionPane para pedir el salario
        // Convertimos el String devuelto por showInputDialog a un double usando Double.parseDouble
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE));

        // Formateamos y mostramos los datos ingresados por el usuario en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El nombre de la persona es: " + nombre + 
                ", la persona tiene: " + edad + " años.\nRecibe un salario de: " + salario,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

        // Fin del programa
    }
}
