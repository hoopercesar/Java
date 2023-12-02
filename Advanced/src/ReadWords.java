import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadWords {

    public ReadWords() {}

    public static String ingresaTexto() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa texto");
        String texto = teclado.nextLine();
        String[] lista = texto.split(" ");

        Set<String> nombresDuplicados = new HashSet<>();
        System.out.println(lista.length);

        return "hola mono pelado";
    }

}
