package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        // Crear un nuevo HashSet
        
        HashSet<String> set = new HashSet<String>();
        //Métodos: Algunos de los métodos importantes son add(), clear(), clone(), 
        //contains(), isEmpty(), iterator(), remove(), size(), toArray().
        
        // Método add()
        set.add("A");
        set.add("B");
        set.add("C");

        // Método contains() que sirve para ver si el dato pasado esta contenido
        System.out.println("Contiene 'A'? " + set.contains("A"));

        // Método isEmpty() para verificar si esta vacio
        System.out.println("Está vacío? " + set.isEmpty());

        // Método iterator() para iterar sobre los datos
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Método size() que nos sirve para ver la longitud
        System.out.println("Tamaño del HashSet: " + set.size());

        // Método toArray() para transformar en un array
        Object[] array = set.toArray();
        System.out.println("Elemento en el índice 0 del array: " + array[0]);

        // Método clone() clonar la coleccion de datos
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Conjunto clonado: " + clonedSet);

        // Método remove() que remuevo que consida con el dato pasado
        set.remove("A");
        System.out.println("Después de remover 'A': " + set);

        // Método clear() metodo para eliminar todo lo que contenga
        set.clear();
        System.out.println("Después de limpiar: " + set); 
    }
}

