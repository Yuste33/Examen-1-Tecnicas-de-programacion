package actividad_2.aplicacion;
import actividad_2.dominio.Tablero;

import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        try {
            Tablero tablero = new Tablero();

            System.out.println("SIMULACION CON TABLERO LEÍDO");
            tablero.leerEstadoActual();
            System.out.println(tablero);

            for (int i = 0; i <= 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }

            System.out.println("SIMULACION CON TABLERO GENERADO MEDIANTE MONTECARLO");
            tablero.generarEstadoActualPorMontecarlo();
            System.out.println(tablero);

            for (int i = 0; i <= 15; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
