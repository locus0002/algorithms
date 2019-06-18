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
public class StackLinkedList<T> {
    NodeLL top;
    
    public StackLinkedList(){
        this.top = null;
    }
    
    public void push(Object value){
        NodeLL newElement = new NodeLL(value, null);
        if(this.top == null){
            this.top = newElement;
        }else{
            newElement.pointer = this.top;
            this.top = newElement;
        }
    }
    
    public T pop(){
        if(this.top == null){
            System.out.println("Stop, the stack is empty");
            return null;
        }
        NodeLL lastElement = this.top;
        this.top = lastElement.pointer;
        return (T) lastElement.value;
    }
}
