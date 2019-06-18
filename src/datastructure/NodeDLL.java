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
public class NodeDLL {
    Object value;
    NodeDLL next;
    NodeDLL prev;

    public NodeDLL(Object value, NodeDLL next, NodeDLL prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
