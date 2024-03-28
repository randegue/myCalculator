package org.andegue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("---------------- Calculatrice Andegue --------------");
        System.out.println();
        System.out.println("Que voulez-vous faire? ");
        System.out.println();
        System.out.println("Entrez 1 si vous voulez faire une addition.");
        System.out.println("Entrez 2 si vous voulez faire une soustraction.");
        System.out.println("Entrez 3 si vous voulez faire une multiplication.");

        Scanner communication1 = new Scanner(System.in);

        int choixUtilisateur = communication1.nextInt();

        switch (choixUtilisateur){
            case 1:
                System.out.println("Vous avez choisi de faire une addition.");
                System.out.println();
                System.out.println("Entrer le premier nombre: ");
                double a = communication1.nextDouble();

                System.out.println("Entrer le deuxieme nombre: ");
                double b = communication1.nextDouble();

                System.out.println("a = "+a);
                System.out.println("b = "+b);

                double result = monAddition(a,b);
                System.out.println("le resultat de a+b est "+result);
                break;
            case 2:
                System.out.println("Vous avez choisis la Soustraction");
                System.out.println();
                System.out.println("Entrer le premier nombre: ");
                double s1 = communication1.nextDouble();

                System.out.println("Entrer le deuxieme nombre: ");
                double s2 = communication1.nextDouble();

                System.out.println("s1 = "+s1);
                System.out.println("s2 = "+s2);

                double result2 = maSoustraction(s1,s2);
                System.out.println("le resultat de s1 - s2 est "+result2);
                break;
            case 3:
                System.out.println("Vous avez choisis la multiplication");
                System.out.println();
                System.out.println("Entrer le premier nombre: ");
                double m1 = communication1.nextDouble();

                System.out.println("Entrer le deuxieme nombre: ");
                double m2 = communication1.nextDouble();

                System.out.println("m1 = "+m1);
                System.out.println("m2 = "+m2);

                double result3 = maMultiplication(m1, m2);
                System.out.println("le resultat de m1 * m2 est "+result3);
                break;
        }
    }

    public static double monAddition(double a, double b){
        return a+b;
    }

    public static double maSoustraction(double a, double b){
        return a-b;
    }

    public static double maMultiplication(double a, double b) {
        return a*b;
    }
}