/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Article;
import Model.DoublyChainedNode;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Daniel Jiménez Chísica
 */
public class MagazineTest {
    
    public MagazineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of placeInTheEnd method, of class Magazine.
     */
    @Test
    public void testPlaceInTheEnd() {
        System.out.println("placeInTheEnd");
        Object article = new Article("asefa", "sdfasdfa", "asdfasdf");
        Magazine instance = new Magazine();
        instance.placeInTheEnd(article);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of search method, of class Magazine.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object element = null;
        Magazine instance = new Magazine();
        DoublyChainedNode expResult = null;
        DoublyChainedNode result = instance.search(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of contains method, of class Magazine.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        Magazine instance = new Magazine();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of iterator method, of class Magazine.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Magazine instance = new Magazine();
        instance.placeInTheEnd(new Article("sdf", "asdf", "asdf"));
        Iterator expResult = instance.iterator();
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
