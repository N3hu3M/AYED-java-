/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER7;

import java.util.*;

public class SumarLis {
    
    public static int sumarLinkedList(LinkedList<Integer> lista) {
        return sumarLinkedListRec(lista, lista.size()-1);//LLAMA A L RECURSION
    }
    private static int sumarLinkedListRec(LinkedList<Integer> lista, int indice) {
        if (indice < 0) {//EVALUACION DE LISTA VACIA
            return 0;
        } else {//CONSIDERANDO QUE EL INDICE INGRESO CON EL VALOR DE LA ULTIMA POSICION DEBIDO A QUE LAS LISTAS VAN DE 0 A n-1
            return lista.get(indice) + sumarLinkedListRec(lista, indice-1);//SUMA AL INDICE LO QUE ESTE EN LA ULTIMA POSICION
        }
    }
    
    public static void main (String[] args) {//METODO MAIN DE CARGA DE VALORES
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(5);
        lista.add(10);
        lista.add(35);
        
        System.out.println("Resultado total de los numeros de la lista: " + sumarLinkedList(lista));
    }
}