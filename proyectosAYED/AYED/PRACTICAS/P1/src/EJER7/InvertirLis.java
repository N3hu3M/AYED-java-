/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER7;

import java.util.*;


public class InvertirLis {
    public static void invertirArrayList(ArrayList<Integer> lista) {//LLAMA A LA RECURSION PARA INVERTIR VALORES
        invertirArrayListRec(lista, 0, lista.size()-1);
    }
    private static void invertirArrayListRec(ArrayList<Integer> lista, int inicio, int fin) {
        if(inicio < fin) {
            int temp = lista.get(inicio);//TOMA EL INICIO EN UNA VARIABLES
            lista.set(inicio, lista.get(fin));//SETEA EL INICIO NUEVO(TRANSFORAMDNOSE EN EL FIN)
            lista.set(fin, temp);//SETEA EL FIN CON EL VALOR DEL INCIO USANDO LA VARIABLE TEMP QUE TIENE EL INICIO
            invertirArrayListRec(lista, inicio+1, fin-1);//AVANZA EN INICIO Y RETROCEDE EN FIN
        }
    }
    public static void main(String[] args) {//METODO MAIN DE CARGA
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(11);
        lista.add(12);
        lista.add(13);
        lista.add(14);
        System.out.println("Orden normal de lista");
        for(Integer n: lista)
            System.out.println(n);
        System.out.println("=================");
        invertirArrayList(lista);
        System.out.println("Orden invertido de lista");
        for(Integer n: lista)
            System.out.println(n);
    }
}
    
