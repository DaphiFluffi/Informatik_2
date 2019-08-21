import java.util.LinkedList;
import java.util.List;

public class DirectedGraph {
	private List< Integer >[] edges ;

	//KONSTRUKTOR
	// n: number of vertices
	public DirectedGraph ( int n) {
	// the following line does not work !
		// this . edges = new ArrayList < Integer >[n];
		this . edges = new List [n];
		for (int i = 0; i < n; i++) {
			this . edges [i] = new LinkedList<>();
		}
	}

	public void addEdge ( int source , int target ) {
		this . edges [ source ]. add( target );
	}

	 public int getNumVertices () {
		 return this . edges . length ;
	}

	public int getNumEdges(){
		int sum = 0;
		for (int i = 0; i < edges.length; i++){
			sum = sum + edges[i].size();
		}
		return sum;
	}

	public void addVertex(){ //introduces new Vertex to a Graph
		List< Integer >[] newEdges = new List[edges.length +1];
		for(int i = 0; i < newEdges.length; i++){
			newEdges[i] = new LinkedList<>();
		}
		System.arraycopy(edges, 0, newEdges, 0, edges.length);
		edges = newEdges;
	}

	public static void main(String[] args) {
		DirectedGraph test = new DirectedGraph(5);
		test.addEdge(0,1);
		test.addEdge(0,3);
		test.addEdge(1,4);
		test.addEdge(1,2);
		test.addEdge(3,4);
		test.addEdge(4,2);
		test.addEdge(4,3);
		//alles funktioniert jei
		System.out.println("Edges: " + test.getNumEdges()); //7
		System.out.println("Vertices: " + test.getNumVertices()); //5
		test.addVertex();
		System.out.println("Vertices2: " + test.getNumVertices()); //?


	}
}
