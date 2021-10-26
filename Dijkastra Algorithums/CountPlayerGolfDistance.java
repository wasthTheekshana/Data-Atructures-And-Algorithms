import java.util.Arrays;

/**
 *
 * @author wasat
 */
public class CountPlayerGolfDistance {

    static class EdgeGraph {

        int vertices;
        int matrix[][];

        public EdgeGraph(int vertex) {
            this.vertices = vertex;
            matrix = new int[vertex][vertex];
        }

        public void addEdge(int source, int destination, int weight) {
            matrix[source][destination] = weight;

            matrix[destination][source] = weight;
        }

        int getMinimumVertex(boolean[] mst, int[] key) {
            int minKey = Integer.MAX_VALUE;

            int ve = -1;

            for (int i = 0; i < vertices; i++) {
                if (mst[i] == false && minKey > key[i]) {
                    minKey = key[i];
                    ve = i;
                }
            }
            return ve;
        }

        public void dijkstra_Distan(int sourceVertex) {
            boolean[] spt = new boolean[vertices];
            int[] distance = new int[vertices];
            int INFINITY = Integer.MAX_VALUE;

            for (int i = 0; i < vertices; i++) {
                distance[i] = INFINITY;
            }
            distance[sourceVertex] = 0;
            for (int i = 0; i < vertices; i++) {
                int vertex_U = getMinimumVertex(spt, distance);
                spt[vertex_U] = true;
                for (int vertex_V = 0; vertex_V < vertices; vertex_V++) {
                    if (matrix[vertex_U][vertex_V] > 0) {
                        if (spt[vertex_V] == false && matrix[vertex_U][vertex_V] != INFINITY) {

                            int newKey = matrix[vertex_U][vertex_V] + distance[vertex_U];
                            if (newKey < distance[vertex_V]) {
                                distance[vertex_V] = newKey;
                            }
                        }
                    }
                }
            }

            print(sourceVertex, distance);
        }

        public void print(int sourceVertex, int[] key) {
            System.out.println("Dijkstra Algorithm: (Adjacency Matrix)");
            for (int i = 0; i < vertices; i++) {
                System.out.println("Player POstion : " + sourceVertex + " Mark Position " + +i
                        + " distance: " + key[i]);
            }

        }
    }

    public static void main(String[] args) {
        int totPosition = 7;
        EdgeGraph graph = new EdgeGraph(totPosition);
        int sourceVertex = 0;  // player postion
        graph.addEdge(0, 1, 287);
        graph.addEdge(0, 2, 156);
        graph.addEdge(0, 3, 164);
        graph.addEdge(0, 4, 232);
        graph.addEdge(2, 1, 174);
        graph.addEdge(2, 5, 151);
        graph.addEdge(4, 2, 189);
        graph.addEdge(3, 4, 98);
        graph.addEdge(4, 6, 290);
        graph.addEdge(5, 6, 104);
        graph.addEdge(1, 5, 117);
        graph.addEdge(1, 6, 185);
        graph.dijkstra_Distan(sourceVertex);

        // 6 mean B position 
    }
}
