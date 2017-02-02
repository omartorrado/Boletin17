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
public class Ejercicio3Alumno implements Comparable<Ejercicio3Alumno> {
    private float nota;
    private String nombre;

    @Override
    public String toString() {
        return "Ejercicio3Alumno{" + "nota=" + nota + ", nombre=" + nombre + '}';
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ejercicio3Alumno() {
        
    }
    
    @Override
    public int compareTo(Ejercicio3Alumno comparaAlumno){
        int compararNota = (int)(comparaAlumno.getNota()*100);
        return (int)((this.nota*100)-compararNota);
    }
}
