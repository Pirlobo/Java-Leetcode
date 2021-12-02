
// Java implementation to find the
// shortest path in a directed
// graph from source vertex to
// the destination vertex
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class GFG {

    static final int infi = 1000000000;

    // Class of the node
    static class Node {
        int vertexNumber;

        // Adjacency list that shows the
        // vertexNumber of child vertex
        // and the weight of the edge
        List<Pair> children;

        Node(int vertexNumber) {
            this.vertexNumber = vertexNumber;
            children = new ArrayList<>();
        }

        // Function to add the child for
        // the given node
        void add_child(int vNumber, int length) {
            Pair p = new Pair(vNumber, length);
            children.add(p);
        }
    }

    // Function to find the distance of
    // the node from the given source
    // vertex to the destination vertex
    static int[] dijkstraDist(List<Node> g,
            int s, int[] path) {

        // Stores distance of each
        // vertex from source vertex
        int[] dist = new int[g.size()];

        // Boolean array that shows
        // whether the vertex 'i'
        // is visited or not
        boolean[] visited = new boolean[g.size()];
        for (int i = 0; i < g.size(); i++) {
            visited[i] = false;
            path[i] = -1;
            dist[i] = infi;
        }
        dist[s] = 0;
        path[s] = -1;
        int current = s;

        // Set of vertices that has
        // a parent (one or more)
        // marked as visited
        Set<Integer> sett = new HashSet<>();
        while (true) {

            // Mark current as visited
            visited[current] = true;
            for (int i = 0; i < g.get(current).children.size(); i++) {
                int v = g.get(current).children.get(i).first;

                if (visited[v])
                    continue;

                // Inserting into the
                // visited vertex
                sett.add(v);
                int alt = dist[current] +
                        g.get(current).children.get(i).second;

                // Condition to check the distance
                // is correct and update it
                // if it is minimum from the previous
                // computed distance
                if (alt < dist[v]) {
                    dist[v] = alt;
                    path[v] = current;
                }
            }
            sett.remove(current);

            if (sett.isEmpty())
                break;

            // The new current
            int minDist = infi;
            int index = 0;

            // Loop to update the distance
            // of the vertices of the graph
            for (int a : sett) {
                if (dist[a] < minDist) {
                    minDist = dist[a];
                    index = a;
                }
            }
            current = index;
        }
        return dist;
    }

    // Function to print the path
    // from the source vertex to
    // the destination vertex
    void printPath(int[] path, int i, int s) {
        if (i != s) {

            // Condition to check if
            // there is no path between
            // the vertices
            if (path[i] == -1) {
                System.out.println("Path not found!!");
                return;
            }
            printPath(path, path[i], s);
            System.out.print(path[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        List<Node> v = new ArrayList<>();
        int n = 4, s = 0, e = 5;

        // Loop to create the nodes
        for (int i = 0; i < n; i++) {
            Node a = new Node(i);
            v.add(a);
        }

        // Creating directed
        // weighted edges
        v.get(0).add_child(1, 1);
        v.get(0).add_child(2, 4);
        v.get(1).add_child(2, 2);
        v.get(1).add_child(3, 6);
        v.get(2).add_child(3, 3);

        int[] path = new int[v.size()];
        int[] dist = dijkstraDist(v, s, path);

        // Loop to print the distance of
        // every node from source vertex
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == infi) {
                System.out.printf("%d and %d are not " +
                        "connected\n", i, s);
                continue;
            }
            System.out.printf("Distance of %dth vertex " +
                    "from source vertex %d is: %d\n",
                    i, s, dist[i]);
        }
    }
}

// This code is contributed by sanjeev2552