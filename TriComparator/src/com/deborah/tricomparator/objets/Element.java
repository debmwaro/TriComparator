package com.deborah.tricomparator.objets;

public class Element implements Comparable<Element>  {
 
	private int key;
	private String value;
	
	
	public Element(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return  key + ", " + value  ;
	}
	@Override
	public int compareTo(Element element) {
		
		if(this.key < element.key) {
			return -1;
		}
		if(this.key > element.key) {
			return 1;
		}
		
		return 0;
	}
	
	
}
