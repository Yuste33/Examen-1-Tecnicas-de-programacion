package actividad_1;

import java.util.Random;

public class Matematicas {
    public static double generarNumeroPi(long pasos){
        Random random = new Random();
        long aciertos =0;

        for (long i = 0; i < pasos; i++) {
            double x = -1 +2 * random.nextDouble();
            double y = -1 +2 * random.nextDouble();

            if((x*y +x*y) <=1 ){
                aciertos++;
            }
        }
        return 4.0* aciertos/pasos;
    }
}
