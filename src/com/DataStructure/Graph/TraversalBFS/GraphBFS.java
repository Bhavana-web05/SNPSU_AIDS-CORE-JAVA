package com.DataStructure.Graph.TraversalBFS;

import java.util.*;

public class GraphBFS {
    int v;

    GraphBFS(int v) {

        this.v = v;
    }

    ArrayList<Integer> bfsTraversal(HashMap<Integer, ArrayList<Integer>> adjList) {
        boolean[] visited = new boolean[v];//visited array
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Object> ans = new ArrayList<>();
        LinkedList<Integer> q = null;
        q.offer(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            Object front = q.poll();
            ans.add(front);
            for (int neighbour : adjList.get(front)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }

            }
        }
        return null;
    }
}


class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Nodes and Edges: " );
        int n = sc.nextInt();//nodes
        int e=sc.nextInt();//edges

        //Adjacency List
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        //creating an empty arraylist for every node
        for(int i=0;i<n;i++){
            adjList.put(i,new ArrayList<>());
        }
        //ad edges
        for(int i=1;i<=e;i++){
            System.out.println("Enter Edge "+i+": ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);


        }
        //printing AdjList
        System.out.println("AdjList : ");
        for(int i:adjList.keySet()){
            System.out.print(i+"->"+adjList.get(i));
        }
        GraphBFS BFS = new GraphBFS(n);
        ArrayList<Integer> bfsTraversal = BFS.bfsTraversal(adjList);
        System.out.println("BFS Traversal : ");
        int[] ans = new int[0];
        for(int i:bfsTraversal){
            System.out.print(i+" ");
        }
    }
}
