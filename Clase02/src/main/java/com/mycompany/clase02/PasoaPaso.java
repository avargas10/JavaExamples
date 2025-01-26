/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase02;

import javax.swing.JOptionPane;


/**
 *
 * @author andresvargasrivera
 */
public class PasoaPaso {
    public static void main(String[] args) {
        int mes = 2;
        if (mes == 2){
            System.out.println("Tiene 28/29 dias");
        }
        else if (mes == 6 || mes == 4 || mes == 11 || mes == 9){
            System.out.println("Tiene 30 dias");
        }
        else {
            System.out.println("Tiene 31 dias");
        }
    
    }
}   

    