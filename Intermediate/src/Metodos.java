import java.util.*;

public class Metodos {

    public static Object ingresaProducto() {
        Scanner teclado = new Scanner(System.in);
        Producto producto = new Producto();

        List<Producto> listaProductos = new ArrayList<>();

        int counter = 0;
        List resultado = null;
        while (counter < 5) {
            producto = new Producto();

            System.out.println("nombre producto");
            producto.setNombre(teclado.nextLine());

            System.out.println("precio");
            producto.setPrecio(Integer.parseInt(teclado.nextLine()));

            listaProductos.add(producto);

            counter++;
        }
        // <>

        // Devuelve el objeto producto ordenado por precio de menor a mayor.
        Comparator<Producto> comparadorPorPrecio = Comparator.comparingDouble(Producto::getPrecio);
        listaProductos.sort(comparadorPorPrecio);

        System.out.println("###################################");

        for (Producto elem: listaProductos) {
            System.out.println(elem.getPrecio());
        }



        return "resultado___";
    }

}
