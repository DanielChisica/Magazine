/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.DoublyChainedNode;
import java.io.Serializable;

/**
 * The Magazine is based in a set of doubly chained nodes, this class contains
 * the required methods for its proper functioning 
 * @author Daniel Jiménez Chísica
 * @since 12 March 2017
 */
public class Magazine implements Serializable{
    
    /**
     * Returns the first node of the magazine
     * @return The main node
     */
    public DoublyChainedNode getNde() {
        return nde;
    }
    
    /**
     * Sets the main node of the magazine
     * @param nde The input node
     */
    public void setNde(DoublyChainedNode nde) {
        this.nde = nde;
    }
    private DoublyChainedNode nde;
    
    /**
     * Puts an article in the end of the list
     * @param article The input article
     */
    public void placeInTheEnd(Object article){
        DoublyChainedNode newnode= new DoublyChainedNode(article);
        if (nde==null) {
            nde=newnode;
        }
        else{
            DoublyChainedNode aux=nde;
            while (aux.getNext()!=null) {                
                aux=aux.getNext();
            }
            aux.setNext(newnode);
            newnode.setPrevious(aux);
        }
        
    }
    
    /**
     * Searches an article into the magazine
     * @param element The  to be searched
     * @return The node with its reference
     */
    public DoublyChainedNode search(Object element){
        DoublyChainedNode position=nde;
        while (position!=null && ! position.getObj().equals(element)) {            
            position=position.getNext();
        }
        return position;
    }
  
    /**
     * Defines if the magazine contains an article
     * @param element the article to be searched
     * @return True if the magazine contains it, false isn't
     */
    public boolean contains(Object element) {
       return search(element)!=null;
    }
    
  /**
   * Method used to create an iterator about the list
   * @return The iterator about the list
   */
  public java.util.Iterator iterator() { 
    return new MyIterator(); 
  }
	
  /*
   * Private class that implements the Iterator
   */
  private class MyIterator implements java.util.Iterator {
    private DoublyChainedNode position = nde;
    
    /**
     * Asks to the current position, if this have a next object
     * @return 
     */
    public boolean hasNext() { return position != null;}
        
      /**
       * Returns the next object of the iterator
       * @return The next object
       */  
      public Object next() {
      if (hasNext()) {
	Object o = position.getObj();
	position = position.getNext();
	return o;
      }
      return null;
    }
  
      
    /**
     * Shows a message indicating that isn't possible remove an object of the
     * iterator
     */  
    public void remove() {
      throw new IllegalStateException();
    }
  }
}



