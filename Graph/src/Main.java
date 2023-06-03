public class Main
{
	public static void main(String[] args)
	{
		
		
		
		//******* ALL OF THIS FOR ADJMATGRAPH *******
		//Line
		AdjMatGraph line = new AdjMatGraph(10);
		
		line.addEdge(0, 1);
		line.addEdge(1, 2);
		line.addEdge(2, 3);
		line.addEdge(3, 4);
		line.addEdge(4, 5);
		line.addEdge(5, 6);
		line.addEdge(6, 7);
		line.addEdge(7, 8);
		line.addEdge(8, 9);
		com.touchgraph.graphlayout.TGPanel.drawGraph(line, 0.05);
		
		//Cycle
		AdjMatGraph cycle = new AdjMatGraph(10);
		cycle.addEdge(0, 1);
		cycle.addEdge(1, 2);
		cycle.addEdge(2, 3);
		cycle.addEdge(3, 4);
		cycle.addEdge(4, 5);
		cycle.addEdge(5, 6);
		cycle.addEdge(6, 7);
		cycle.addEdge(7, 8);
		cycle.addEdge(8, 9);
		cycle.addEdge(0, 9);
		com.touchgraph.graphlayout.TGPanel.drawGraph(cycle, 0.05);
		
		//All connected points
		AdjMatGraph complete = new AdjMatGraph(5);
		complete.addEdge(0,1);
		complete.addEdge(1,2);
		complete.addEdge(2,3);
		complete.addEdge(3,4);
		complete.addEdge(0,4);
		complete.addEdge(0,2);
		complete.addEdge(0,3);
		complete.addEdge(2,4);
		complete.addEdge(1,4);
		complete.addEdge(1,3);
		com.touchgraph.graphlayout.TGPanel.drawGraph(complete, 0.05);
		
		//Its supposed to be a cat
		AdjMatGraph mine = new AdjMatGraph(13);
		mine.addEdge(0, 1);
		mine.addEdge(1,2);
		mine.addEdge(1,3);
		mine.addEdge(2,3);
		mine.addEdge(3,4);
		mine.addEdge(3,5);
		mine.addEdge(4,5);
		mine.addEdge(4,6);
		mine.addEdge(6,7);
		mine.addEdge(6,12);
		mine.addEdge(12,11);
		mine.addEdge(7,9);
		mine.addEdge(11,9);
		mine.addEdge(7,8);
		mine.addEdge(8,9);
		mine.addEdge(11,10);
		mine.addEdge(10,9);
		
		com.touchgraph.graphlayout.TGPanel.drawGraph(mine, 0.05);
		
		
		
		
		
		
		
		// ******* ALL OF THIS FOR ADJLISTGRAPH *******
		//Line
		/*AdjListGraph line = new AdjListGraph(10);
		
		line.addEdge(0, 1);
		line.addEdge(1, 2);
		line.addEdge(2, 3);
		line.addEdge(3, 4);
		line.addEdge(4, 5);
		line.addEdge(5, 6);
		line.addEdge(6, 7);
		line.addEdge(7, 8);
		line.addEdge(8, 9);
		com.touchgraph.graphlayout.TGPanel.drawGraph(line, 0.05);
		
		//Cycle
		AdjListGraph cycle = new AdjListGraph(10);
		cycle.addEdge(0, 1);
		cycle.addEdge(1, 2);
		cycle.addEdge(2, 3);
		cycle.addEdge(3, 4);
		cycle.addEdge(4, 5);
		cycle.addEdge(5, 6);
		cycle.addEdge(6, 7);
		cycle.addEdge(7, 8);
		cycle.addEdge(8, 9);
		cycle.addEdge(0, 9);
		com.touchgraph.graphlayout.TGPanel.drawGraph(cycle, 0.05);
		
		//Complete
		AdjListGraph complete = new AdjListGraph(5);
		complete.addEdge(0,1);
		complete.addEdge(1,2);
		complete.addEdge(2,3);
		complete.addEdge(3,4);
		complete.addEdge(0,4);
		complete.addEdge(0,2);
		complete.addEdge(0,3);
		complete.addEdge(2,4);
		complete.addEdge(1,4);
		complete.addEdge(1,3);
		com.touchgraph.graphlayout.TGPanel.drawGraph(complete, 0.05);
		
		//Fancy star
		AdjListGraph mine = new AdjListGraph(15);
		mine.addEdge(0, 2);
		mine.addEdge(0,3);
		mine.addEdge(1,4);
		mine.addEdge(4,2);
		mine.addEdge(1,3);
		
		mine.addEdge(0,4);
		mine.addEdge(0,1);
		mine.addEdge(3,2);
		mine.addEdge(2,1);
		mine.addEdge(3,4);
		
		mine.addEdge(5,4);
		mine.addEdge(0,5);
		mine.addEdge(9,4);
		mine.addEdge(9,3);
		mine.addEdge(3,8);
		mine.addEdge(2,8);
		mine.addEdge(7,2);
		mine.addEdge(7,1);
		mine.addEdge(0,6);
		mine.addEdge(1,6);

		mine.addEdge(10,9);
		mine.addEdge(10,5);
		mine.addEdge(11,6);
		mine.addEdge(11,5);
		mine.addEdge(12,7);
		mine.addEdge(12,6);
		mine.addEdge(13,7);
		mine.addEdge(13,8);
		mine.addEdge(14,9);
		mine.addEdge(14,8);
		
		mine.addEdge(14,3);
		mine.addEdge(10,4);
		mine.addEdge(11,0);
		mine.addEdge(12,1);
		mine.addEdge(13,2);
	
		com.touchgraph.graphlayout.TGPanel.drawGraph(complete, 0.05);*/
	}
}