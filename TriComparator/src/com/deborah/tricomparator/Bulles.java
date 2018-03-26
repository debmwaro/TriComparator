package com.deborah.tricomparator;

public class Bulles {
	
private static final Bulles Instance = new Bulles();
	
	public static  Bulles getInstance() {
		return Instance;
	}
	
	public static void tri_bulles(int[] list){

	    boolean ordre = false;
	    int taille = list.length;

	    while(!ordre){
	        ordre = true;
	        for(int i=0 ;i<taille-1;i++){
	            if(list[i] > list[i+1]){
	                echanger(list,i,i+1);
	                ordre = false;
	            }
	        }
	        taille--;
	    }

	}
	
	public static void echanger(int[] list,int i,int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
		
}




