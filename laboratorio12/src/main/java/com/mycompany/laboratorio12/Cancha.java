/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio12;

/**
 *
 * @author SENA
 */

import javax.swing.JOptionPane;

public class Cancha{
 double ladoA;
 double ladoB;  
 double Areatotal;
  public Cancha(){
    ladoA=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado A"));
    ladoB=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado B"));
  }
  public void operacion(){
    Areatotal=ladoA*ladoB;
  }
  public void imprimir(){
    System.out.println("El area del rectangulo es de: "+Areatotal);
  }
}