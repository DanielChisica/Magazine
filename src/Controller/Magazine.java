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
 * This class configurates the logic of the magazine, being this a doubly
 * chained list
 *
 * @author Daniel Jiménez Chísica
 * @since 16 March 2017
 */
public class Magazine<T> implements Serializable {

    public DoublyChainedNode first;
    public DoublyChainedNode last;
    public DoublyChainedNode present;

    /**
     * This constructor configurates the first and the last element as null
     */
    public Magazine() {
        first = null;
        last = null;
    }

    /**
     * Returns the actual element
     *
     * @return The object of the actual element
     */
    public T getActual() {
        return (T) present.getObj();
    }

    /**
     * Moves the actual node to the previous element
     */
    public void movetoPrevious() {
        if (present != null) {
            if (present.getPrevious() != null) {
                present = present.getPrevious();
            } else {
                present = last;
            }
        }
    }

    /**
     * Moves the actual node to the next element
     */
    public void movetoNext() {
        if (present != null) {
            if (present.getNext() != null) {
                present = present.getNext();
            } else {
                present = first;
            }
        }
    }

    /**
     * Asks if the magazine is empty
     *
     * @return A boolean true if the magazine is null false isn´t
     */
    public boolean IsEmpty() {
        return first == null;
    }

    /**
     * Empty the magazine
     */
    public void Empty() {
        last = last = null;
        present = null;
    }

    /**
     * Adds an article to the magazine
     *
     * @param element The article to be added
     */
    public void add(Object element) {
        first = new DoublyChainedNode(first, element);
        present = first;
        if (first.getNext() == null) {
            last = first;
        } else {
            first.getNext().setPrevious(first);
        }
    }

    /**
     * Deletes an article of the magazine
     *
     * @param element The article to be deleted
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
     * Searches an article in the magazine
     *
     * @param element The element to be searched
     * @return The element searched
     */
    public DoublyChainedNode search(Object element) {
        DoublyChainedNode pos = first;
        while (pos != null && !pos.getObj().equals(element)) {
            pos = pos.getNext();
        }
        return pos;
    }

    /**
     * Replaces an an article in the magazine for other
     *
     * @param currentelement The actual article
     * @param newelement The new article
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
     * Asks to the magazine if this contains an article
     *
     * @param element The input article
     * @return Boolean true if have it, false isn´t
     */
    public boolean contains(Object element) {
        if (search(element) != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the first element in the magazine
     *
     * @return An article
     */
    public Object firstArticle() {
        return (IsEmpty()) ? null : first.getObj();
    }

    /**
     * Makes an iterator about the list
     *
     * @return The iterator about the list
     */
    public Iterator iterator() {
        return new myIterator();
    }

    /**
     * The class iterator contains the logic of an iterator
     */
    private class myIterator implements Iterator {

        private DoublyChainedNode position = first;

        /**
         * Asks to the iterator if has an next element
         *
         * @return A boolean true if have it, false haven´t it
         */
        public boolean hasNext() {
            return position != null;
        }

        /**
         * The next element of the iterator
         *
         * @return
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
         * Not implemented yet
         */
        public void remove() {
            throw new IllegalStateException();
        }
    }

}
