import java.util.*;

public class Main {


    public static void main(String[] args) {
        String amigo = buscaAmigo();
        int a = 3;
        Integer b = 8;
        String[] ciudades = new String[10];
        Object algo = new Object[10];

        System.out.println(a);
        System.out.println(b.getClass());
        System.out.println(algo.getClass());


    }

    public static String buscaAmigo(){
        Scanner teclado = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();

        nombres.add("pepe");
        nombres.add("juan");
        nombres.add("carlos");
        nombres.add("manuela");
        nombres.add("maria");
        nombres.add("juana");
        nombres.add("camila");
        nombres.add("raúl");
        nombres.add("manolo");
        nombres.add("bernarda");

        Random random = new Random();

        int aleatorio = random.nextInt(nombres.size());
        String nombreAmigo = nombres.get(aleatorio);

        System.out.println("Ingresa tu nombre");
        String tuNombre = teclado.nextLine();

        if (Objects.equals(tuNombre, nombreAmigo)) {
            aleatorio = random.nextInt(nombres.size());
            nombreAmigo = nombres.get(aleatorio);
        } else {
            System.out.println("Tú eres el amigo secreto de " + nombreAmigo);
        }


        return "alguien";
    }
}

// <>