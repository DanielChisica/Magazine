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
 *
 * @author EAN
 */
public class Magazine<T> implements Serializable{
      /**
     * crea un nodo inicio
     */
    public DoublyChainedNode first;
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
    
    public Magazine(){
        first = null;
        last = null;
    }

    public T getActual() {
        return  (T) present.getObj();
    }
    public void movetoPrevious(){
        if (present !=null){
            if(present.getPrevious() !=null){
                present=present.getPrevious();
            }
                    
        }
        
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
    public boolean IsEmpty() {
        return first == null;
    }
    /**
     * metodo para vaciar la lista
     */
  
    public void Empty() {
         last=last = null;
         present=null;
    }
    /**
     * metodo para agregar objectos en los nodos de la lista
     * @param elemento objecto a ingresar
     */
    public void add(Object element) {
      first=new DoublyChainedNode(first, element);
      present=first;
      if (first.getNext()==null){
          last=first;}
      else{
          first.getNext().setPrevious(first);
      }
      
           

    }
    /**
     * metodo para eliminar objectos de la lista
     * @param elemento objecto a eliminar
     */
    public void delete(Object element) {
        DoublyChainedNode pos = first;
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
        DoublyChainedNode pos = first;
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
    public void replace(Object currentelement, Object newelement) {
        DoublyChainedNode pos = first;
        while (pos != null && !pos.getObj().equals(newelement)) {
            pos = pos.getNext();
        }
        try {
            pos.setObj(newelement);   
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
        return (IsEmpty()) ? null : first.getObj();
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

          private DoublyChainedNode position = first;
    /**
     * metodo para ver si la siguiente posicion de la lista esta vacia o no
     * @return true si no esta vacia, false si lo esta
     */      
    public boolean hasNext() { return position != null;}
    /**
     * metodo para recorrer la lista
     * @return el elemento que se busca
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
       * metodo por si existe una exepcion
       */
        public void remove() {
        throw new IllegalStateException();
    }
  }

    
}
