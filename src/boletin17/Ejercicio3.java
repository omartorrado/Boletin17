/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio3 {

    private Ejercicio3Alumno[] alumnos = new Ejercicio3Alumno[3];

    public void visualizarAprobadosSuspensos() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() < 5 && alumnos[i].getNota() >= 0) {
                System.out.println(alumnos[i].getNombre() + " ha sacado un " + alumnos[i].getNota() + ": Suspenso");
            } else if (alumnos[i].getNota() >= 5 && alumnos[i].getNota() <= 10) {
                System.out.println(alumnos[i].getNombre() + " ha sacado un " + alumnos[i].getNota() + ": Aprobado");
            } else {
                System.out.println(alumnos[i].getNombre() + " tiene una nota fuera de rango:" + alumnos[i].getNota());
            }
        }
    }

    public void crearArray() {
        for (int i = 0; i < alumnos.length; i++) {
            Random rnd = new Random();
            Ejercicio3Alumno alumno = new Ejercicio3Alumno();
            alumnos[i] = alumno;
            alumnos[i].setNombre(JOptionPane.showInputDialog("Indique el nombre del alumno"));
            alumnos[i].setNota(Math.round((rnd.nextFloat() * 1000)) / 100f);
        }
    }

    public void visualizarMedia() {
        float notasTotal = 0;
        for (int i = 0; i < alumnos.length; i++) {
            notasTotal += alumnos[i].getNota();
        }
        float notaMedia = Math.round((notasTotal / alumnos.length) * 100) / 100f;
        System.out.println(notasTotal);
        System.out.println("Nota media: " + notaMedia);
    }

    public void visualizarMasAlta() {
        float[] notas = new float[alumnos.length];
        for (int i = 0; i < alumnos.length; i++) {
            notas[i] = alumnos[i].getNota();
        }
        Arrays.sort(notas);
        System.out.println("Nota mas alta: " + notas[alumnos.length - 1]);
    }

    public void buscarAlumnoPorTeclado() {
        String alumno = JOptionPane.showInputDialog("Indique el nombre del alumno a buscar");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumno.equals(alumnos[i].getNombre())) {
                System.out.println(alumnos[i].getNombre() + " tiene un " + alumnos[i].getNota());
            }
        }
    }

    public void visualizarAprovados() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() >= 5) {
                System.out.println(alumnos[i].getNombre() + " tiene un " + alumnos[i].getNota() + " por lo que está aprobado");
            }
        }
    }

    public void buscarAlumno(String nombre) {
        for (int i = 0; i < alumnos.length; i++) {
            if (nombre.equals(alumnos[i].getNombre())) {
                System.out.println(alumnos[i].getNombre() + " tiene un " + alumnos[i].getNota());
            }
        }
    }

    public void ordenarAlumnos() {
        Arrays.sort(alumnos);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].toString());
        }
    }
}
