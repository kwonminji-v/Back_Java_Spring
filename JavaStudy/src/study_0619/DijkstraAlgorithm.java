package study_0619;

import java.util.*;

public class DijkstraAlgorithm {
    public int[] calculateShortestPath(Graph graph, int startVertex) {
        int[] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[startVertex] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(startVertex, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;

            if (currentNode.distance > distance[currentVertex]) {
                continue;
            }

            List<Edge> adjacentEdges = graph.getAdjacentEdges(currentVertex);
            for (Edge edge : adjacentEdges) {
                int neighbor = edge.destination;
                int newDistance = distance[currentVertex] + edge.weight;

                if (newDistance < distance[neighbor]) {
                    distance[neighbor] = newDistance;
                    pq.offer(new Node(neighbor, newDistance));
                }
            }
        }

        return distance;
    }

    private static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return Integer.compare(distance, other.distance);
        }
    }

    private static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static class Graph {
        private List<List<Edge>> adjacencyList;

        public Graph(int size) {
            adjacencyList = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination, int weight) {
            adjacencyList.get(source).add(new Edge(source, destination, weight));
            adjacencyList.get(destination).add(new Edge(destination, source, weight));
        }

        public List<Edge> getAdjacentEdges(int vertex) {
            return adjacencyList.get(vertex);
        }

        public int size() {
            return adjacencyList.size();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(2, 4, 10);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 6);
        graph.addEdge(4, 5, 3);

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        int[] shortestPath = dijkstra.calculateShortestPath(graph, 0);

        for (int i = 0; i < shortestPath.length; i++) {
            System.out.println("vertex로부터의 0부터 vertex의 최단 거리는   " + i + ": " + shortestPath[i]);
        }
    }
}