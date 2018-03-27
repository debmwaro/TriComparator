package com.deborah.tricomparator;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        testBulle();
        testFusion();
        calculNombreOperations();
    }


    public static Element[] createElement(int size) {


        Element[] result = new Element[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int key = Math.abs(random.nextInt() / 100000);
            String value = "deborah" + i;
            Element element = new Element(key, value);
            result[i] = element;

        }

        return result;

    }

    public static void testFusion() {

        Trieur trieur = new Trieur();
        System.out.println("Creation du tableau fusion");
        Element[] elements = createElement(5);
        afficher(elements);
        trieur.trierFusion(elements);
        System.out.println("Apres tri fusion du tableau ");
        afficher(elements);
    }


    public static void testBulle() {

        Trieur trieur = new Trieur();
        System.out.println("Creation du tableau bulle");
        Element[] elements = createElement(5);
        afficher(elements);
        trieur.trierBulle(elements);
        System.out.println("Apres tri bulle du tableau");
        afficher(elements);
    }

    public static void calculNombreOperations() {
        Trieur trieur = new Trieur();
        System.out.println("Taille;  Fusion ; Bulle ; Denombrement");
        for (int i = 1000; i < 1010; i++) {
            Element[] elements = createElement(i);

            int fusionOp = trieur.trierFusion(elements);
            int bulleOp = trieur.trierBulle(elements);
            int denomOp = trieur.trierDenombrement(elements);
            String result = elements.length + "  ;  " + fusionOp + " ; " + bulleOp + "  ;  " + denomOp;
            System.out.println(result);
        }
    }


    public static void afficher(Element[] result) {

        for (Element item : result) {

            System.out.println(item.getKey() + " , " + item.getValue());
        }
    }
}