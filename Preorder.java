import java.util.LinkedList;
import java.util.*;
public class Preorder {
    static boolean[] visited = new boolean[13]; 
    static class Graph {
        int vertices;
        LinkedList<Integer>[] adjList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination) {
            adjList[source].addFirst(destination);
        }

        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                if (adjList[i].size() > 0) {
                    System.out.println("Vertex " + i + " is connected to: ");
                    for (int j = 0; j < adjList[i].size(); j++) {
                        System.out.print(adjList[i].get(j) + " ");
                    }
                    System.out.println();
                }
            }
        }

        public void DFSRecursion(int startVertex) {
            dfs(startVertex, visited);
        }

        public void dfs(int start, boolean[] visited) {
            visited[start] = true;
            System.out.print(start + " ");
            visited[start] = true;
            for (int i = 0; i < adjList[start].size(); i++) {
                int destination = adjList[start].get(i);
                if (!visited[destination])
                    dfs(destination, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int vertices = 13;
        Graph graph = new Graph(vertices);
        System.out.println("Enter pairs : ");
        while (true) {
            String pair = input.nextLine();
            if (pair.equals("stop")) {
                break;
            }
            String[] splitted = pair.split(" ");
            Integer edgeFrom = Integer.parseInt(splitted[0]);
            Integer edgeTo = Integer.parseInt(splitted[1]);
            graph.addEgde(edgeFrom, edgeTo);
        }
        System.out.println("Enter source vertex :");
        int source = input.nextInt();
        graph.DFSRecursion(source);
        while (true) {
            int count = 0 ;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == true) {
                    count++;
                }
            }
            if (count == vertices) {
                break;
            }
            else {
                for (int i = 0; i < visited.length; i++) {
                    if (visited[i] == false) {
                        graph.DFSRecursion(i);
                    }
                } 
            }
        }
        
    }
}