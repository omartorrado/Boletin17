/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio2 {
    
    private float[] notas= new float[30];
    
    public void visualizarAprobadosSuspensos(){
        for (int i=0; i<notas.length; i++){
            if (notas[i]<5 && notas[i]>=0){
                System.out.println(notas[i]+": Suspenso");
            }
            if(notas[i]>=5 && notas[i]<=10){
                System.out.println(notas[i]+": Aprobado");
        }
            
        }
    }
    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            Random rnd= new Random();
            notas[i]= rnd.nextFloat()*10;
        }
    }
    public void visualizarMedia(){
        float notasTotal=0;
        for (int i = 0; i < notas.length; i++){
            notasTotal+=notas[i];
        }
        System.out.println(notasTotal/notas.length);
    }
    public void visualizarMasAlta(){
        Arrays.sort(notas);
        System.out.println(notas[notas.length-1]);
    }
}
