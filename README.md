## Primera prueba de la evaluación continua en Técnicas de Programación

# Descripción
Consiste en hacer tres actividades diferentes. La primera es calcular pi mediante el método de Montecarlo, el segundo es el juego de la vida con dos casos, el primero con una matriz ya dada y el seegundo, 
generando células al azar y luego que juegue al juego. El último es un grafo, que sirve para encontrar un camino entre dos vertices.
Hay diagramas de Actividades, flujo, objetos y secuencia de todas las actividades

# Práctica 1: Obtención de una aproximación al número pi
Descripción:
Implementar un programa que permita obtener una aproximación al número pi utilizando el método de Montecarlo. El programa debe generar puntos aleatorios dentro de un cuadrado y contar cuántos caen dentro de un círculo inscrito para estimar el valor de pi.

Requisitos:

Implementar el método generarNumeroPi en la clase Matematicas.java.

El programa principal debe mostrar el resultado de la aproximación.

Complejidad:

La complejidad del algoritmo es O(n), donde n es el número de puntos generados.

#Práctica 2: El juego de la vida
Descripción:
Implementar una versión del juego de la vida, un autómata celular que simula la evolución de una población de células en un tablero. Las células siguen reglas específicas para vivir, morir o nacer en cada generación.

Requisitos:

Implementar la clase Tablero.java que lee el estado inicial de un fichero y transita entre estados según las reglas del juego.

El programa principal debe mostrar la evolución del tablero en cada generación.

Complejidad:

La complejidad del algoritmo es O(n^2), donde n es el número de celdas en el tablero.

#Práctica 3: Búsqueda de un camino en un grafo
Descripción:
Implementar una estructura de datos de grafo y un método para encontrar un camino entre dos vértices. El grafo debe ser representado mediante una lista de adyacencia.

Requisitos:

Implementar la clase Graph.java con métodos para añadir vértices, añadir arcos, obtener vértices adyacentes, y encontrar un camino entre dos vértices.

El método onePath debe encontrar un camino entre dos vértices utilizando una búsqueda en profundidad (DFS).

Complejidad:

La complejidad del algoritmo de búsqueda es O(V + E), donde V es el número de vértices y E es el número de arcos en el grafo.

Criterios de Evaluación
Funcionalidad: El producto debe funcionar correctamente para alcanzar la puntuación de aprobado.

Calidad del código: Se valorará la legibilidad, eficiencia, y extensibilidad del código.

Documentación: Se valorará la documentación en Javadoc, el archivo readme.md, y los comentarios adicionales en el código.

Pruebas: Para la práctica 3, se valorará que las pruebas sean adecuadas y estén documentadas.

Gestión de repositorios: Se valorará la gestión de los commits en el repositorio.

Forma de Entrega
Los materiales deben ser subidos a un repositorio remoto accesible por el profesor.

No se corregirá material que no haya sido subido al repositorio.

Las fechas de entrega serán publicadas por el profesor en el portal del alumno.

Licencias
Al principio de cada fichero de código fuente se debe incluir el siguiente comentario, reemplazando los corchetes por la información específica:

java
Copy
Copyright 2025 Daniel Garcia Yuste

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
Diagramas UML
Se deben incluir diagramas UML en formato de Umbrello para cada práctica, mostrando la estructura de las clases y sus relaciones.

Fichero .gitignore
Se debe incluir un fichero .gitignore en el repositorio para evitar subir archivos innecesarios como binarios o archivos de configuración local.


link al repo : https://github.com/Yuste33/Examen-1-Tecnicas-de-programacion
link al video: https://youtu.be/mg3Odm8c1o8
