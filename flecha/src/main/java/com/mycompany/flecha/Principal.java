
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flecha;

/**
 *
 * @author SENA
 */
public class Principal {

    Flecha flecha, flecha2, flecha3;

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Principal mPrincipal = new Principal();
    }

    public Principal() {
        flecha = new Flecha();
        flecha.construir();
        flecha.espacio();

        flecha2 = new Flecha();
        flecha2.construir();
        flecha2.espacio();

        flecha3 = new Flecha();
        flecha3.construir();
        flecha3.espacio();

    }
}
