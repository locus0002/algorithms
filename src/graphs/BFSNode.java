/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Vladimir Aca
 */
public class BFSNode {
    Integer value;
    BFSNode next;
    
    public BFSNode(Integer newValue){
        this.next = null;
        this.value = newValue;
    }
}
