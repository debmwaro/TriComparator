package com.deborah.tricomparator.objets;

public class ResultTri {

	private int size;
	private int fusion;
	private int bulle;
	private int denom;
	
	public ResultTri(int size) {
		super();
		this.size = size;
		
	}

	public int getBulle() {
		return bulle;
	}

	public void setBulle(int bulle) {
		this.bulle = bulle;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public int getFusion() {
		return fusion;
	}

	public void setFusion(int fusion) {
		this.fusion = fusion;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String toString() {
		return  size + "  ;  " + fusion + " ; " + bulle + "  ;  " + denom ;
	} 
	
	
}
