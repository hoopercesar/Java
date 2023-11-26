import java.util.Random;

public class Matriz {

    public int[][] llenaMatriz(){

        int filas = 3;
        int cols = 3;
        int[][] matriz = new int[filas][cols];
        Random random = new Random();

        for (int i=0; i<filas; i++) {
            for (int j=0; j<cols; j++) {
                int aleatorio = random.nextInt();
                matriz[i][j] = aleatorio;

            }
        }

        return matriz;
    }


}
