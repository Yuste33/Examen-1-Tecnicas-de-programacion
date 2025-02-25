package actividad_2.dominio;

import java.util.Random;
import java.util.Scanner;

public class Tablero {
    private static final int DIMENSION =30;
    private int[][] estadoActual =new int[DIMENSION][DIMENSION];
    private int[][] estadoSiguiente =new int[DIMENSION][DIMENSION];

    public void leerEstadoActual() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < DIMENSION; i++) {
            String linea = scanner.nextLine();
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = Character.getNumericValue(linea.charAt(j));

            }
            
        }
    }

    public void generarEstadoActualPorMonteclaro(){
        Random random =new Random();
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j]=(random.nextDouble() < 0.5) ? 1:0;
            }
        }
    }

}
