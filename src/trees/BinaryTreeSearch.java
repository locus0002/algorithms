/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vladimir Aca
 */
public class BinaryTreeSearch {
    BinaryNode root;

    public BinaryTreeSearch() {
        this.root = null;
    }
    
    public void addNode(BinaryNode newNode, BinaryNode currentNode){
        
        if(this.root == null){
            this.root = newNode;
            return;
        }
        if(currentNode.value > newNode.value){
            if(currentNode.left == null){
                currentNode.left = newNode;
            }else{
                this.addNode(newNode, currentNode.left);
            }
        }
        if(currentNode.value < newNode.value){
            if(currentNode.right == null){
                currentNode.right = newNode;
            }else{
                this.addNode(newNode, currentNode.right);
            }
        }
        
    }
    
    public void getNodesByLevel(BinaryNode currentNode){
        
        if(this.root == null){
            return;
        }
        
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(currentNode);
        
        while(!queue.isEmpty()){
            
            BinaryNode parentNode = queue.poll();
            System.out.print(parentNode.value + "\t");
            if(parentNode.left != null){ queue.add(parentNode.left); }
            if(parentNode.right != null){ queue.add(parentNode.right); }
        }
    }
    
    public int getHeigh(BinaryNode currentNode){
        if(this.root == null){
            return 0;
        }
        int leftHeigh = 0;
        int rightHeigh = 0;
        if(currentNode.left != null){
            leftHeigh = getHeigh(currentNode.left);
        }
        if(currentNode.right != null){
            rightHeigh = getHeigh(currentNode.right);
        }
        
        return Math.max(leftHeigh, rightHeigh) + 1;
    }
    
    public BinaryNode createNode(int value){
        return new BinaryNode(value);
    }
    
    public BinaryNode getRoot(){
        return this.root;
    }
    
    public void search(int targetValue, BinaryNode currentNode ){
        if(currentNode.value == targetValue){
            System.out.println("The node EXIST");
            return;
        }
        if(currentNode.value > targetValue){
            if(currentNode.left != null){
                this.search(targetValue, currentNode.left);
            }else{System.out.println("NO DATA");}
            return;
        }
        if(currentNode.value < targetValue){
            if(currentNode.right != null){
                this.search(targetValue, currentNode.right);
            }else{System.out.println("NO DATA");}
        }
    }
    
}
