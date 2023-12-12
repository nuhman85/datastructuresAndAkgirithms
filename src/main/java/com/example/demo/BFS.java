package com.example.demo;

public class BFS {
    public static void main(String[] args){
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);
        GraphNode n5 = new GraphNode(5);

        n1.neighbours = new GraphNode[] {n2, n3, n5};
        n2.neighbours = new GraphNode[] {n1, n4};
        n3.neighbours = new GraphNode[] {n1, n4, n5};
        n4.neighbours = new GraphNode[] {n2, n3, n5};
        n5.neighbours = new GraphNode[] {n1, n3, n4};

        breathFirstSearch(n1, 5);
    }

    private static void breathFirstSearch(GraphNode root , int x) {
        if(root.val == x)
            System.out.println("find in root");

        GraphQueue queue = new GraphQueue();
        root.visited = true;
        queue.enqueue(root);

        while(queue.first != null){
            GraphNode c = queue.dequeue();
            for(GraphNode n: c.neighbours) {
                if(!n.visited){
                    System.out.println(n+ " ");
                    n.visited = true;
                    if(n.val == x)
                        System.out.println("Find "+n);
                    queue.enqueue(n);
                }
            }
        }


    }
}
