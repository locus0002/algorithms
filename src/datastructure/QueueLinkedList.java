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
public class QueueLinkedList<T> {
    NodeDLL head;
    NodeDLL tail;
    
    public QueueLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void push(Object value){
        NodeDLL newElement = new NodeDLL(value, null, null);
        if(this.head == null){
            this.head = newElement;
            this.tail = newElement;
        }else{
            newElement.next = this.head;
            this.head.prev = newElement;
            this.head = newElement;
        }
    }
    
    public T pop(){
        if(this.tail == null){
            System.out.println("The queue is empty");
            return null;
        }
        NodeDLL firstElement = this.tail;
        this.tail = firstElement.prev;
        return (T) firstElement.value;
    }
}
