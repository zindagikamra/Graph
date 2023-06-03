import java.util.ArrayList;

public class AdjMatGraph implements IGraph
{
	int vertices;
	int[][] edgesArray;
	int edges = 0;
	
	public AdjMatGraph(int v)
	{
		vertices = v;
		edgesArray = new int[v][v];
	}
	
	public int V()
	{
		return vertices;
	}
	
	public int E()
	{
		return edges;
	}
	
	public void addEdge(int v, int w)
	{
		edges++;
		
		edgesArray[v][w] = 1;
		edgesArray[w][v] = 1;
	}
	
	public Iterable<Integer> adj(int v)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < edgesArray[v].length; i++)
		{
			if(edgesArray[v][i] == 1)
			{
				list.add(i);
			}
		}
		
		return list;
	}

}