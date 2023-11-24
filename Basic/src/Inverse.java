import java.util.List;
import java.util.Random;

public class Inverse {
    Random random = new Random();

    Arreglos arreglos = new Arreglos();
    List<Integer> listaEnteros = arreglos.generaListaEnteros();

    public void algo() {
        System.out.println(listaEnteros);
        System.out.println(List.reverse(listaEnteros));
    }

    //public List<Integer> ordena(){       return Collections.reverse(listaEnteros);   }

    public Inverse() {}


}
