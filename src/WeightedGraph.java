import java.util.*;

public class WeightedGraph<V> {
    private List<Vertex<V>> vertices = new ArrayList<>();

    public Vertex<V> addVertex(V data) {
        Vertex<V> v = new Vertex<>(data);
        vertices.add(v);
        return v;
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight) {
        source.addAdjacentVertex(dest, weight);
        // if undirected: dest.addAdjacentVertex(source, weight);
    }

    public List<Vertex<V>> getVertices() {
        return vertices;
    }
}