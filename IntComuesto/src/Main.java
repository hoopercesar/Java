import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InteresCompuesto interes = ingresaDatos();

        System.out.println(interes.mostrar());
    }

public static InteresCompuesto ingresaDatos() {
        Scanner teclado = new Scanner(System.in);
        InteresCompuesto interes = new InteresCompuesto();

        System.out.println("Ingresa el Monto");
        interes.setMonto(Float.parseFloat(teclado.nextLine()));

        System.out.println("ingresa tiempo");
        interes.setTiempo(Integer.valueOf(teclado.nextLine()));

        return interes;

}


}