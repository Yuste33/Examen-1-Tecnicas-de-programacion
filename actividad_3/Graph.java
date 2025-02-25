package actividad_3;

import java.util.*;

public class Graph<V> {
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v) {
        if (adjacencyList.containsKey(v)) {
            return false;
        }
        adjacencyList.put(v, new HashSet<>());
        return true;
    }

    public boolean addEdge(V v1, V v2) {
        addVertex(v1);
        addVertex(v2);
        return adjacencyList.get(v1).add(v2);
    }

    public Set<V> obtainAdjacents(V v) throws Exception {
        if (!adjacencyList.containsKey(v)) {
            throw new Exception("El vértice no existe en el grafo.");
        }
        return adjacencyList.get(v);
    }

    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<V, Set<V>> entry : adjacencyList.entrySet()) {
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public List<V> onePath(V v1, V v2) {
        if (!containsVertex(v1) || !containsVertex(v2)) {
            return null;
        }

        Map<V, V> trace = new HashMap<>();
        Stack<V> stack = new Stack<>();

        stack.push(v1);
        trace.put(v1, null);

        while (!stack.isEmpty()) {
            V current = stack.pop();

            if (current.equals(v2)) {
                return buildPath(trace, v2);
            }

            for (V neighbor : adjacencyList.get(current)) {
                if (!trace.containsKey(neighbor)) {
                    stack.push(neighbor);
                    trace.put(neighbor, current);
                }
            }
        }

        return null;
    }

    private List<V> buildPath(Map<V, V> trace, V v2) {
        List<V> path = new ArrayList<>();
        V current = v2;

        while (current != null) {
            path.add(current);
            current = trace.get(current);
        }

        Collections.reverse(path);
        return path;
    }
}