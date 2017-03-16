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
    
    /**
     * This constructor initializes a doubly chained node with its object, its
     * previous node and its next node
     * @param obj The object of the node
     * @param previous The reference to the previous element
     * @param next The reference to the next element
     */
    public DoublyChainedNode(Object obj, DoublyChainedNode previous, DoublyChainedNode next) {
        this.obj = obj;
        this.previous = previous;
        this.next = next;
    }
    
    /**
     * This constructor initializes a node just with its element
     * @param value The element of the node
     */
    public DoublyChainedNode(Object value) {
        obj=value;
        previous=null;
        next=null;
    }
    
    /**
     * Makes the first node in a list of doubly chained nodes
     * @param value The element of the node
     * @param n The reference to the next element
     */
     public DoublyChainedNode(Object value, DoublyChainedNode n){
        obj=value;
        previous=null;
        next=n;
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
