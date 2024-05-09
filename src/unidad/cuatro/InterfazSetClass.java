package unidad.cuatro;

import java.util.*;

/**
 *
 * @author crist
 */
public class InterfazSetClass {
    
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        
        //métodos importantes son: add(), addAll(), clear(), contains(), 
        //isEmpty(), remove(), size(), toArray().
        
        
        //agregar elementos a la colección
        set.add(21);
        set.add(50);
        set.add(11);
        set.add(5);
        set.add(2);
        set.add(30);
        
        System.out.println(set);
        
        Set<Integer> newSet = new HashSet<Integer>();
        
        newSet.add(210);
        newSet.add(500);
        
        //Agrear un conjuntos de datos a la colección
        set.addAll(newSet);
       
        //Averiguar si elemento esta contenido en la coleccion
        System.out.println(set.contains(11));
        
        //Averiguar si la coleccion esta vacia
        System.out.println(set.isEmpty());
        
        
        //Nos sirve para remover un elemento
        System.out.println(set.remove(1));
        
        //Nos sirve para ver la longitd de la coleccion
        System.out.println(set.size());
        
        //Transformamos la coleccion a array
        set.toArray();
        
        System.out.println(set);
        
        //Eliminar todos los elementos
        set.clear();
    }
}
