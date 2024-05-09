package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.Vector;
public class VectorClass {
    
    public static void main(String[] args) {
        //Métodos principales: add(), get(), remove(), size(), capacity(), contains(), 
        //indexOf().
        
        Vector vector = new Vector();
        
        System.out.println("El tamaño del vector es = " +  vector.size());
        
        //Agregando elemetos al vector con el metodo add()
        vector.add("Manzana");
        vector.add("Pera");
        vector.add("Mango");
        vector.add("Guayaba");
        vector.add("Corozo");
        System.out.println(vector);
        
        //Buscamos un elemento con el metodo get()
        System.out.println("El elemento en la posición 0 es = "+vector.get(0));

        //Mostramos el tamaño con el metodo size()
        System.out.println("El tamaño del vector es = " +  vector.size());
        
        //Mostramos el primer elemento con el metodo firstElement()
        System.out.println("El primer elemento del es vector = " + vector.firstElement());
        
        //Removemos un elemento con el metodo remove()
        System.out.println(vector.remove("Pera"));
        
        //Usamos el metodo capacity para devolver la capacidad del vector
        System.out.println(vector.capacity());

        //Aquí el programa imprimirá la primera aparición del elemento "Corozo"
        System.out.println(vector.indexOf("Corozo"));
        
        //El metodo contains comprueba si el objeto especificado es un componente de este vector
        System.out.println("El metodo contains = " + vector.contains("Guayaba"));
        
        
        vector.clear(); //Eliminando todos los elementos vectoriales
        System.out.println("El tamaño del vector después del método clear = " +  vector.size());
    }
}
