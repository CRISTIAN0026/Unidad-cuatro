package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterfazHashMapClass {
    public static void main(String[] args) {
        // Crear un nuevo HashMap
        HashMap<String, String> map = new HashMap<String, String>();

        // Método put()
        map.put("Toyota", "Corolla");
        map.put("Honda", "Civic");
        map.put("Ford", "Mustang");

        // Método containsKey()
        System.out.println("Contiene 'Toyota'? " + map.containsKey("Toyota")); 

        // Método containsValue()
        System.out.println("Contiene 'Civic'? " + map.containsValue("Civic"));

        // Método entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Marca: " + entry.getKey() + ", Modelo: " + entry.getValue());
        }

        // Método get()
        System.out.println("Modelo de 'Ford': " + map.get("Ford")); 

        // Método isEmpty()
        System.out.println("Está vacío? " + map.isEmpty()); 

        // Método keySet()
        System.out.println("Marcas en el mapa: " + map.keySet());

        // Método putAll()
        HashMap<String, String> anotherMap = new HashMap<String, String>();
        anotherMap.put("Chevrolet", "Camaro");
        anotherMap.put("Dodge", "Charger");
        map.putAll(anotherMap);
        System.out.println("Después de añadir otro mapa: " + map);

        // Método remove()
        map.remove("Honda");
        System.out.println("Después de remover 'Honda': " + map);

        // Método size()
        System.out.println("Tamaño del Map: " + map.size());

        // Método values()
        System.out.println("Modelos en el mapa: " + map.values());

        // Método clear()
        map.clear();
        System.out.println("Después de limpiar: " + map);
    }
}

