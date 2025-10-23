package TP1;
import java.util.Scanner;

public class Somme2Entier {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Entrez un entier 1: ");
int n1= sc.nextInt();
System.out.print("Entrez un entier 2: ");
int n2= sc.nextInt();

int S = n1+n2;

System.out.print("La somme des deux entiers est:");
System.out.print(S);

sc.close();


}
}
