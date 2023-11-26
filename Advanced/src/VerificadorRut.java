import java.util.Scanner;

public class VerificadorRut {
    private static String rut;

    public VerificadorRut(){

    }

    public static String creaDigito(){
        String numero = ingresaRut();

        return "a";
    }



    public static String ingresaRut(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa RUT: 12345678-9");
        rut = teclado.nextLine();

        return rut;
    }
}
