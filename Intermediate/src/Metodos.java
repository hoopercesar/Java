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
        while (counter < 3) {
            producto = new Producto();

            System.out.println("nombre producto");
            producto.setNombre(teclado.nextLine());

            System.out.println("precio");
            producto.setPrecio(Integer.parseInt(teclado.nextLine()));

            listaProductos.add(producto);

            counter++;
        }
        // <>

        System.out.println(listaProductos.size());
        List<Producto> listaOrdenada = new ArrayList<>();

        int precioMayor = 0;
        for (Producto elem: listaProductos){
            if (elem.getPrecio()>precioMayor){
                precioMayor=elem.getPrecio();
            }
        }


        return "resultado___";
    }

}
