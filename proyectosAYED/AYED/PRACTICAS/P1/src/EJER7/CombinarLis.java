/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER7;

import java.util.*;

public class CombinarLis {
    
  public static void main(String[] args) {//METODO MAIN DE CARGA DE VALORES DE AMBAS LISTAS
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(5);
        lista1.add(7);
        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(6);
        lista2.add(8);
        
        ArrayList<Integer> resultado = combinarOrdenado(lista1, lista2);
        System.out.println("Lista combinada ordenada: " + resultado);
    }
    
    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        
        int indice1 = 0;
        int indice2 = 0;
        
        // Combinar las listas ordenadas
        while (indice1 < lista1.size() && indice2 < lista2.size()) {// MIENTRAS SIGAN HABIENDO ELEMENTOS EN LAS LISTAS
            if (lista1.get(indice1) < lista2.get(indice2)) {//EVALUA QUE ELEMENTO DE LAS LISATS ES EL MAS PEQUEÑO
                resultado.add(lista1.get(indice1));//RESULTADO ES MI NUEVA LISTA POR ENDE AGREGA AHI EL DATO MAS PEQUEÑO
                indice1++;//AVANZA EN LA LISTA
            } else {
                resultado.add(lista2.get(indice2));//RESULTADO ES MI NUEVA LISTA POR ENDE AGREGA AHI EL DATO MAS PEQUEÑO
                indice2++;//AVANZA EN LA LISTA
            }
        }        
        // Agregar los elementos restantes de la lista1, si los hay
        while (indice1 < lista1.size()) {
            resultado.add(lista1.get(indice1));
            indice1++;
        }
        // Agregar los elementos restantes de la lista2, si los hay
        while (indice2 < lista2.size()) {
            resultado.add(lista2.get(indice2));
            indice2++;
        }
        return resultado;
    }
}