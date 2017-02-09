/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Random;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio1 {

    private int[] numeros = new int[6];

    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            Random rnd= new Random();
            numeros[i]= rnd.nextInt(50)+1;
        }
    }
    
    //Para testear visualizarReverse
    public void visualizar(){
        for(int i=0;i< numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    
    public void visualizarReverse(){
        for (int i =numeros.length;i>0; i--) {
            System.out.println(numeros[i-1]);
        }
    }
}
