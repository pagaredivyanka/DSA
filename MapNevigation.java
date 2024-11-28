import java.util.Arrays;

public class MapNevigation {

    static final int V = 5;

    // Function to find the vertex with the minimum distance value, from
    // the set of vertices not yet included in the shortest path tree
    static int minDistance(int[] dist, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    // Function to print the constructed distance array
    static void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    // Function that implements Dijkstra's algorithm for a graph represented
    // using an adjacency matrix
    static void dijkstra(int[][] graph, int src) {
        int[] dist = new int[V]; // The output array. dist[i] will hold the shortest distance from src to i
        boolean[] sptSet = new boolean[V]; // sptSet[i] will be true if vertex i is included in shortest path tree

        // Initialize all distances as INFINITE and sptSet[] as false
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(sptSet, false);

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet); // Pick the minimum distance vertex
            sptSet[u] = true; // Mark the picked vertex as processed

            // Update dist[] for adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print the constructed distance array
        printSolution(dist);
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 10, 0, 0, 0 },
                { 10, 0, 5, 0, 0 },
                { 0, 5, 0, 20, 1 },
                { 0, 0, 20, 0, 2 },
                { 0, 0, 1, 2, 0 }
        };

        dijkstra(graph, 0);
    }
}
