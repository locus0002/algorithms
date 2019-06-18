/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Stack;

/**
 *
 * @author Vladimir Aca
 */
public class DepthFirstSearch {
    DFSGraph[] graph;
    int size;

    public DepthFirstSearch(int size) {
        this.size = size;
        this.graph = new DFSGraph[size];
        for(int k=0; k<size; k++){
            this.graph[k] = new DFSGraph();
            this.graph[k].head = null;
        }
    }
    
    public void add(int origin, int destiny){
        DFSNode newNode = new DFSNode(destiny, null);
        newNode.next = this.graph[origin].head;
        this.graph[origin].head = newNode;
        
    }
    
    public void explore(int start){
        if(this.graph[start].head == null){
            System.out.println("There is not a start point");
            return;
        }
        Boolean[] visitedNodes = new Boolean[this.size];
        for(int k=0; k< this.size; k++){
            visitedNodes[k] = false;
        }
        Stack<DFSNode> nodeStack = new Stack<>();
        nodeStack.push(this.graph[start].head);
        while(!nodeStack.isEmpty()){
            DFSNode point = nodeStack.pop();
            nodeStack.push(point);
            System.out.println(point.value);
            if(this.graph[point.value].head != null){
                point = this.graph[point.value].head;
                while(visitedNodes[point.value]){
                    point = point.next;
                    if(point == null){ break; }
                }
                if(point != null && !visitedNodes[point.value]){
                    nodeStack.push(point);
                }else{
                    point = nodeStack.pop();
                    visitedNodes[point.value] = true;
                    if(point.next != null){ nodeStack.push(point.next); }
                }
            }else{
                visitedNodes[point.value] = true;
                nodeStack.pop();
            }
        }
        
        
    }
    
}
