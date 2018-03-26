package com.deborah.tricomparator.objets;

public class ResultTri {

	private int size;
	private double complexite;
	
	public ResultTri(int size) {
		super();
		this.size = size;
		
	}

	public double getComplexite() {
		return complexite;
	}

	public void setComplexite(double complexite) {
		this.complexite = complexite;
	}

	@Override
	public String toString() {
		return  size + ";" + complexite ;
	} 
	
	
}
