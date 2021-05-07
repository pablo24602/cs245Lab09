import java.util.*;

public class AllPaths {


    public static int[][]  print(int[][] j)
    {
        Graph g = new Graph(j.length);
        for (int x = 0; x<j.length; x++)
        {
            for (int y= 0; y< j[x].length; y++)
            {
                g.addEdge(x,j[x][y]);
            }
        }
        g.printAllPaths(0,4);
       ArrayList< int[]> a =  g.getAns();
       int[][] go = new int[a.size()][];
       for (int x = 0; x<a.size(); x++)
       {
           go[x] = a.get(x);
       }
       return go;
    }


    public static String toString(int[][] a)
    {
        String toRet ="{";

        for (int b= 0; b<a.length; b++)
        {
            int[] x = a[b];
            toRet = toRet + "{";
            for (int y = 0; y< x.length; y++)
            {
                if (y<x.length-1)
                {
                    toRet = toRet + y + ", ";
                }
                else if ((b == a.length -1 ) && (y == x.length-1))
                {
                    toRet = toRet + y + "}";
                }
                else
                    toRet = toRet + y + "}, ";
            }

        }
        toRet = toRet + "}";
        return toRet;
    }


    public static void main(String[] args) {


         int [][] j = { {4,3,1}, {3,2,4}, {3}, {4}, {}};

         int[][] ans = print(j);
         System.out.println(toString(ans));



    }
}
