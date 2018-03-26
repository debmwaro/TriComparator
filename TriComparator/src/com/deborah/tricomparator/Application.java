package com.deborah.tricomparator;

import java.util.ArrayList;

import com.deborah.tricomparator.business.TriFusion;
import com.deborah.tricomparator.business.TriManager;
import com.deborah.tricomparator.objets.Element;
import com.deborah.tricomparator.objets.ResultTri;
import com.deborah.tricomparator.utils.ElementUtils;

public class Application {

	public static void main(String[] args) {

		ArrayList<ResultTri> resultTris = new TriManager().traiter(100,150);
		ElementUtils.create(resultTris);
	}

}
