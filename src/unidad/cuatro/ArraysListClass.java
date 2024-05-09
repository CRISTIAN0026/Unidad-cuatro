package unidad.cuatro;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author crist
 */
public class ArraysListClass {
    
    public static void main(String[] args) {
        ArrayList<String> peliculas = new ArrayList<>();
        
        //Métodos principales: add(), get(), remove(), size(), contains(), 
        //indexOf(), lastIndexOf(), toArray().
        
        //Agregar peliculas a la lista de array
        peliculas.add("En busca de la felicidad");
        peliculas.add("¿Que paso ayer?");
        peliculas.add("Forrest Gump");
        peliculas.add("Gladiator");
        peliculas.add("Troya");
        
        //Buscar un elemento
        System.out.println(peliculas.get(0));
        
        //Remover un elemento
        System.out.println(peliculas.remove(2));
        
        //Longitud del la lista de array
        System.out.println(peliculas.size());
        
        //Para verificar si la lista contiene el elemento espesificado
        System.out.println(peliculas.contains("Troya"));
        
        //Para buscar un elemento desde el inicio de la lista
        System.out.println(peliculas.indexOf("Gladiator"));
        
        //Para buscar un elemento desde el final de la lista
        System.out.println(peliculas.lastIndexOf("Gladiator"));
        
        //Transforma la lista de array en un array
        System.out.println(Arrays.toString(peliculas.toArray()));
        
        System.out.println(peliculas);
    }
}
