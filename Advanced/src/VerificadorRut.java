import java.util.Scanner;

public class VerificadorRut {
    private static String rut;

    public VerificadorRut(){

    }

    // <>

    public static String creaDigito(){
        String[] numeros = ingresaRut().split("");
        int[] multiplicadores = {2, 3, 4, 5, 6, 7, 2, 3};

        for(String numero: numeros){
            System.out.println(Integer.parseInt(numero) - 1);
        }

        return "a";
    }



    public static String ingresaRut(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa RUT: 12345678-9");
        rut = teclado.nextLine();

        return rut;
    }
}
