
package Practica2;


import java.util.Scanner;



public class Practica2 { 

 

    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        int Filas;
        System.out.print("Cuantas Filas: ");
        Filas = sc.nextInt();
        
        for (int i = 0; i < Filas; i++) {
            for (int j = Filas-1; j >= i; j--) {
                    System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    } 

} 
