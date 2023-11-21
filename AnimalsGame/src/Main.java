import java.util.Collection;
import java.util.Map;
import java.util.Random;

public class Main {
    // <>
    public static void main(String[] args) {
        Animals animal = new Animals();
        Random random = new Random();
        int aleatorio = random.nextInt(6);

        Map<String, String> objetoAnimales = (Map<String, String>) animal.objetoAnimales();
        Collection<String> animales= objetoAnimales.keySet();
        Collection<String> frases = objetoAnimales.values();

        String[] arrayAnimals= animales.toArray(new String[0]);
        String[] arrayFrases = frases.toArray(new String[0]);

        String keyAnimal = arrayAnimals[aleatorio];
        //String valueFrases = arrayFrases[aleatorio];

        System.out.println(objetoAnimales.get(keyAnimal) + "; " + keyAnimal);



    }
}