import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = ingresaCliente();
        System.out.println(cuenta.mostrar());
    }

    public static Cuenta ingresaCliente() {
        Cuenta cuenta = new Cuenta();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre Titular");
        cuenta.setTitular(teclado.nextLine());

        System.out.println("Cantidad");
        cuenta.setCantidad(Float.parseFloat(teclado.nextLine()));

        return cuenta;
    }
}