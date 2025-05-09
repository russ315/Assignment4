import java.util.*;

public abstract class Search<V> {
    protected WeightedGraph<V> graph;
    protected Map<Vertex<V>, Double> distance = new HashMap<>();
    protected Map<Vertex<V>, Vertex<V>> predecessor = new HashMap<>();

    public Search(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    public abstract void search(Vertex<V> start);

    public double getDistance(Vertex<V> v) {
        return distance.getOrDefault(v, Double.POSITIVE_INFINITY);
    }

    public List<Vertex<V>> getPath(Vertex<V> end) {
        List<Vertex<V>> path = new LinkedList<>();
        Vertex<V> step = end;
        if (predecessor.get(step) == null && !step.equals(step)) {
            return path; // no path
        }
        path.add(step);
        while (predecessor.containsKey(step)) {
            step = predecessor.get(step);
            path.add(0, step);
        }
        return path;
    }
}