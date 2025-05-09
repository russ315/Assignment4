import java.util.*;

public class BreadthFirstSearch<V> extends Search<V> {
    public BreadthFirstSearch(WeightedGraph<V> graph) {
        super(graph);
    }

    @Override
    public void search(Vertex<V> start) {
        distance.clear();
        predecessor.clear();
        Queue<Vertex<V>> queue = new LinkedList<>();

        for (Vertex<V> v : graph.getVertices()) {
            distance.put(v, Double.POSITIVE_INFINITY);
        }
        distance.put(start, 0.0);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> u = queue.poll();
            for (Vertex<V> v : u.getAdjacentVertices().keySet()) {
                if (distance.get(v).isInfinite()) {
                    distance.put(v, distance.get(u) + 1);
                    predecessor.put(v, u);
                    queue.add(v);
                }
            }
        }
    }
}