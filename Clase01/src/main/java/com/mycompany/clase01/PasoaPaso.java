/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase01;

// Importamos la Biblioteca necesaria para usar JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author andresvargasrivera
 */
public class PasoaPaso {
    
    public static void main(String[] args) {  
        int edad = 15;
        String nombre = "Andres";
        double ingreso = 34;
        
        if ( nombre == "Andres" || (ingreso >= 100 && edad == 12) ){
            
            System.out.println("se cumplen las condiciones");
        }
        
        System.out.println("Termina el programa");
        
        
    }
}
