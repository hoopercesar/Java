import java.util.List;
import java.util.Random;

public class Exceptions {


    public int[] llenaArreglo() {
        int[] arreglo = new int[10];
        Random random = new Random();
        try{
            for(int k=0; k<12; k++){
                arreglo[k] = random.nextInt(30);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Su teléfono contiene cifras extras");
        }
        return arreglo;
    }


    // <>
}
