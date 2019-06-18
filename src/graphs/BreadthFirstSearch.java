/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vladimir Aca
 */
public class BreadthFirstSearch {
    int size;
    BFSGraph[] graph;

    public BreadthFirstSearch(int size) {
        this.size = size;
        this.graph = new BFSGraph[size];
        for(int k=0; k< size; k++){
            this.graph[k] = new BFSGraph();
        }
    }
    
    public void addNode(int origin, int destiny){
        BFSNode newNode = new BFSNode(destiny);
        newNode.next = this.graph[origin].head;
        this.graph[origin].head = newNode;
    }
    
    public void breadthExplore(int start){
        Queue<Integer> nodeIndexs = new LinkedList<>();
        nodeIndexs.add(start);
        while(!nodeIndexs.isEmpty()){
            int nodeIndex = nodeIndexs.poll();
            System.out.print(nodeIndex + "\t");
            BFSNode currentNode = this.graph[nodeIndex].head;
            while(currentNode != null){
                nodeIndexs.add(currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }
    
}
