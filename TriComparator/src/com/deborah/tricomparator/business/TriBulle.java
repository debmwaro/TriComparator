package com.deborah.tricomparator.business;

import com.deborah.tricomparator.objets.Element;
import com.deborah.tricomparator.objets.ResultTri;
import com.deborah.tricomparator.utils.ElementUtils;

public class TriBulle {

	public int trier(Element [] elements) {
		boolean triee;
		int comparaison = 0;
		int affectation = 0;
		for (int i=0; i<elements.length-1; i++) {
			triee = true;
			for (int j=0; j<elements.length-i-1; j++) {
				comparaison++;
				if (elements[j+1].getKey() < elements[j].getKey()) {
					comparaison++;
					ElementUtils.echanger(elements, j, j + 1);
					affectation++;
					triee = false;
				}
			}
			if (triee)  {
				break;
			}
		}
		return comparaison+affectation;
	}
}