package unidad.cuatro;

import java.util.LinkedList;

/**
 *
 * @author crist
 */
public class LinkedListClass {
    
    public static void main(String[] args) {
        LinkedList<String> seleccionColombia = new LinkedList();
        
        //métodos importantes son: add(), addAll(), clear(), clone(), contains(), 
        //get(), indexOf(), lastIndexOf(), remove(), set()
        
        
        //Agregar elementos al LinkedList
        seleccionColombia.add("James Rodríguez");
        seleccionColombia.add("Luis Díaz");
        seleccionColombia.add("David Ospina");
        seleccionColombia.add("Santos Borre");
        seleccionColombia.add("Yaser Asprilla");
        seleccionColombia.add("Yerry Mina");
        
        
        //Agregar una un grupo de jugadores
        LinkedList<String> jugadores = new LinkedList();
        
        jugadores.add("Falcao");
        jugadores.add("Juan Cuadrado");
        
        seleccionColombia.addAll(jugadores);
        
        System.out.println(seleccionColombia);
        
        //Clonar la lista
        LinkedList newList = (LinkedList) seleccionColombia.clone();
        
        System.out.println(newList);
        
        //Verificar que un elemento se encuentra en la lista
        System.out.println(seleccionColombia.contains("Falcao"));
        
        //Buscar un elemento en la lista
        System.out.println(seleccionColombia.get(0));
        
        //Buscar un elemento por el indice por el principio
        System.out.println(seleccionColombia.indexOf("Falcao"));
        
         //Buscar un elemento por el indice por el final
        System.out.println(seleccionColombia.lastIndexOf("Falcao"));
        
        //Remover un elemento de la lista
        System.out.println(seleccionColombia.remove(5));
        
        //Remplazar un elemento
        System.out.println(seleccionColombia.set(5, "Santos Borre"));
        
        System.out.println(seleccionColombia);
        
        //Eliminar todo lo que tiene la lista
        seleccionColombia.clear();
        
        
        
        System.out.println(seleccionColombia);
    }
}
