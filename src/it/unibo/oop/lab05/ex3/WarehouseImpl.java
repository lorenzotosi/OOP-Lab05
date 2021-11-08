package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse{

	private Set<Product> s1 = new LinkedHashSet<>();

	public void addProduct(Product p) {
			s1.add(p);
	}

	public Set<String> allNames() {
		final Set<String> s2 = new LinkedHashSet<>();
		for (Product i : s1) {
			s2.add(i.getName());
		}
		return s2;
	}

	public Set<Product> allProducts() {
		Set<Product> s2 = new LinkedHashSet<>();
		for (Product i : s1) {
			s2.add(i);
		}
		return s2;
	}

	public boolean containsProduct(Product p) {
		if(s1.toString().contains(p.getName())!=false) {
			return false;
		}
		return true;
	}

	public double getQuantity(String name) {			
		for (Product p : s1) {
			if(p.getName()==name) {
				return p.getQuantity();
			}
		}
		return -1;
	}	
}
