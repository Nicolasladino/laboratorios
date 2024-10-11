/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio12;

/**
 *
 * @author SENA
 */

public class Principal {
    Cancha cancha;
    public static void main(String[] args) {
        
        Principal mPrincipal=new Principal();
    }
    public Principal(){
        cancha=new Cancha();
        cancha.operacion();
        cancha.imprimir();
        
       
    }
}
