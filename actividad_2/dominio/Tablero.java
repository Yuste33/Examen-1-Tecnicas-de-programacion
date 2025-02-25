package actividad_2.dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Tablero {
    private static final int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public Tablero() {
        estadoActual = new int[DIMENSION][DIMENSION];
    }

    public void leerEstadoActual() {
        try (BufferedReader br = new BufferedReader(new FileReader("actividad_2/matriz.txt"))) {
            String linea;
            int fila = 0;
            while ((linea = br.readLine()) != null && fila < DIMENSION) {
                linea = linea.trim(); // Elimina espacios en blanco al principio y al final
                for (int col = 0; col < DIMENSION && col < linea.length(); col++) {
                    estadoActual[fila][col] = Character.getNumericValue(linea.charAt(col));
                }
                fila++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        calcularEstadoSiguiente();
    }

    public void generarEstadoActualPorMontecarlo() {
        Random rand = new Random();
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = rand.nextDouble() < 0.5 ? 1 : 0;
            }
        }
        calcularEstadoSiguiente();
    }

    public void transitarAlEstadoSiguiente() {
        estadoActual = estadoSiguiente;
        estadoSiguiente = new int[DIMENSION][DIMENSION];
        calcularEstadoSiguiente();
    }

    private void calcularEstadoSiguiente() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                if (estadoActual[i][j] == 1) {
                    estadoSiguiente[i][j] = (vecinosVivos == 2 || vecinosVivos == 3) ? 1 : 0;
                } else {
                    estadoSiguiente[i][j] = (vecinosVivos == 3) ? 1 : 0;
                }
            }
        }
    }

    private int contarVecinosVivos(int fila, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int x = fila + i;
                int y = col + j;
                if (x >= 0 && x < DIMENSION && y >= 0 && y < DIMENSION && estadoActual[x][y] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                sb.append(estadoActual[i][j] == 1 ? "x" : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
