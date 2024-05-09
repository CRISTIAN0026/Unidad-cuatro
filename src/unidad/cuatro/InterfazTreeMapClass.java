package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class InterfazTreeMapClass {
    public static void main(String[] args) {
        // Crear un nuevo TreeMap
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        // Método put()
        map.put("Toyota", 1937);
        map.put("Honda", 1948);
        map.put("Ford", 1903);

        // Método containsKey()
        System.out.println("Contiene 'Toyota'? " + map.containsKey("Toyota"));

        // Método containsValue()
        System.out.println("Contiene 1948? " + map.containsValue(1948));

        // Método entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Marca: " + entry.getKey() + ", Año de fundación: " + entry.getValue());
        }

        // Método get()
        System.out.println("Año de fundación de 'Ford': " + map.get("Ford"));

        // Método isEmpty()
        System.out.println("Está vacío? " + map.isEmpty());

        // Método keySet()
        System.out.println("Marcas en el mapa: " + map.keySet());

        // Método firstKey() y lastKey()
        System.out.println("Primera marca en el mapa: " + map.firstKey());
        System.out.println("Última marca en el mapa: " + map.lastKey());

        // Método remove()
        map.remove("Honda");
        System.out.println("Después de remover 'Honda': " + map);

        // Método size()
        System.out.println("Tamaño del Map: " + map.size());

        // Método values()
        System.out.println("Años de fundación en el mapa: " + map.values());

        // Método clear()
        map.clear();
        System.out.println("Después de limpiar: " + map);
    }
}

