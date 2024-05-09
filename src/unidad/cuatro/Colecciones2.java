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
import java.util.stream.*;

public class Colecciones2 {
    public static void main(String[] args) {
        // Crear una lista
        List<String> lista = new ArrayList<>(Arrays.asList("Moises", "David", "Abraham", "Noe", "Jesus"));

        // Recorrer la lista con un stream y una función lambda
        lista.stream().forEach(nombre -> System.out.println(nombre));

        // Crear un conjunto
        Set<String> conjunto = new HashSet<>(lista);

        // Recorrer el conjunto con un stream y una función lambda
        conjunto.stream().forEach(nombre -> System.out.println(nombre));

        // Crear un mapa
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Moises", "Lideró la liberación de los israelitas de Egipto");
        mapa.put("David", "Rey de Israel y autor de los Salmos");
        mapa.put("Abraham", "Padre de las naciones");

        // Recorrer el mapa con un stream y una función lambda
        mapa.entrySet().stream().forEach(entrada -> System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue()));
        
         // k. Recorrer un objeto de tipo Map usando una función flecha o función lambda
        mapa.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor: " + valor));

        // l. Convertir un array en un objeto List
        String[] arrays = {"Moises", "David", "Abraham"};
        List<String> listas = Arrays.asList(arrays);
        System.out.println("Lista: " + listas);

        // m. Convertir un objeto List a un array
        String[] nuevoArray = lista.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(nuevoArray));

        // n. Dos formas de unir unas dos listas en una sola
        List<String> lista1 = new ArrayList<>(Arrays.asList("Moises", "David"));
        List<String> lista2 = new ArrayList<>(Arrays.asList("Abraham", "Noe"));
        
        // Forma 1: Usar addAll()
        List<String> unida1 = new ArrayList<>(lista1);
        unida1.addAll(lista2);
        System.out.println("Lista unida (forma 1): " + unida1);
        
        // Forma 2: Usar Stream.concat()
        List<String> unida2 = Stream.concat(lista1.stream(), lista2.stream()).collect(Collectors.toList());
        System.out.println("Lista unida (forma 2): " + unida2);

        // o. Desordenar una Lista
        Collections.shuffle(lista);
        System.out.println("Lista desordenada: " + lista);
    }
}


