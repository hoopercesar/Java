import java.util.*;

public class Main {
    // <>
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Animals animal = new Animals();
        Random random = new Random();

        Map<String, String> objetoAnimales = (Map<String, String>) animal.objetoAnimales();
        Collection<String> animales= objetoAnimales.keySet();
        Collection<String> frases = objetoAnimales.values();

        String[] arrayAnimals= animales.toArray(new String[0]);
        String[] arrayFrases = frases.toArray(new String[0]);


        int puntaje = 0;
        while (puntaje < 6) {
            int aleatorio = random.nextInt(6-puntaje);
            String keyAnimal = arrayAnimals[aleatorio];
            String valueFrases = arrayFrases[aleatorio];

            //System.out.println(array);

            System.out.println(valueFrases);
            System.out.println("Qué animal es?");
            String respuesta = teclado.nextLine();

            System.out.println(respuesta + " " + keyAnimal);
            if (!Objects.equals(respuesta, keyAnimal)) {
                System.out.println("Respuesta INcorrecta");
            } else {
                System.out.println("Respuesta Correcta");
                arrayFrases = removeElement(arrayFrases, keyAnimal);
                puntaje++;
                System.out.println(Arrays.toString(arrayFrases));
            }
            System.out.println("Tu puntaje : " + puntaje);
        }
    }

    // Método para eliminar un elemento de un array
    private static String[] removeElement(String[] array, String element) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove(element);
        return list.toArray(new String[0]);
    }
}