package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
        
public class DictionaryClass {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        Dictionary capitalesDePaises = new Hashtable();
        
        //Metodos: get(), put(), remove(), size(), isEmpty(), keys().
        
        //Para intorducir datos, metodo put()
        capitalesDePaises.put("Colombia", "Bogota");
        capitalesDePaises.put("Peru", "Lima");
        capitalesDePaises.put("Venezuela", "Caracas");
        capitalesDePaises.put("España", "Madrid");
        capitalesDePaises.put("Ecuador", "Quito");
        capitalesDePaises.put("Mexico", "Ciudad de mexico");
        
        System.out.println(capitalesDePaises);
        
        //Para buscar el valor, metodo get()
        System.out.println(capitalesDePaises.get("España"));
        System.out.println(capitalesDePaises.get("Venezuela"));
        
        //Para remover un clave valor, metodo remove()
        System.out.println(capitalesDePaises.remove("Peru"));
        System.out.println(capitalesDePaises.remove("Ecuador"));
        
        //Para ver la longitud del diccionario, metodo size()
        System.out.println(capitalesDePaises.size());
        //Para ver si esta vacia, metodo size()
        System.out.println(capitalesDePaises.isEmpty());
        
        //Para ver los elementos, metodo elements()
        Enumeration<String> elementos = capitalesDePaises.elements();
        while (elementos.hasMoreElements()) {
            System.out.println(elementos.nextElement());
        }

        //Para ver las claves, metodo Keys()
        Enumeration<String> claves = capitalesDePaises.keys();
        while (claves.hasMoreElements()) {
            System.out.println(claves.nextElement());
        }
        
         
        System.out.println(capitalesDePaises);
        
    }
}
