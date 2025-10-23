package TP1;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Donnez votre masse en KG: ");
        Float m=sc.nextFloat();
        System.out.println("Donnez votre Taille en cm: ");
    Float t=sc.nextFloat();

        float  IMC= m / (t*t);
        System.out.printf("Le IMC est: %.2f ", IMC);


        sc.close();

    
    }
}
