package com.deborah.tricomparator;


public class Trieur {

    public int trierFusion(Element[] elements) {
        int operationElementaire = fusion(elements, 0, elements.length - 1);
        return operationElementaire;


    }

    private int fusion(Element[] elements, int debut, int fin) {
        int operationElementaire = 0;
        if (debut < fin) {
            int milieu = (debut + fin) / 2;
            fusion(elements, debut, milieu);
            fusion(elements, milieu + 1, fin);
            operationElementaire =  fusionner(elements, debut, fin);
        }
       return  operationElementaire;

    }

    private static int fusionner(Element [] elements, int debut, int fin) {
        Element[] temp = copier(elements);
        int affectation = 0;
        int comparaison = 0;

        int milieu = (debut + fin) / 2;
        int index1 = 0;
        int index2 = debut;
        int index3 = milieu + 1;

        while (index2 <= milieu && index3 <= fin) {
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
        while (index2 <= milieu) {
            temp[index1] = elements[index2];
            affectation++;
            index1++;
            index2++;
        }

        while (index3 <= fin) {
            temp[index1] = elements[index3];
            affectation++;
            index1++;
            index3++;

        }
        for (int i = debut, j = 0; i <= fin; i++, j++) {
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

    public int trierBulle(Element [] elements) {
        boolean triee;
        int comparaison = 0;
        int affectation = 0;
        for (int i=0; i<elements.length-1; i++) {
            triee = true;
            for (int j=0; j<elements.length-i-1; j++) {
                comparaison++;
                if (elements[j+1].getKey() < elements[j].getKey()) {
                    comparaison++;
                    echanger(elements, j, j + 1);
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

    public int trierDenombrement(Element[] affectations) {
        int affectation = 0;
        for (int i = 0; i < affectations.length; i++) {
            affectation++;
        }
        for (int i = 0; i <= 100; i++) {
            affectation ++;
        }

        for (int i = 0; i < affectations.length; i++) {
            affectation ++;
        }
        return affectation;
    }
    public static void echanger(Element [] list,int i,int j) {
        Element temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
