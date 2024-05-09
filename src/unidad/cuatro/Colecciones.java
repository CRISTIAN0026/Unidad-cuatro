/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        // Crear personajes bíblicos
        PersonajeBiblico moises = new PersonajeBiblico("Moises", 
                "Lideró la liberación de los israelitas de Egipto");
        PersonajeBiblico david = new PersonajeBiblico("David", 
                "Rey de Israel y autor de los Salmos");
        PersonajeBiblico abraham = new PersonajeBiblico("Abraham", 
                "Padre de las naciones");
        PersonajeBiblico noe = new PersonajeBiblico("Noe", "Construyó el arca");
        PersonajeBiblico jesus = new PersonajeBiblico("Jesus", "Hijo de Dios");

        // Lista
        List<PersonajeBiblico> lista = new ArrayList<>();
        lista.add(moises);
        lista.add(david);
        lista.add(abraham);
        lista.add(jesus);
        System.out.println("Lista: " + lista);
        System.out.println("¿La lista contiene a Noe? " + lista.contains(noe));
        lista.add(1, noe);
        System.out.println("Lista después de insertar a Noe: " + lista);
        lista.remove(moises);
        System.out.println("Lista después de eliminar a Moises: " + lista);
        
        // Recorrer la lista con un bucle for tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Recorrer la lista con un bucle foreach
        System.out.println("\nRecorrer la lista con un bucle foreach");
        for (PersonajeBiblico nombre : lista) {
            System.out.println(nombre);
        }

        // Recorrer la lista con un bucle while
        System.out.println("\nRecorrer la lista con un bucle while");
        int i = 0;
        while (i < lista.size()) {
            System.out.println(lista.get(i));
            i++;
        }

        // Recorrer la lista con un bucle do/while
        System.out.println("\nRecorrer la lista con un bucle do/while");
        i = 0;
        do {
            System.out.println(lista.get(i));
            i++;
        } while (i < lista.size());


        // Set
        Set<PersonajeBiblico> conjunto = new HashSet<>();
        conjunto.add(moises);
        conjunto.add(david);
        conjunto.add(abraham);
        conjunto.add(jesus);
        System.out.println("\nConjunto: " + conjunto);
        System.out.println("¿El conjunto contiene a Noe? " + conjunto.contains(noe));
        conjunto.add(noe);
        System.out.println("Conjunto después de insertar a Noe: " + conjunto);
        conjunto.remove(moises);
        System.out.println("Conjunto después de eliminar a Moises: " + conjunto);
        
        // Recorrer el conjunto con un bucle foreach
        System.out.println("\nConjunto después de eliminar a Moises: ");
        for (PersonajeBiblico nombre : conjunto) {
            System.out.println(nombre);
        }

        // Recorrer el conjunto con un iterador y un bucle while
        System.out.println("\nRecorrer el conjunto con un iterador y un bucle while: ");
        Iterator<PersonajeBiblico> it = conjunto.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Map
        Map<String, PersonajeBiblico> mapa = new HashMap<>();
        mapa.put(moises.nombre, moises);
        mapa.put(david.nombre, david);
        mapa.put(abraham.nombre, abraham);
        mapa.put(jesus.nombre, jesus);
        System.out.println("\nMapa: " + mapa.keySet());
        System.out.println("¿El mapa contiene a Noe? " + mapa.containsKey(noe.nombre));
        mapa.put(noe.nombre, noe);
        System.out.println("Mapa después de insertar a Noe: " + mapa.keySet());
        mapa.remove(moises.nombre);
        System.out.println("Mapa después de eliminar a Moises: " + mapa.keySet());
        
        // Recorrer el mapa con un bucle foreach
        System.out.println("\nRecorrer el mapa con un bucle foreach");
        for (Map.Entry<String, PersonajeBiblico> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // Recorrer el mapa con un iterador y un bucle while
        System.out.println("\nRecorrer el mapa con un iterador y un bucle while");
        Iterator<String> its = mapa.keySet().iterator();
        while (it.hasNext()) {
            String clave = its.next();
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }

        // Recorrer la lista con un stream
        System.out.println("\nRecorrer la lista con un stream");
        lista.stream().forEach(System.out::println);
    }
}
