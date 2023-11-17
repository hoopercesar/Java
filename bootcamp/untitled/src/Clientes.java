public class Clientes {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Clientes(String parametroNombre, String parametroApellido, Integer parametroEdad) {
        this.edad = parametroEdad;
        this.nombre = parametroNombre;
        this.apellido = parametroApellido;
    }

    public void mostrarDatos() {

        System.out.println(nombre + ' ' + apellido);
        System.out.println(edad);
    }

    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public Integer getEdad() {
        return edad;
    }


}
