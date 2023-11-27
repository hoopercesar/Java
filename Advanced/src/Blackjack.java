import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    private int cantidadCartas;

    public Blackjack(){}

    // <>

    public static int ingresaCantidadCartas(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        Object[] cartas = {2, 3, 4, 5, 6, 7, 8, 9, 10, "J", "Q", "K", "A"};

        System.out.println("Black Jack!");
        int cantidadCartas = 2;

        Object[] cartasJugador = new Object[13];


        for (int k=0; k<cantidadCartas; k++) {
            cartasJugador[k] = cartas[random.nextInt(13)];
            System.out.println(cartasJugador[k]);

        }



        return 666;

    }


}
