import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = ingresaCliente();
        System.out.println(cuenta.mostrar());
    }

    public static float retiraDinero(float cantidad, float saldo){
        if (cantidad > saldo) {
            return;
        }
        
        saldo -= cantidad;

        return saldo;

    }

    public static Cuenta ingresaCliente() {
        Cuenta cuenta = new Cuenta();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre Titular");
        cuenta.setTitular(teclado.nextLine());

        System.out.println("Cantidad");
        cuenta.setCantidad(Float.parseFloat(teclado.nextLine()));

        System.out.println("Ingresa cantidad a retirar");
        float cantidadRetirar = Float.parseFloat(teclado.nextLine());
        if (cantidadRetirar > cuenta.getCantidad()) {
            return;
        }


        return cuenta;
    }

    // <>


}