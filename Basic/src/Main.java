import java.util.*;

public class Main {
    public static void main(String[] args) {
        Arreglos arreglos = new Arreglos();
        Object nombre = ingresaDatos();
        System.out.println(arreglos.sumaNumerosPares());
        System.out.println(nombre);
    }

    // <>

    public static Object ingresaDatos() {
        // inicializa scanner
        Scanner teclado = new Scanner(System.in);
        Estudiantes claseEstudiantes = new Estudiantes();
        //Class<? extends Estudiantes> claseEstudiante= claseEstudiantes.getClass();

        List<Estudiantes> listaEstudiantes = new ArrayList<>();

        int counter = 0;
        while (counter < 3) {
            claseEstudiantes = new Estudiantes();
            System.out.println("Ingresa nombre");
            claseEstudiantes.setNombre(teclado.nextLine());

            System.out.println("edad");
            claseEstudiantes.setEdad(Integer.parseInt(teclado.nextLine()));

            System.out.println("calificación");
            claseEstudiantes.setCalificacion(Integer.parseInt(teclado.nextLine()));
            listaEstudiantes.add(claseEstudiantes);

            counter++;
        }
        int notaMayor = 0;
        for (Estudiantes estudiante : listaEstudiantes) {
            int nota = estudiante.getCalificacion();

            if (nota > notaMayor) {
                notaMayor = nota;
            }

        }

        return notaMayor;

    }
}