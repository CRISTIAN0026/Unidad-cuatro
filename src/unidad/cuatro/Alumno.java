/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.cuatro;

/**
 *
 * @author crist
 */
class Alumno {
    String codigo;
    String nombre;
    String apellido;
    String genero;
    String semestre;

    Alumno(String codigo, String nombre, String apellido, String genero, String semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.semestre = semestre;
    }

    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
