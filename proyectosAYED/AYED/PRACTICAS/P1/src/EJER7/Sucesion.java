/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER7;

import java.util.*;

public class Sucesion {
    public static List<Integer> calcularSucesion(int n) {
        List<Integer> l = new LinkedList<Integer>();
        calcularSucesionRec(l, n);//SIMPLEMENTE LLAMA A LA RECURSION PARA CREAR LA SECUENCIA DE NUMEROS PEDIDA
        return l;
    }
    private static void calcularSucesionRec(List<Integer> l, int n) {
        l.add(n);
        if(n>1)
            if(n%2 == 0) calcularSucesionRec(l, n/2);
            else calcularSucesionRec(l, 3*n+1);
    }
    
    public static void main(String[] args) {//EL MAIN PARA INGRESAR EL NUMERO PEDIDO
        System.out.println("Ingrese un valor para n");
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        c.close();
        
        List<Integer> l = calcularSucesion(n);
        System.out.println("Elementos de la sucesion");
        for(int e: l) System.out.println(e);
    }
}