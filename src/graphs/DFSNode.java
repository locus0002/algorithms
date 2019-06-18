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
public class DFSNode {
    Integer value;
    DFSNode next;

    public DFSNode(Integer value, DFSNode next) {
        this.value = value;
        this.next = next;
    }
    
}
