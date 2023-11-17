public class Paciente {

    private String nombre;
    private String apellido;
    private String fechaCreacion;
    private String fechaNacimiento;

    private Integer edad;

    private String ID;

    private String DNI;

    public String muestraPaciente() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", ID=" + ID +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getID() {
        return String.valueOf(ID);
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}


