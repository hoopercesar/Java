import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadWords {

    public ReadWords() {}

    public static String ingresaTexto() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa texto");
        String texto = teclado.nextLine();
        String[] lista = texto.split("[\\s,\\.]+");

        // crea lista de unicos y duplicados, vacía
        Set<String> nombresDuplicados = new HashSet<>();
        Set<String> nombresUnicos = new HashSet<>();

        for(String elem: lista) {
            System.out.println(elem);
            if (!nombresUnicos.add(elem)) {
                   nombresDuplicados.add(elem);
            }
        }
        // este mensaje es para que este tipo que es desagradable, esté por encina de este otro que es feo
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Texto: " + texto.length());
        System.out.println("Lista texto: " + lista.length);
        System.out.println("Unicos " + nombresUnicos.size());
        System.out.println("Duplicados: " + nombresDuplicados.size());

        return "hola mono pelado";
    }

}
