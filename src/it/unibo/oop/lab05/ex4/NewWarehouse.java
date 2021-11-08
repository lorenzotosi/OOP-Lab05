package it.unibo.oop.lab05.ex4;

import java.util.LinkedHashSet;
import java.util.Set;

import it.unibo.oop.lab05.ex3.*;

public class NewWarehouse extends WarehouseImpl{
	
	public Set<Product> allProducts(){
		return new LinkedHashSet<>(super.allProducts());
	}
	
}
