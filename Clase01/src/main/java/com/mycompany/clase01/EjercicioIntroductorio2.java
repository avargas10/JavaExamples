package com.mycompany.clase01;

// Importamos la librería necesaria para usar JOptionPane
import javax.swing.JOptionPane;

/**
 * Ejemplo de cómo usar JOptionPane para mostrar mensajes y comparar
 * diferentes formas de impresión en Java.
 *
 * @author Andres Vargas
 */
public class EjercicioIntroductorio2 {

    public static void main(String[] args) {
        // Forma 1: Usando dos instrucciones de impresión
        System.out.println("Bienvenido al mundo de Java.");
        System.out.println("Podrás dar solución a muchos problemas.");

        // Forma 2: Usando una sola instrucción de impresión
        System.out.println("Bienvenido al mundo de Java.\nPodrás dar solución a muchos problemas.");

        // Forma 3: Usando JOptionPane con dos llamadas
        JOptionPane.showMessageDialog(null, "Bienvenido al mundo de Java.");
        JOptionPane.showMessageDialog(null, "Podrás dar solución a muchos problemas.");

        // Forma 4: Usando JOptionPane con una sola llamada
        JOptionPane.showMessageDialog(null, "Bienvenido al mundo de Java.\nPodrás dar solución a muchos problemas.");
    }
}
