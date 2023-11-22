import java.util.*;

public class Main {
    public static void main(String[] args) {


        Arreglos arreglos = new Arreglos();
        Object nombre = ingresaDatos();
        System.out.println(arreglos.sumaNumerosPares());
        System.out.println(nombre);
    }

    public static Object ingresaDatos() {
        // inicializa scanner
        Scanner teclado = new Scanner(System.in);
        Estudiantes estudiantes = new Estudiantes();

        List<Object> listaEstudiantes = new ArrayList<>();

        int counter = 0;
        while (counter < 3) {
            System.out.println("Ingresa nombre");
            estudiantes.setNombre(teclado.nextLine());

            System.out.println("edad");
            estudiantes.setEdad(Integer.parseInt(teclado.nextLine()));

            System.out.println("calificación");
            estudiantes.setCalificacion(Integer.parseInt(teclado.nextLine()));
            listaEstudiantes.add(estudiantes);

            counter++;
        }

        for (Object estudiante: listaEstudiantes) {
            estudiante.getClass();
        }


        return listaEstudiantes.get(0);







    }
}