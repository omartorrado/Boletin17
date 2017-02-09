/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Ejercicio1 ej1=new Ejercicio1();
//        ej1.crearArray();
//        ej1.visualizar();
//        ej1.visualizarReverse();

//        Ejercicio2 ej2= new Ejercicio2();
//        ej2.crearArray();
//        ej2.visualizarAprobadosSuspensos();
//        ej2.visualizarMasAlta();
//        ej2.visualizarMedia();

//        Ejercicio3 ej3= new Ejercicio3();
//        ej3.crearArray();
//        ej3.visualizarAprobadosSuspensos();
//        ej3.visualizarMasAlta();
//        ej3.visualizarMedia();
//        ej3.buscarAlumno("Paco");
//        ej3.buscarAlumnoPorTeclado();
//        ej3.visualizarAprovados();
//        ej3.ordenarAlumnos();

        Ejercicio4B ej4 = new Ejercicio4B();
        try{
            System.out.println(ej4.obtenerLetraDni(Integer.parseInt(JOptionPane.showInputDialog("Indique su numero de dni"))));
        }
        catch (Exception e){
            System.out.println(ej4.obtenerLetraDni(Integer.parseInt(JOptionPane.showInputDialog("Indique su numero de dni"))));
        }
// Ver como hacer que esto se repita en bucle mientras devuelva una excepcion
//que seguro k es una tonteria y no me sale
    }

}
