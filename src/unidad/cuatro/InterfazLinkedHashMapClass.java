package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class InterfazLinkedHashMapClass {
    public static void main(String[] args) {
        // Crear un nuevo LinkedHashMap
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

        // Método put()
        map.put("Goku", "Kamehameha");
        map.put("Vegeta", "Final Flash");
        map.put("Gohan", "Masenko");

        // Método containsKey()
        System.out.println("Contiene 'Goku'? " + map.containsKey("Goku"));

        // Método containsValue()
        System.out.println("Contiene 'Final Flash'? " + map.containsValue("Final Flash")); 

        // Método entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Personaje: " + entry.getKey() + ", Poder: " + entry.getValue());
        }

        // Método get()
        System.out.println("Poder de 'Gohan': " + map.get("Gohan"));

        // Método isEmpty()
        System.out.println("Está vacío? " + map.isEmpty());

        // Método keySet()
        System.out.println("Personajes en el mapa: " + map.keySet());

        // Método remove()
        map.remove("Vegeta");
        System.out.println("Después de remover 'Vegeta': " + map);

        // Método size()
        System.out.println("Tamaño del Map: " + map.size());

        // Método values()
        System.out.println("Poderes en el mapa: " + map.values());

        // Método clear()
        map.clear();
        System.out.println("Después de limpiar: " + map);
    }
}

