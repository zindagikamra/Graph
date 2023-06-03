import java.util.ArrayList;
import java.util.Iterator;
public class AdjListGraph implements IGraph
{
	
	private int V;
	private int E;
	private Bag<Integer>[] edges;
	
	public AdjListGraph(int v)
	{
		edges = (Bag<Integer>[]) new Bag[v];
		V = v;
		
		for(int i = 0; i < v; i++)
		{
			edges[i] = new Bag<Integer>();
		}
	}
	
	public int V()
	{
		return V;
	}
	
	public int E()
	{
		return E;
	}
	
	public void addEdge(int v, int w)
	{
		E++;
		
		if(edges[v] == null)
		{
			edges[v] = new Bag<Integer>();
		}
		if(edges[w] == null)
		{
			edges[w] = new Bag<Integer>();
		}
		
		edges[v].add(w);
		edges[w].add(v);
	}
	
	public Iterable<Integer> adj(int v)
	{
		return edges[v];
	}

}