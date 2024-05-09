/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.*;

class PersonajeBiblico implements Comparable<PersonajeBiblico> {
    String nombre;
    String descripcion;

    PersonajeBiblico(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(PersonajeBiblico otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    public String toString() {
        return this.nombre;
    }
}
