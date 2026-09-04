package com.DataStructure.Graph.TraversalDFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GraphDFS {
    int v;

    GraphDFS( int v){
        this.v=v;
    }

    private void dfsRec( int srcNode , HashMap<Integer,ArrayList<Integer>> adjList, boolean[] visited , ArrayList<Integer> ans ){
        visited[srcNode]=true;
        ans.add(srcNode);

        for(int neighbour : adjList.get(srcNode)){
            if(!visited[neighbour]){
                dfsRec(neighbour,adjList,visited,ans);

            }

        }

    }


    ArrayList<Integer> dfsTraversal (HashMap<Integer, ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        dfsRec(0,adjList, visited, ans);
        return ans ;
    }
}

class DriverCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Nodes & Edges : ");
        int n = sc.nextInt();   // num of nodes
        int e = sc.nextInt();   // num of edges

        //Adjacency List
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {        // creating a empty array list for every node
            adjList.put(i, new ArrayList<>());
        }

        for (int i = 1; i < e; i++) {        // add edges
            System.out.println("Enter Edge" + i + " : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.get(a).add(b);
        }

        //Printing AdjLIst
        for (int i : adjList.keySet()) {
            System.out.println(i + "-> " + adjList.get(i).size());
        }
        //call dfsTraversal call
        GraphDFS graphDFS = new GraphDFS(n);
        ArrayList<Integer> ans = graphDFS.dfsTraversal(adjList);
        System.out.println("DFS traversal");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}