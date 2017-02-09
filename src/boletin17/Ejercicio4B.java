/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio4B {

    public char obtenerLetraDni(int dni) {
        char[] c={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        if (dni > 99999999 || dni < 1000000) {
            System.out.println("Numero incorrecto");
            return 'Ç';
        } else {
            int resto = dni % 23;
            return c[resto];
        }

    }
}
