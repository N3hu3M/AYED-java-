package EJER5;

import java.util.*;
import EJER1y2.BinaryTree;

public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;
    
    public ProfundidadDeArbolBinario(BinaryTree<Integer> unArbol) {
        arbol = unArbol;
    }
    
    public int sumaElementosProfundidad(int p) {
        return (!arbol.isEmpty()) ? sumaElementosProfundidad(p, arbol, 0) : 0;
    }
    
    private int sumaElementosProfundidad(int p, BinaryTree<Integer> arbol, int nivActual) {
        if(p == nivActual) {
            return arbol.getData();
        } else {
            int suma = 0;
            if(arbol.hasLeftChild()) suma+= sumaElementosProfundidad(p, arbol.getLeftChild(), nivActual+1);
            if(arbol.hasRightChild()) suma+= sumaElementosProfundidad(p, arbol.getRightChild(), nivActual+1);
            return suma;
        }
    }
    
    public static void main (String[] args) {
        System.out.println("Test Profundidad");
        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
        ab.addLeftChild(new BinaryTree<Integer>(2));
        ab.addRightChild(new BinaryTree<Integer>(6));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
        
        ProfundidadDeArbolBinario prof = new ProfundidadDeArbolBinario(ab);
        System.out.println(prof.sumaElementosProfundidad(2));//SUMA LOS INTEGER DE LA MISMA PROF.
        
    }
}