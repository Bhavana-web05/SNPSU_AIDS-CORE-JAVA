package com.DataStructure.Graph.AdjList;
import java.util.ArrayList;
import java.util.HashMap;
public class Graph {
    HashMap<Integer,ArrayList<Integer>>adjList;
    Graph(int vertices){//constructor
        adjList = new HashMap<>();
        for(int i=0;i<vertices;i++){
            adjList.put(i,new ArrayList<>());

        }
    }
    void addEdge(int u ,int v){
        //add v to u's List
        adjList.get(u).add(v);
        //add u to v's List
        adjList.get(v).add(u);

    }
    void printaAdjList(){
        for(int vertex :adjList.keySet()){
            System.out.print(vertex+"->");
            for(int neighbour :adjList.get(vertex)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }
}
class DriverCode{
    public static void main(String[] args){
        Graph g = new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,5);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);
        
        g.printaAdjList();

    }
}
