import java.util.ArrayList;
import java.util.HashMap;

/** Spara teckensträngar med nycklar i grafdatastruktur.
 *
 */
public class Graphy {

    // hashmap för att förvara noderna
    private HashMap<String,Node> graph = new HashMap<>();

    private static class Node {
        private ArrayList<Node> edges;
        private String key, data;

        Node(String key, String data) {
            this.key = key;
            this.data = data;
            // arraylist för att förvara nodens relationer
            edges = new ArrayList<>();
        }

        // Lägg till relation till noden
        public void addEdge(Node n) {
            if (edges.contains(n)) {
                System.err.println("Key already exists!");
                return;
            }
            edges.add(n);
        }

    }

    // Skapa en ny nod med nyckel och värde
    public void createNode(String key, String data) {
        Node n = new Node(key, data);
        graph.put(key, n);
        //printGraph();
    }

    // Skapa en ny relation till en nod
    public void addEdge(String nodeKey, String edgeKey) {
        Node n = graph.get(nodeKey); // Noden som ska få en relation
        Node e = graph.get(edgeKey); // Relationen

        n.addEdge(e);
    }

    public void printGraph() {
        for (String key: graph.keySet()) {
            System.out.print("\n" + graph.get(key).data + " ==> ");
            for (Node n: graph.get(key).edges) {
                System.out.print(n.key + " ");
            }
        }
        System.out.println("");

    }



}
