package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        // Crear un nuevo TreeSet
        TreeSet<String> set = new TreeSet<String>();

        // Método add()
        set.add("Perro");
        set.add("Gato");
        set.add("Elefante");

        // Método ceiling(E e)
        System.out.println("Animal más cercano después de 'Gato': " + set.ceiling("Gato"));

        // Método comparator()
        System.out.println("Comparador: " + set.comparator()); 

        // Método contains()
        System.out.println("Contiene 'Perro'? " + set.contains("Perro")); 

        // Métodos first() y last()
        System.out.println("Primer animal: " + set.first());
        System.out.println("Último animal: " + set.last());

        // Método floor(E e)
        System.out.println("Animal más cercano antes de 'Gato': " + set.floor("Gato"));

        // Método headSet(E e)
        System.out.println("Animales antes de 'Gato': " + set.headSet("Gato"));

        // Método pollFirst() y pollLast()
        System.out.println("Primer animal y se elimina: " + set.pollFirst());
        System.out.println("Último animal y se elimina: " + set.pollLast());

        // Método remove()
        set.remove("Elefante");
        System.out.println("Después de remover 'Elefante': " + set);

        // Método size()
        System.out.println("Tamaño del TreeSet: " + set.size());

        // Métodos subSet(E fromElement, E toElement) y tailSet(E fromElement)
        set.add("Caballo");
        set.add("Zorro");
        System.out.println("Subconjunto desde 'Caballo' hasta 'Zorro': " + 
                set.subSet("Caballo", "Zorro"));
        System.out.println("Subconjunto desde 'Caballo' hasta el final: " + 
                set.tailSet("Caballo"));

        // Método clear()
        set.clear();
        System.out.println("Después de limpiar: " + set);
    }
}

