package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationClass {
    
    public static void main(String[] args) {
        Dictionary capitalesDePaises = new Hashtable();
        
        //Métodos: hasMoreElements(), nextElement().
        
        capitalesDePaises.put("Colombia", "Bogota");
        capitalesDePaises.put("Peru", "Lima");
        capitalesDePaises.put("Venezuela", "Caracas");
        capitalesDePaises.put("España", "Madrid");
        capitalesDePaises.put("Ecuador", "Quito");
        capitalesDePaises.put("Mexico", "Ciudad de mexico");
        
        //Usamos los metodos hasMoreElements() y nextElement()
        Enumeration<String> elementos = capitalesDePaises.elements();
        while (elementos.hasMoreElements()) {
            System.out.println(elementos.nextElement());
        }

        Enumeration<String> claves = capitalesDePaises.keys();
        while (claves.hasMoreElements()) {
            System.out.println(claves.nextElement());
        }
    }
}
