import java.util.*;
public class Graph
{
    private int V;
    private LinkedList<Integer>adjListArray[];
    
        
        Graph(int V){
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i=0;i<V;i++)
                adjListArray[i] = new LinkedList<>();
        }
    
    public  void addEdge(int src,int dest){
        adjListArray[src].add(dest);
        
        
    }
    public  void printGraph(){
        for(int i=0;i<V;i++){
            System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer pCrawl: adjListArray[i]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        }
    }
     public static void main(String args[]) 
    { 
        // create the graph given in above figure 
        int V = 5; 
        Graph g = new Graph(V); 
        g.addEdge( 0, 1); 
        g.addEdge( 0, 4); 
        g.addEdge( 1, 2); 
        g.addEdge( 1, 3); 
        g.addEdge( 1, 4); 
        g.addEdge( 2, 3); 
        g.addEdge( 3, 4); 
       g.BFS(0);
        // print the adjacency list representation of  
        // the above graph 
        g.printGraph(); 
    } 
    public void BFS(int source){
        boolean[] visited = new boolean[V];
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(source);
        
       
        while(!qu.isEmpty())
        {
           source= qu.remove();
           System.out.println(source);
           Iterator<Integer> i = adjListArray[source].listIterator();
           while(i.hasNext())
           {
               int ele = i.next();
           if(!visited[ele]){
               qu.add(ele);
               
               visited[ele] = true;
           } 
           }
        }
    }
    
    
}
