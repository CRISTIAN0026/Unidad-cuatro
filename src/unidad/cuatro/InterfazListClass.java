package unidad.cuatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author crist
 */
public class InterfazListClass {
    
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        //Métodos principales: add(), addAll(), get(), indexOf(), lastIndexOf(), 
        //remove(), set(), sort().
        
        
        //Metodo para agregar elementos
        arrayList.add("Zorro");
        arrayList.add("Conejo");
        arrayList.add("Perro");
        arrayList.add("Vaca");
        arrayList.add("Hormiga");
        arrayList.add("Aguila");
        
        //Metodo para agregar una collecion de elementos
        List<String> arrayList2 = new ArrayList<>();
        arrayList.add("Caballo");
        arrayList.add("Burro");
        
        arrayList.addAll(arrayList2);
        
        //Metodo para buscar un elemento
        System.out.println(arrayList.get(0));
        
        //Metodo para buscar el indice de un elemento
        System.out.println(arrayList.indexOf("Burro"));
        
        //Buscar un elemento
        System.out.println(arrayList.lastIndexOf("Caballo"));
        
        //Para remover elementos 
        System.out.println(arrayList.remove("Burro"));
        
        //Reemplaza o inserta un elemento en el índice especificado
        System.out.println(arrayList.set(1, "Gallina"));
        
        //Ordenar elementos en la lista
        Collections.sort(arrayList);
        
        
        System.out.println(arrayList);
    }
}
