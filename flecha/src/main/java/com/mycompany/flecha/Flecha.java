
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flecha;

/**
 *
 * @author SENA
 */
import javax.swing.JOptionPane;

public class Flecha {

    int log;
    int color;

    public Flecha() {
        log = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha"));
        color = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si el color es negro o ingrese 2 si el color el rojo"));
    }

    public void construir() {
        for (int i = 0; i < log; i++) {
            if (color == 1) {
                System.out.print("-");
            } else {
                System.err.print("-");
            }
        }
        if (color == 1) {
            System.out.print(">");

        } else {
            System.err.print(">");

        }
    }

    public void espacio() {
        System.out.println("");
    }

}
