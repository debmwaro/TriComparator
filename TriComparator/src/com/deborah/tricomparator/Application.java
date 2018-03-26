package com.deborah.tricomparator;

import java.util.ArrayList;

import com.deborah.tricomparator.business.TriFusion;
import com.deborah.tricomparator.objets.Element;
import com.deborah.tricomparator.objets.ResultTri;
import com.deborah.tricomparator.utils.ElementUtils;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<ResultTri> resultTris = new ArrayList<ResultTri>();
		TriFusion fusion = new TriFusion();
		for(int i =10; i<100 ; i++) {
			Element [] elements = ElementUtils.createElement(i);
			ResultTri resultTri = fusion.trier(elements);
			resultTris.add(resultTri);
			
			
		}
		ElementUtils.create(resultTris);
		

	}

}
