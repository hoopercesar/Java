import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clientes cliente = muestraCliente();
        System.out.println(cliente);

    }

    private static Clientes muestraCliente() {
        Scanner teclado = new Scanner(System.in);
        Clientes cliente = new Clientes();

        System.out.println("nombre");
        cliente.nombre = teclado.nextLine();

        System.out.println("Apellido");
        cliente.apellido = teclado.nextLine();

        System.out.println("edad");
        cliente.edad = teclado.nextInt();

        // System.out.println(cliente.nombre + ' ' + cliente.apellido + ' ' + cliente.edad);


        return cliente;

    }
}