import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InteresCompuesto interes = ingresaDatos();

        System.out.println(interes.mostrar());
        System.out.println(1000*Math.pow(1.05, 2));
    }

public static InteresCompuesto ingresaDatos() {
        Scanner teclado = new Scanner(System.in);
        InteresCompuesto interes = new InteresCompuesto();

        System.out.println("Ingresa el Monto");
        interes.setMonto(Float.parseFloat(teclado.nextLine()));

        System.out.println("ingresa tiempo");
        interes.setTiempo(Integer.valueOf(teclado.nextLine()));

        interes.setMonto(calculaInteres(interes.getMonto(), interes.getTiempo()));

        return interes;

}

public static float calculaInteres(float monto, Integer tiempo) {

        return (float) (monto*Math.pow(1+0.05, tiempo));
}


}