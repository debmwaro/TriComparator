package com.deborah.tricomparator.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

import com.deborah.tricomparator.business.TriFusion;
import com.deborah.tricomparator.objets.Element;
import com.deborah.tricomparator.objets.ResultTri;

public class ElementUtils {
 
	public static Element[] createElement(int size) {
		
		 Element[] result = new Element[size] ;
		 
		 for(int i =0 ; i< size ; i++) {
			 Random random = new Random();
			 int key = Math.abs(random.nextInt());
			 String value ="deborah" + i;	 
			 Element element = new Element(key,value);
			 result[i] = element;
			 
		 }
		 return result ;
		
	}
	
	public static void afficher( Element[] result) {
		
		for(Element item : result) {
			
			System.out.println(item.toString());
		}
		 
	}
	
public static void create(ArrayList<ResultTri> list) {
		
		File fichier = new File("result.csv");
		
		try{
			fichier.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichier));
			bw.write("Taille   ; Fusion ; Bulle ; Denombrement");
			for(ResultTri resultTri : list) {
				bw.write(resultTri.toString());
				System.out.println(resultTri.toString());
				bw.newLine();
			}
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void echanger(Element [] list,int i,int j) {
		Element temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

}
