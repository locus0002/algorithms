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
public class LinkedListDVAC<T> {
    NodeDLL head;

    public LinkedListDVAC() {
        this.head = null;
    }
    
    public void add(Object value){
        NodeDLL newNode = new NodeDLL(value, null, null);
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }
    
    public void delete(){
        this.head = this.head.next;
        this.head.prev = null;
    }
    
    public void display(){
        NodeDLL currentNode = this.head;
        while(currentNode != null){
            System.out.println("Value: " + (T)currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
