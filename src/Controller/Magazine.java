/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.DoublyChainedNode;
import java.io.Serializable;
import java.util.Iterator;

/**
 * The Magazine is based in a set of doubly chained nodes, this class contains
 * the required methods for its proper functioning 
 * @author Daniel Jiménez Chísica
 * @since 12 March 2017
 */
public class Magazine<T> implements Serializable {
    /**
     * crea un nodo inicio
     */
    public DoublyChainedNode start;
    /**
     * crea un nodo fin
     */
    public DoublyChainedNode last;
    /**
     * 
     */
    public DoublyChainedNode present;
    
    /**
     * metodo para hacer que la lista inicie vacia
     */
    public Magazine() {
        start=null;
        last=null;
    }
    public T getCurrent(){
        return  (T) present.getObj();
    }
    public void movetoPrevious(){
        if (present !=null){
            if(present.getPrevious() !=null){
                present=present.getPrevious();
            }
                    
        }
}
    
    public boolean hasNext(){
        return present.getNext()!=null;
    }
    
    public boolean hasPrevious(){
        return present.getPrevious()!=null;
    }
    
    public void movetoNext(){
        if (present !=null){
            if(present.getNext()!=null){
                present=present.getNext();
            }
        }
}
    /**
     * metodo para ver si esta vacia la lista
     * @return true si la lista esta vacia, false si no
     */
    
    public boolean isEmpty() {
        return  start == null;
    }
    /**
     * metodo para vaciar la lista
     */
  
    public void Empty() {
         last=start = null;
         present=null;
    }
    /**
     * metodo para agregar objectos en los nodos de la lista
     * @param elemento objecto a ingresar
     */
    public void add(Object element) {
      start=new DoublyChainedNode(element,start);
      present=start;
      if (start.getNext()==null){
          last=start;}
      else{
         start.getNext().setPrevious(start);
      }
      
           

    }
    /**
     * metodo para eliminar objectos de la lista
     * @param elemento objecto a eliminar
     */
    public void delete(Object element) {
        DoublyChainedNode pos = start;
        while (pos != null && !pos.getObj().equals(element)) {
            pos = pos.getNext();
        }
        try {
            pos = null;   
        } catch (Exception e) {
        }
    }
    /**
     * metodo para buscar nodos en la lista
     * @param elemento objecto del nodo que se busca
     * @return la posicion del nodo
     */
    public DoublyChainedNode search(Object element) {
        DoublyChainedNode pos = start;
        while (pos != null && !pos.getObj().equals(element)) {
            pos = pos.getNext();
        }
        return pos;
    }
    /**
     * metodo para sustituir objectos en la lista
     * @param elementoactual objecto que se va a cambiar
     * @param elementonuevo objecto que se va a introducir
     */
    
    public void sustituir(Object currentElement, Object newElement) {
        DoublyChainedNode pos = start;
        while (pos != null && !pos.getObj().equals(currentElement)) {
            pos = pos.getNext();
        }
        try {
            pos.setObj(newElement);   
        } catch (Exception e) {
        }
    }
    /**
     * metodo para ver si la lista contiene un elemento
     * @param elemento objecto a verificar si esta o no
     * @return true si el elemento esta, false si no
     */
    public boolean contains(Object element) {
        if (search(element) != null){
            return true;
        } else {
            return false;
        }
    }
    /**
     * metodo para determinar el primer elemento
     * @return el objecto del nodo
     */

    public Object primerElemento() {
        return (isEmpty()) ? null : start.getObj();
    }
    /**
     * metodo para crear un iterador
     * @return una lista recorrida
     */
    public Iterator iterator() {
        return new myIterator();
    }

    /**
     * Implementacion del iterador *
     */
    private class myIterator implements Iterator {

          private DoublyChainedNode posicion = start;
    /**
     * metodo para ver si la siguiente posicion de la lista esta vacia o no
     * @return true si no esta vacia, false si lo esta
     */      
    public boolean hasNext() { return posicion != null;}
    /**
     * metodo para recorrer la lista
     * @return el elemento que se busca
     */
      public Object next() {
      if (hasNext()) {
	Object o = posicion.getObj();
	posicion = posicion.getNext();
	return o;
      }
        return null;
    }
      /**
       * metodo por si existe una exepcion
       */
        public void remove() {
        throw new IllegalStateException();
    }
  }

    
}