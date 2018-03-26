package com.deborah.tricomparator.business;

import com.deborah.tricomparator.objets.Element;

public class TriFusion {

    public int trier(Element[] elements) {
        int operationElementaire = mergeSort(elements,0,elements.length-1);
        return operationElementaire;


    }

    private int  mergeSort(Element[] list, int low, int high) {
        int operationElementaire = 0;
        if (low < high) {
            // find the midpoint of the current subarray
            int mid = (low + high) / 2;

            // sort the first half
            mergeSort(list, low, mid);

            // sort the second half
            mergeSort(list, mid + 1, high);

            // fusionner the halves
            operationElementaire =  fusionner(list, low, high);
        }
       return  operationElementaire;

    }

    private static int fusionner(Element [] elements, int low, int high) {
        Element[] temp = copier(elements);
        int affectation = 0;
        int comparaison = 0;

        int mid = (low + high) / 2;
        int index1 = 0;
        int index2 = low;
        int index3 = mid + 1;

        while (index2 <= mid && index3 <= high) {
            comparaison++;
            if (elements[index2].getKey() < elements[index3].getKey()) {
                affectation++;
                temp[index1] = elements[index2];
                index1++;
                index2++;
            } else {
                temp[index1] = elements[index3];
                affectation++;
                index1++;
                index3++;
            }
        }
        while (index2 <= mid) {
            temp[index1] = elements[index2];
            affectation++;
            index1++;
            index2++;
        }

        while (index3 <= high) {
            temp[index1] = elements[index3];
            affectation++;
            index1++;
            index3++;

        }
        for (int i = low, j = 0; i <= high; i++, j++) {
            elements[i] = temp[j];
            affectation++;
        }
        return comparaison+affectation;
    }
    public static Element[] copier(Element[] list) {
        Element[] temp = new Element[list.length];
        for (int k=0; k<list.length; k++) {
            temp[k] = list[k];
        }
        return temp;
    }

}
