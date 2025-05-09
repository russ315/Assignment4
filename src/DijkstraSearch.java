import java.util.*;

public class DijkstraSearch<V> extends Search<V> {
    public DijkstraSearch(WeightedGraph<V> graph) {
        super(graph);
    }

    @Override
    public void search(Vertex<V> start) {
        distance.clear();
        predecessor.clear();
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparingDouble(distance::get));

        for (Vertex<V> v : graph.getVertices()) {
            distance.put(v, Double.POSITIVE_INFINITY);
        }
        distance.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Vertex<V> u = pq.poll();
            for (Map.Entry<Vertex<V>, Double> entry : u.getAdjacentVertices().entrySet()) {
                Vertex<V> v = entry.getKey();
                double weight = entry.getValue();
                double alt = distance.get(u) + weight;
                if (alt < distance.get(v)) {
                    distance.put(v, alt);
                    predecessor.put(v, u);
                    pq.remove(v);
                    pq.add(v);
                }
            }
        }
    }
}