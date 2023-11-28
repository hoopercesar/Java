import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    private int cantidadCartas;

    public Blackjack(){}

    // <>

    public static void ingresaCantidadCartas(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Black Jack!");
        Object[] cartasJugador = (Object[]) entregaCartas(2);

        System.out.println("Estas son tus cartas");
        for (Object carta: cartasJugador) {
            System.out.println(carta);
        }

        sumaCartas(cartasJugador);
        
        System.out.println("Quieres más cartas? (s/n)");
        if (Objects.equals(teclado.nextLine(), "s")) {

            System.out.println("Cuántas cartas quieres?");
            Object[] nuevasCartas = (Object[]) entregaCartas(teclado.nextInt());
            System.out.println("Ésta es tu nueva carta");
            for(Object nueva: nuevasCartas){
                System.out.println(nueva);
            }
            sumaCartas(nuevasCartas);
        } 
        
    }

    public static int sumaCartas(Object[] cartasEnMano){
        int suma = 0;
        for(Object carta: cartasEnMano) {
            if (carta=="J" || carta=="Q" || carta=="K") {
                suma += 10;
            } else if (carta=="A") {
                suma += 11;
            } else {
                suma += (Integer) carta;
            }
        }
        System.out.println("Esta es la suma: " + suma);
        return suma;
    }


    public static Object entregaCartas(int cantidadCartas) {
        Random random = new Random();
        Object[] cartas = {2, 3, 4, 5, 6, 7, 8, 9, 10, "J", "Q", "K", "A"};
        Object[] nuevasCartas = new Object[cantidadCartas];

        for(int k=0; k<cantidadCartas; k++) {
            nuevasCartas[k] = cartas[random.nextInt(13)];
        }
        return nuevasCartas;
    }


}
