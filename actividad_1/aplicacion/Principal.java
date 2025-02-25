package actividad_1.aplicacion;

import actividad_1.mates.Matematicas;

public class Principal{
    public static void main(String[] args){
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(Integer.parseInt(args[0])));
    }
}
