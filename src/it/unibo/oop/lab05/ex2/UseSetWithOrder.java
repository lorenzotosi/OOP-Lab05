package it.unibo.oop.lab05.ex2;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	
    	Collection<String> tree = new TreeSet<>(new MyComparator());
    	
    	for (int i=0; i<100; i++) {
    		int random = (int)(Math.random()*100);
    		tree.add(String.valueOf(random));
    	}
    	
    	TreeSet<Integer> t = new TreeSet<>();
    	
    	TreeSet<Integer> t1 = (TreeSet<Integer>)t.descendingSet();
    	
    	for (int i=0; i<100; i++) {
    		int random = (int)(Math.random()*100);
    		t.add(Integer.valueOf(random));
    	}
    	
    	System.out.println(tree.toString());
    	System.out.println(t1.toString());
    	
    }
}
