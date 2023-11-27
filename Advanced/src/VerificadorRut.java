import java.util.Scanner;

public class VerificadorRut {
    private static String rut;

    public VerificadorRut(){

    }

    // <>

    public static Object creaDigito(){
        String[] numeros = ingresaRut().split("");
        int[] multiplicadores = {3, 2, 7, 6, 5, 4, 3, 2};

        int k = 0;
        int suma = 0;
        for(String numero: numeros){
            System.out.println(suma);
            suma += Integer.parseInt(numero)*multiplicadores[k];
            k++;
        }

        int parteEntera = suma/11 - suma % 11/10;
        Object digito;

        if (Math.abs(parteEntera-11) == 10) {
            digito = "K";
        } else if (Math.abs(parteEntera-11) == 0) {
            digito = 11;
        } else {
            digito = Math.abs(parteEntera-11);
        }

        System.out.println();

        return "El dígito es: " + digito;
    }



    public static String ingresaRut(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa RUT: 12345678-9");
        rut = teclado.nextLine();

        return rut;
    }
}
