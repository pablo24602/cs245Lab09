import java.util.*;
public class Graph {

    ArrayList <int []>reeet = new ArrayList<>();

    //number of vertices
    private int v;




    private ArrayList<Integer>[] adjList;

   /* public void printReeet()
    {
        for (int [] x: reeet)
        {
            for (int a: x)
            {
                System.out.print(a);
            }
            System.out.println();
        }


    }*/

    // Constructor
    public Graph(int vertices)
    {

        // vertices
        this.v = vertices;

        // adjacency!
        inAdjList();
    }
    public ArrayList<int[]> getAns()
    {
       // printReeet();
        return reeet;
    }

    // adjlist, for graph
    private void inAdjList()
    {
        adjList = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // Just add an edge
    public void addEdge(int u, int v)
    {
        // Add v to u's list.
        adjList[u].add(v);
    }

    // Prints all paths from bb to db
    public void printAllPaths(int bb, int db)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();

        // Add to the pathlist
        pathList.add(bb);

        // Recursive
        printAllPaths(bb, db, isVisited, pathList);
    }

    private void addreeet(int[] added)
    {
        reeet.add(added);
    }

    // A recursive helper function to print all paths from 'u' to 'd'.
    private void printAllPaths(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList)
    {
        if (u.equals(d)) {
            int [] go = new int[localPathList.size()];
            for (int x = 0; x<localPathList.size(); x++)
            {
                go[x]  = localPathList.get(x);
            }
            addreeet(go);
            // if match found then no need to traverse more till depth
            return;
        }

        // Mark the current node
        isVisited[u] = true;

        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add(i);
                printAllPaths(i, d, isVisited, localPathList);

                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u] = false;
    }



}