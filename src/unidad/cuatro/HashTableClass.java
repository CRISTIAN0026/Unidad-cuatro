package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableClass {
    
    
    public static void main(String[] args) {
        Hashtable<String, Integer> equiposYChampios = new Hashtable<>();
        
        //Metodos: get(), put(), remove(), size(), isEmpty(), keys().
        
        //Para intorducir datos, metodo put()
        equiposYChampios.put("Real madrid", 14);
        equiposYChampios.put("Milan FC", 7);
        equiposYChampios.put("Barcelona", 5);
        equiposYChampios.put("Liverpool", 6);
        equiposYChampios.put("Bayer", 6);
        equiposYChampios.put("AJAX", 4);
        equiposYChampios.put("Juventus", 2);
        
        System.out.println(equiposYChampios);
        
        //Para buscar el valor, metodo get()
        System.out.println("El Real madrid tiene "+equiposYChampios.get("Real madrid")+ " champios");
        System.out.println("El AJAX tiene "+equiposYChampios.get("AJAX")+ " champios");
        
        //Para remover un clave valor, metodo remove()
        System.out.println("Un equipo que tiene "+equiposYChampios.remove("Milan FC")+" champios ha sido eliminado");
        System.out.println("Un equipo que tiene "+equiposYChampios.remove("Juventus")+" champios ha sido eliminado");
        
        //Para ver la longitud del diccionario, metodo size()
        System.out.println(equiposYChampios.size());
        //Para ver si esta vacia, metodo size()
        System.out.println(equiposYChampios.isEmpty());
        
        //Para ver los elementos, metodo elements()
        Enumeration<Integer> elementos = equiposYChampios.elements();
        while (elementos.hasMoreElements()) {
            System.out.println(elementos.nextElement());
        }

        //Para ver las claves, metodo Keys()
        Enumeration<String> claves = equiposYChampios.keys();
        while (claves.hasMoreElements()) {
            System.out.println(claves.nextElement());
        }
        
         
        System.out.println(equiposYChampios);
    }
    
}
