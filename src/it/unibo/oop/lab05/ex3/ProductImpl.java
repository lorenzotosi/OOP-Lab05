package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product{

	private final String name;
	private double numProduct;
	
	public ProductImpl(String name, double numProduct) {
		this.name=name;
		this.numProduct=numProduct;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
		
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return this.numProduct;
	}

	public void increment() {
		this.numProduct++;
	}

	@Override
	public String toString() {
		return "name=" + name + " NumProduct=" + numProduct;
	}
	
	
	
}
