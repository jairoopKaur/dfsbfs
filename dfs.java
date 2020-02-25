
import java.io.*; 
import java.util.*; 


class dfs 
{ 
	private int V; 
	
	private LinkedList<Integer> adj[]; 

	
	dfs(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	
	void addEdge(int v, int w) 
	{ 
		adj[v].add(w); 
	} 

	
	void DFSvisit(int v,boolean visited[]) 
	{ 
		
		visited[v] = true; 
		System.out.print(v+" "); 

		
		Iterator<Integer> i = adj[v].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				DFSvisit(n,visited); 
		} 
	} 

	
	void DFS(int v) 
	{ 
		
		boolean visited[] = new boolean[V]; 

		
				DFSvisit(v, visited); 
	} 

	public static void main(String args[]) 
	{ 
		dfs g = new dfs(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Depth First Traversal"); 

		g.DFS(0); 
	} 
} 
 

