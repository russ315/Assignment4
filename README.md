Graph Search Implementation in Java

This repository provides a generic, edge-weighted graph implementation in Java, featuring:

Vertex<V>: A generic node class holding data of type V and a map of adjacent vertices with edge weights.

WeightedGraph<V>: A container for vertices and edges, supporting addition of vertices and weighted edges (directed by default).

Search Framework: An abstract Search<V> class that tracks distances and predecessors.

BreadthFirstSearch<V>: Unweighted shortest-path (in hops) via BFS.

DijkstraSearch<V>: Weighted shortest-path via Dijkstra’s algorithm.

Main.java: Example usage demonstrating both BFS and Dijkstra on a sample graph.

Features

Generic Vertices: Can store any data type (e.g., String, Integer, custom objects).

Weighted Edges: Supports double weights for Dijkstra’s algorithm.

Extensible Search: Easily add new search algorithms by extending Search<V>.

Undirected Option: Simply add reciprocal edges for undirected graphs.

