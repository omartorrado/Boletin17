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
            else if(notas[i]>=5 && notas[i]<=10){
                System.out.println(notas[i]+": Aprobado");
        }
            else{
                System.out.println("Nota fuera de rango:"+notas[i]);
            }
        }
    }
    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            Random rnd= new Random();
            notas[i]= Math.round((rnd.nextFloat()*1000))/100f;
        }
    }
    public void visualizarMedia(){
        float notasTotal=0;
        for (int i = 0; i < notas.length; i++){
            notasTotal+=notas[i];
        }
        System.out.println("Nota media: "+notasTotal/notas.length);
    }
    public void visualizarMasAlta(){
        Arrays.sort(notas);
        System.out.println("Nota mas alta: "+notas[notas.length-1]);
    }
}
