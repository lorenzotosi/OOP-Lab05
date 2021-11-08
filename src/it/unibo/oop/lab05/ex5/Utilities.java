package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set <X> s1 = new HashSet<X>();
    	s1.addAll(setA);
    	s1.addAll(setB);
        return s1;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set <X> s1 = new HashSet<X>();
    	
    	for (X i : setA) {
    		for (X h: setB) 
    			if(h==i) {
    				s1.add(h);
    			}
    		}
        return s1;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> s1 = new HashSet<X>();
    	
    	for (X i : setA) {
    		if(!(setB.contains(i))) {
    			s1.add(i);
    		}
    	}
    	
    	for (X i : setB) {
    		if(!(setA.contains(i))) {
    			s1.add(i);
    		}
    	}
        return s1;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	
    	int num = (int) (Math.random() * coll.size());
        for(X t: coll) {
        	if (--num < 0) {
        		return t;
        		
        	}
    	
        }
		return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
    	//X primo=getRandomElement(first);
    	//Y secondo=getRandomElement(second);
        return new Pair<X,Y>(getRandomElement(first), getRandomElement(second));
        //return new Pair<X,Y>(primo, secondo);
    }
}
