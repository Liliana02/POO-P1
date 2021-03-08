
package Practica3;

import java.util.Scanner;


public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int Com;
        System.out.print("Cuantos numeros vas a introducir:");
        n = sc.nextInt();
        int[] Num = new int[n];
        //Para introducir numeros
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el numero "+(i+1)+": ");
            Num[i] = sc.nextInt();
        }
        //Para que se comparen entre si
        for (int i = 0; i < (n-1); i++) {
            for (int j = (i+1); j < n; j++) {
                if (Num[i]>Num[j]) {
                    Com = Num[i];
                    Num[i] = Num[j];
                    Num[j] = Com;
                }
            }
        }
        //Para imprimir
        System.out.println("Los numeros ordenados de menor a mayor son:");
        for (int i = 0; i < n; i++) {
            
            System.out.println((i+1) + ". " + Num[i]);
        }
    }
}    

