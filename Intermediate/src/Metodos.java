import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Metodos {

    public static Object ingresaProducto() {
        Scanner teclado = new Scanner(System.in);
        Producto producto = new Producto();

        List<Producto> listaProductos = new ArrayList<>();

        int counter = 0;
        List resultado = null;
        while (counter < 4) {
            producto = new Producto();

            System.out.println("nombre producto");
            producto.setNombre(teclado.nextLine());

            System.out.println("precio");
            producto.setPrecio(Integer.parseInt(teclado.nextLine()));

            listaProductos.add(producto);



            counter++;
        }

        resultado = (List) ordenaMayorAMenor(listaProductos);


        return resultado;
    }

    public static Object ordenaMayorAMenor(List algo) {
        Collections.sort(algo);
        return algo;
    }
}
