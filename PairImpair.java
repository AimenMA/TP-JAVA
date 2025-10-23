package TP1;

import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("Donnez Un entier: ");
    int N=sc.nextInt();

    if (N%2==0) {
        System.out.println("Le entier est Pair");
    }
    else
     System.out.println("Le entier est Impair");

        sc.close();
    }
 
}
