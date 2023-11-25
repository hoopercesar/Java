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

        System.out.println("###################################");

        Set<String> nombresUnicos = new HashSet<>();
        Set<String> nombresDuplicados = new HashSet<>();

        for (Producto elem: listaProductos) {
            if (!nombresUnicos.add(elem.getNombre())) {
                // El nombre ya está en el conjunto, por lo tanto, es un duplicado
                nombresDuplicados.add(elem.getNombre());
            }
        }

        //En el contexto de Set, el método add retorna true si el elemento
        //fue agregado exitosamente al conjunto, lo que indica que el elemento
        //no estaba presente antes. Retorna false si el elemento ya estaba
        //presente en el conjunto.

        //Por lo tanto, !nombresUnicos.add(producto.getNombre()) se evalúa como
        //true si el nombre ya estaba presente en el conjunto (indicando un duplicado),
        //y false si el nombre no estaba presente y fue agregado correctamente al conjunto.

        System.out.println(nombresDuplicados.size());



        return "resultado___";
    }

}
