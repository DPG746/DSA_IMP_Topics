import java.util.*;
import java.lang.*;
import java.io.*;


class GraphA{
    private boolean undirected;
    
    private ArrayList<ArrayList<Integer>> adj;
    
    public GraphA(int n,boolean undirected){
        this.undirected=undirected;
        this.adj=new ArrayList<>();
        
    
    for(int i=0;i<n;i++){
        ArrayList<Integer> list= new ArrayList<>();
        adj.add(list);
        
    }
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
        if(undirected){
            adj.get(v).add(u);
            
        }
        
    }
    
    public void display(){
        for(ArrayList<Integer> list: adj){
            System.out.println(list.toString());
            
        }
    }
    
    
    
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		GraphA graph = new GraphA(5,true);
		graph.addEdge(0,1);
		graph.addEdge(0,3);
		graph.addEdge(1,2);
		graph.addEdge(2,3);
		graph.addEdge(3,4);
		
		graph.display();

	}
}
