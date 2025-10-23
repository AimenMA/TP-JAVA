package TP1;
import java.util.Scanner;

public class AirCercle {
     public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Donnez le rayon r: ");
double r= sc.nextInt();
double Pi= Math.PI;

double Air= Pi*r*r;


System.out.print("l'air du cercle est:");
System.out.print(Air);

sc.close();

}
}
