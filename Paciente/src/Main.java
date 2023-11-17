import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = ingresaPaciente();
        System.out.println(paciente.muestraPaciente());

    }

    public static String creaIdPaciente() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static Integer calculaEdad(String fechaNacimiento) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate today = LocalDate.now();

        return Period.between(fechaNac, today).getYears();
    }

    private static Paciente ingresaPaciente() {
        Scanner teclado = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("nombre");
        paciente.setNombre(teclado.nextLine());

        System.out.println("apellido");
        paciente.setApellido(teclado.nextLine());

        System.out.println("fecha nacimiento YYYY-MM-DD");
        paciente.setFechaNacimiento(teclado.nextLine());

        System.out.println("fecha ingreso");
        paciente.setFechaCreacion(teclado.nextLine());

        System.out.println("DNI");
        paciente.setDNI(teclado.nextLine());

        paciente.setID(creaIdPaciente());

        paciente.setEdad(calculaEdad(paciente.getFechaNacimiento()));

        return paciente;
    }



}