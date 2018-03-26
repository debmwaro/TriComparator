package com.deborah.tricomparator.business;

import com.deborah.tricomparator.objets.Element;
import com.deborah.tricomparator.objets.ResultTri;
import com.deborah.tricomparator.utils.ElementUtils;

import java.util.ArrayList;


public class TriManager {


    public ArrayList<ResultTri> traiter(int start ,int numberMax){

        ArrayList<ResultTri>  resultTris = new ArrayList<ResultTri>();
        TriFusion fusion = new TriFusion();
        TriBulle triBulle = new TriBulle();
        TriDenombrement triDenombrement = new TriDenombrement();
        for(int i = start; i<numberMax ; i++) {
            Element [] elements = ElementUtils.createElement(i);
            int fusionComplexity = fusion.trier(elements);
            int bulleComplexity = triBulle.trier(elements);
            int denomComplexity = triDenombrement.trier(elements);
            ResultTri resultTri = new ResultTri(i);
            resultTri.setBulle(bulleComplexity);
            resultTri.setFusion(fusionComplexity);
            resultTri.setDenom(denomComplexity);
            resultTris.add(resultTri);
        }
        return resultTris;
    }
}
