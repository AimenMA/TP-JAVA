package TP1;
import java.util.Scanner;
 
public class Conversion {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Donnez le Degree en Celcius:  ");
int C= sc.nextInt();

int F = C * 9/5 + 32;

System.out.print("le Degree en Farenheit:  ");
System.out.print(F);


sc.close();
}
}
