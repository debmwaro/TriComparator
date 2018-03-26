package com.deborah.tricomparator.business;

import com.deborah.tricomparator.objets.Element;
import com.deborah.tricomparator.objets.ResultTri;

public class TriFusion {

	public ResultTri trier(Element [] elements) {
		
		ResultTri resultTri = new ResultTri(elements.length);
		double complexite = elements.length * Math.log(elements.length);
		resultTri.setComplexite(complexite);
		
		return resultTri;
	}
}
