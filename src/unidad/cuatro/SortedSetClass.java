package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.*; 

public class SortedSetClass {
    
    public static void main(String[] args) {
        
        SortedSet<String> ts = new TreeSet<String>(); 
        //Métodos: Algunos de los métodos importantes, 
        //first(), headSet(), last(), subSet()
  
       
        // Agregamos elementos con add() 
        ts.add("India"); 
        ts.add("Australia"); 
        ts.add("Colombia"); 
        
        //Buscamos un elemento que empiece con "I" y termine con "a"
        System.out.println(ts.subSet("I","a"));
  
        //Devuelve el primer elemento
        System.out.println(ts.first()); 
        
        //Devuelve el ultimo elemento
        System.out.println(ts.last());
        
        //Devuelve los elementos menores que B
        System.out.println(ts.headSet("B"));
   
        //Eliminamos elementos con el metodo remove() 
        ts.remove("Australia"); 
        System.out.println("Se ha eliminado "
                           + "Australia:" + ts); 
  
    }
}
