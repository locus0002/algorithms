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
public class NodeHash {
    NodeHash next;
    Object value;
    Integer key;

    public NodeHash(NodeHash next, Object value, Integer key) {
        this.next = next;
        this.value = value;
        this.key = key;
    }
    
    public NodeHash() {
        this.next = null;
    }
    
    public Integer getKey(){
        return this.key;
    }
    
    public Object getValue(){
        return this.value;
    }
}
