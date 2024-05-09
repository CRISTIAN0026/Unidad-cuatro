package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.*;
import java.io.*;

public class PropertyYPropetiesClass {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Métodos: load(), store(), getProperty(), setProperty(), stringPropertyNames().
        
        
        // crea un objeto lector en el archivo de propiedades
        FileReader reader = new FileReader("db.properties"); 
  
        // crear objeto de propiedades 
        Properties properties = new Properties(); 
  
        // Agrega un contenedor alrededor del objeto lector 
        properties.load(reader); 
  
        // acceder a los datos de propiedades 
        System.out.println(properties.getProperty("username")); 
        System.out.println(properties.getProperty("password")); 
        
        // establecer una nueva propiedad
        properties.setProperty("url", "jdbc:mysql://localhost:3306/crudCris");

        // guardar las propiedades en el archivo
        FileWriter writer = new FileWriter("db.properties");
        properties.store(writer, "Archivo de propiedades de la base de datos");

        // obtener todas las claves de las propiedades
        Set<String> propertyNames = properties.stringPropertyNames();
        for (String name : propertyNames) {
            System.out.println(name + " = " + properties.getProperty(name));
        }
    }
}
