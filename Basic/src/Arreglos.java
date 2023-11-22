import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arreglos {
    Random random = new Random();

    public Arreglos(){}

    public List<Integer> generaListaEnteros(){
        List<Integer> listaEnteros = new ArrayList<>();
        for (int i=0; i<20; i++) {
            listaEnteros.add(random.nextInt(300));
        }
        return listaEnteros;
    }

    public int sumaNumerosPares() {
        List<Integer> listaNumeros = generaListaEnteros();
        int suma = 0;
        for (Integer listaNumero : listaNumeros) {
            if (listaNumero%2 == 0) {
                suma += listaNumero;
            }
        }
        return suma;
    }

    // <>
}
