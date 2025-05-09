public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> a = graph.addVertex("A");
        Vertex<String> b = graph.addVertex("B");
        Vertex<String> c = graph.addVertex("C");
        Vertex<String> d = graph.addVertex("D");

        graph.addEdge(a, b, 1.0);
        graph.addEdge(a, c, 4.0);
        graph.addEdge(b, c, 2.0);
        graph.addEdge(b, d, 5.0);
        graph.addEdge(c, d, 1.0);

        // BFS (unweighted shortest path in hops)
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph);
        bfs.search(a);
        System.out.println("BFS distance (in hops) from A to D: " + bfs.getDistance(d));
        System.out.println("Path: " + bfs.getPath(d));

        // Dijkstra (weighted shortest path)
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph);
        dijkstra.search(a);
        System.out.println("Dijkstra distance from A to D: " + dijkstra.getDistance(d));
        System.out.println("Path: " + dijkstra.getPath(d));
    }
}
