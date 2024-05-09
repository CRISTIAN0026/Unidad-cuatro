package unidad.cuatro;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class ArrayClass {
    
    public static void main(String[] args) {
        String array[] = new String[5];
        
        // Métodos principales: length(), equals(), toString(), clone().
        
        array[0] = "Nequi"; 
        array[1] = "Daviplata";
        array[2] = "PSE"; 
        array[3] = "Bancolombia";
        array[4] = "Davivienda"; 
        
        System.out.println(Arrays.toString(array));
        
        //Clonar el array
        String[] array2 = array.clone();
        System.out.println(Arrays.toString(array2));
        
        
        //Sacar la longitud del array
        System.err.println(array.length);
        
        
        //Verificar que un elemeto es igual al que se le pasa
        if(array[0].equals("Nequi")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        //Metodo que sirve para ver por consola
        System.out.println(Arrays.toString(array));
        
        
    }
}
