import actividad_1.mates.Matematicas;
import actividad_2.dominio.Tablero;
import actividad_3.Graph;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Actividad 1: Aproximación de π con Montecarlo");
            System.out.println("2. Actividad 2: Juego de la Vida");
            System.out.println("3. Actividad 3: Búsqueda de un camino en un grafo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    actividad1();
                    break;
                case 2:
                    actividad2();
                    break;
                case 3:
                    actividad3();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void actividad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de pasos para la aproximación de π: ");
        long pasos = scanner.nextLong();

        double pi = Matematicas.generarNumeroPi(pasos);
        System.out.println("Aproximación de π: " + pi);
    }

    private static void actividad2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Juego de la Vida ===");
        System.out.println("1. Leer estado inicial desde archivo");
        System.out.println("2. Generar estado inicial aleatorio");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        Tablero tablero = new Tablero();

        if (opcion == 1) {
            tablero.leerEstadoActual();
        } else if (opcion == 2) {
            tablero.generarEstadoActualPorMontecarlo();
        } else {
            System.out.println("Opción no válida. Volviendo al menú principal.");
            return;
        }

        System.out.println("Estado inicial del tablero:");
        System.out.println(tablero);

        System.out.print("Ingrese el número de iteraciones: ");
        int iteraciones = scanner.nextInt();

        for (int i = 0; i < iteraciones; i++) {
            try {
                Thread.sleep(1000); // Esperar 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tablero.transitarAlEstadoSiguiente();
            System.out.println("Iteración " + (i + 1) + ":");
            System.out.println(tablero);
        }
    }

    private static void actividad3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Búsqueda de un camino en un grafo ===");

        Graph<Integer> grafo = new Graph<>();
        grafo.addEdge(1, 2);
        grafo.addEdge(1, 5);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 4);
        grafo.addEdge(5, 6);
        grafo.addEdge(6, 4);

        System.out.println("Grafo creado:");
        System.out.println(grafo);

        System.out.print("Ingrese el vértice inicial: ");
        int v1 = scanner.nextInt();
        System.out.print("Ingrese el vértice final: ");
        int v2 = scanner.nextInt();

        List<Integer> camino = grafo.onePath(v1, v2);

        if (camino != null) {
            System.out.println("Camino encontrado: " + camino);
        } else {
            System.out.println("No hay camino entre los vértices " + v1 + " y " + v2);
        }

    }
}