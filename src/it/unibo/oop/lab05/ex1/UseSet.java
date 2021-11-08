package it.unibo.oop.lab05.ex1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	
    private UseSet() {
    	
    }

    /**
     * @param args
     *            ignored
     * @return 
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	final TreeSet<String> treeset = new TreeSet<>();
    	boolean check=true;
    	
    	
    	for (int i=0; i<=20; i++) {
    		treeset.add(Integer.toString(i));
    	}
    	
    	System.out.println(treeset.toString());
    	
    	Iterator<String> it= treeset.iterator();
    	
    	while(it.hasNext()) {
    		String s = it.next();
    		if(Integer.parseInt(s)%3==0) {
    			it.remove();
    		}
    	}
    	
    	for(String i: treeset) {
    		System.out.print(i+" ");
    	}
    	
    	
    	for(String i : treeset) {	
    		if(Integer.parseInt(i)%2!=0) {
    			check=false;
    		}
    	}
    	
    	System.out.println(check);
    	
    }
}
