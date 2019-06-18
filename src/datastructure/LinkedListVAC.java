/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Vladimir Aca
 */
public class LinkedListVAC<T> {
    NodeLL head;

    public LinkedListVAC() {
        this.head = null;
    }
    
    public void add(Object value){
        NodeLL newNode = new NodeLL(value, null);
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.pointer = this.head;
            this.head = newNode;
        }
    }
    
    public void delete(){
        this.head = this.head.pointer;
    }
    
    public void display(){
        NodeLL currentNode = this.head;
        System.out.println("Element: " +  (T)currentNode.value);
        while(currentNode.pointer != null){
            currentNode = currentNode.pointer;
            System.out.println("Element: " +  (T)currentNode.value);
        }
    }
}
