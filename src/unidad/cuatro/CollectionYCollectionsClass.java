package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.*;

public class CollectionYCollectionsClass {
    
    public static void main(String[] args) {
                // Crear una Collection de tipo ArrayList
        Collection<String> frutas = new ArrayList<>();

        // Agregar elementos a la Collection con add()
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Kiwi");

        // Verificar si la Collection contiene un elemento con contains()
        System.out.println("¿Contiene Manzana?: " + frutas.contains("Manzana"));

        // Crear otra Collection
        Collection<String> masFrutas = new ArrayList<>();
        masFrutas.add("Fresa");
        masFrutas.add("Mango");

        // Agregar todos los elementos de otra Collection con addAll()
        frutas.addAll(masFrutas);

        // Verificar si la Collection contiene todos los elementos de otra Collection con containsAll()
        System.out.println("¿Contiene todas las frutas?: " + frutas.containsAll(masFrutas));

        // Obtener el tamaño de la Collection con size()
        System.out.println("Número de frutas: " + frutas.size());

        // Verificar si la Collection está vacía con isEmpty()
        System.out.println("¿Está vacía?: " + frutas.isEmpty());

        // Eliminar un elemento de la Collection con remove()
        frutas.remove("Manzana");

        // Eliminar todos los elementos de otra Collection con removeAll()
        frutas.removeAll(masFrutas);

        // Retener solo los elementos que están en otra Collection con retainAll()
        frutas.retainAll(masFrutas);

        // Convertir la Collection a un array con toArray()
        String[] arrayFrutas = frutas.toArray(new String[0]);

        // Limpiar la Collection con clear()
        frutas.clear();

        // Imprimir la Collection
        System.out.println("Frutas: " + frutas);
    }
}
