import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Inverse {
    Random random = new Random();

    Arreglos arreglos = new Arreglos();
    List<Integer> listaEnteros = arreglos.generaListaEnteros();

    public void algo() {
        System.out.println(listaEnteros);
        Collections.reverse(listaEnteros);
        System.out.println(listaEnteros);
    }

    //public List<Integer> ordena(){       return Collections.reverse(listaEnteros);   }

    public Inverse() {}


}
