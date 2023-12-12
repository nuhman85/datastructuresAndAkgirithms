package com.example.demo;

public class GraphNode {
    int val;
    GraphNode next;
    GraphNode[] neighbours;

    boolean visited;

    GraphNode(int value){
        val = value;
    }

    GraphNode(int v, GraphNode[] neighbours){
        val = v;
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return " value: "+ this . val ;
    }
}
