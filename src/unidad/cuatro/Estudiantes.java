package unidad.cuatro;

/**
 *
 * @author crist
 */
import java.util.*;
import java.util.stream.*;

public class Estudiantes {
    public static void main(String[] args) {
        // Crear una lista de alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("1", "Juan", "Perez", "Masculino", "I"));
        alumnos.add(new Alumno("2", "Maria", "Gomez", "Femenino", "III"));
        alumnos.add(new Alumno("3", "Pedro", "Gonzalez", "Masculino", "II"));
        alumnos.add(new Alumno("4", "Ana", "Rodriguez", "Femenino", "III"));
        alumnos.add(new Alumno("5", "John", "Doe", "Masculino", "IV"));

        // p. Ordenar la lista de alumnos por apellido
        List<Alumno> ordenadoPorApellido = alumnos.stream()
            .sorted(Comparator.comparing(a -> a.apellido))
            .collect(Collectors.toList());
        System.out.println("Ordenado por apellido: " + ordenadoPorApellido);

        // q. Obtener una sublista de alumnos en III semestre
        List<Alumno> enTercerSemestre = alumnos.stream()
            .filter(a -> "III".equals(a.semestre))
            .collect(Collectors.toList());
        System.out.println("En tercer semestre: " + enTercerSemestre);

        // r. Agrupar la lista de alumnos por género y semestre
        Map<String, List<Alumno>> agrupadoPorGeneroYSemestre = alumnos.stream()
            .collect(Collectors.groupingBy(a -> a.genero + "-" + a.semestre));
        System.out.println("Agrupado por género y semestre: " + agrupadoPorGeneroYSemestre);

        // s. Obtener el primer alumno en III semestre
        Alumno primerAlumnoEnTercerSemestre = alumnos.stream()
            .filter(a -> "III".equals(a.semestre))
            .findFirst()
            .orElse(null);
        System.out.println("Primer alumno en tercer semestre: " + primerAlumnoEnTercerSemestre);

        // t. Obtener los alumnos cuyo nombre contiene "John"
        List<Alumno> contieneJohn = alumnos.stream()
            .filter(a -> a.nombre.contains("John"))
            .collect(Collectors.toList());
        System.out.println("Contiene 'John': " + contieneJohn);
        

        // u. Obtener los alumnos que se encuentran cursando de III a VI semestre
        List<Alumno> deTerceroASexto = alumnos.stream()
            .filter(a -> {
                int semestre = convertirRomanoANumero(a.semestre);
                return semestre >= 3 && semestre <= 6;
            })
            .collect(Collectors.toList());
            System.out.println("De tercero a sexto semestre: " + deTerceroASexto);;
    }
    
    public static int convertirRomanoANumero(String romano) {
        switch (romano) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            default:
                return 0;
        }
    }
}
