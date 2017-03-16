/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 * This class configurates a doubly chained node
 * @author Daniel Jiménez Chísica
 * @since 12 March 2017
 */
public class DoublyChainedNode implements Serializable{

    public DoublyChainedNode(DoublyChainedNode next, Object obj) {
        this.next = next;
        this.obj = obj;
    }

     /**
      * Returns the object of the node
      * @return Object of a doubly chained node
      */
    public Object getObj() {
        return obj;
    }
    
    /**
     * Sets the object of the node
     * @param obj The input object
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }
    
    /**
     * Returns the reference to the previous element
     * @return The previous node
     */
    public DoublyChainedNode getPrevious() {
        return previous;
    }
    
    /**
     * Sets the reference to the previous element
     * @param previous the previous node
     */
    public void setPrevious(DoublyChainedNode previous) {
        this.previous = previous;
    }
    
    /**
     * Returns the next element of a doubly chained node
     * @return The next element
     */
    public DoublyChainedNode getNext() {
        return next;
    }
    
    /**
     * Sets the next element of a doubly chained node
     * @param next The next node
     */
    public void setNext(DoublyChainedNode next) {
        this.next = next;
    }
    
    private Object obj;
    private DoublyChainedNode previous;
    private DoublyChainedNode next;
}
