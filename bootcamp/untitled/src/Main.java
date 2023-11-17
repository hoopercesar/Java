import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = muestraCliente();
        cliente1.mostrarDatos();

    }

    private static Clientes muestraCliente() {
        Scanner teclado = new Scanner(System.in);
        Clientes cliente = new Clientes("pepe", "soto", 45);

        System.out.println("nombre");
        //cliente.setNombre(teclado.nextLine());

        System.out.println("Apellido");
        //cliente.setApellido(teclado.nextLine());

        System.out.println("edad");
        //cliente.setEdad(teclado.nextInt());

        //cliente.mostrarDatos();

        return cliente;

    }
}