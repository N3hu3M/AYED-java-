/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER2;

import java.util.Scanner;
        
public class CreacionArreglo {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = s.nextInt();
        int arreglo[] = CreacionArreglo.multiplosVectorN(num);
        for(int i=0; i<num; i++) {
            System.out.print(arreglo[i] + " | ");
        }
    }
     
    public static int[] multiplosVectorN(int n) {
        int arreglo[] = new int[n];
        int num = 0;
        for (int i=0; i<n; i++) {
            arreglo[i] = n + num;
            num+= n;
        }
        return arreglo;
    }
}
