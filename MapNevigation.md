# Dijkstra's Algorithm Implementation

This repository contains an implementation of Dijkstra's algorithm in Java. The algorithm is used to find the shortest path from a source vertex to all other vertices in a graph represented as an adjacency matrix.

---

## Algorithm Explanation

### Goal:
Find the shortest distance from a source vertex to all other vertices in a graph.

### Steps in the Code

1. **Define Constants and Helpers**
   - `V` is the number of vertices in the graph (set to 5 in this example).
   - `minDistance()` is a helper function to find the vertex with the smallest distance value that hasn’t been processed yet (not in the shortest path tree).

2. **Input Data**
   - An adjacency matrix `graph[][]` represents the graph:
     - `graph[u][v]` holds the weight (distance) between vertex `u` and vertex `v`.
     - If `graph[u][v]` is `0`, it means there’s no direct edge between those vertices.

3. **Initialize Dijkstra's Algorithm**
   - Create an array `dist[]` of size `V`, initialized to `Integer.MAX_VALUE` (infinity), to hold the shortest distance from the source to each vertex.
   - Create a boolean array `sptSet[]`, initialized to `false`, to keep track of vertices included in the shortest path tree.
   - Set `dist[src] = 0` (distance of the source vertex to itself is always `0`).

4. **Iterate Through Vertices**
   - Repeat the process for all vertices (except the source):
     - Find the vertex `u` with the smallest distance value from the set of vertices not yet processed using the `minDistance()` function.
     - Mark `u` as processed (`sptSet[u] = true`).

5. **Update Distances for Adjacent Vertices**
   - For every vertex `v` adjacent to `u`:
     - If `v` is not processed and there’s an edge between `u` and `v` (`graph[u][v] ≠ 0`):
     - Check if the path through `u` is shorter than the current `dist[v]`. If yes:
       - Update `dist[v]` to `dist[u] + graph[u][v]`.

6. **Repeat Until All Vertices Are Processed**
   - Repeat steps 4 and 5 until all vertices are processed or their shortest distances are determined.

7. **Print the Results**
   - Use the `printSolution()` function to display the shortest distances from the source vertex to all other vertices.

---

## Pseudo-Code Representation

```plaintext
Input: graph[][], src (source vertex)

1. Initialize:
   dist[] = {INFINITY, ..., INFINITY}
   sptSet[] = {false, ..., false}
   dist[src] = 0

2. For each vertex (V-1 times):
   a. Find u = vertex with minimum dist[] not in sptSet
   b. Mark u as processed (sptSet[u] = true)
   c. For each adjacent vertex v of u:
       - If v is not processed, graph[u][v] exists, and
         dist[u] + graph[u][v] < dist[v]:
           Update dist[v] = dist[u] + graph[u][v]

3. Output dist[] as the shortest distances from src.
```

output - 

<img width="191" alt="{53B02A31-5891-4015-A05F-A91D4128E012}" src="https://github.com/user-attachments/assets/cfe817bf-6887-4d07-a142-72e0fd64109f">
