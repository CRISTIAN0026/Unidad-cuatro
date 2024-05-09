package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class InterfazMapClass {
    public static void main(String[] args) {
        // Crear un nuevo HashMap
        Map<String, String> map = new HashMap<String, String>();

        // Método put()
        map.put("Apple", "iPhone");
        map.put("Microsoft", "Windows");
        map.put("Google", "Search Engine");

        // Método containsKey()
        System.out.println("Contiene 'Apple'? " + map.containsKey("Apple")); 

        // Método containsValue()
        System.out.println("Contiene 'Windows'? " + map.containsValue("Windows")); 

        // Método entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Marca: " + entry.getKey() + ", Producto: " + entry.getValue());
        }

        // Método get()
        System.out.println("Producto de 'Google': " + map.get("Google")); 

        // Método isEmpty()
        System.out.println("Está vacío? " + map.isEmpty()); 

        // Método keySet()
        System.out.println("Marcas en el mapa: " + map.keySet());

        // Método putAll()
        Map<String, String> anotherMap = new HashMap<String, String>();
        anotherMap.put("Samsung", "Galaxy");
        anotherMap.put("Amazon", "Kindle");
        map.putAll(anotherMap);
        System.out.println("Después de añadir otro mapa: " + map);

        // Método remove()
        map.remove("Microsoft");
        System.out.println("Después de remover 'Microsoft': " + map);

        // Método size()
        System.out.println("Tamaño del Map: " + map.size());

        // Método values()
        System.out.println("Productos en el mapa: " + map.values());

        // Método clear()
        map.clear();
        System.out.println("Después de limpiar: " + map); 
    }
}

