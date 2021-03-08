
package Practica1;

import java.util.Scanner;



public class Practica1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Fila;
        System.out.print("Cuantas Filas: ");
        Fila= sc.nextInt();
        
        
        for (int i = 0; i < Fila; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
   }      
} 
