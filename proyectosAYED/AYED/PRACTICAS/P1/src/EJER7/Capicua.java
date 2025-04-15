/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER7;

import java.util.*;
/**

import java.util.*;
 *
 * @author nehuen
 */
public class Capicua {
        public boolean esCapicua(ArrayList<Integer> lista) {
        boolean es = true;
        if(!lista.isEmpty()) {
            int pri = 0;
            int ult = lista.size() - 1;
            while((pri < ult) && es) {
                if (lista.get(pri).equals(lista.get(ult))) {
                    pri++;
                    ult--;
                }
                else es = false;
            }
        }
        return es;
    }
        
    public boolean esCapicuaRec(ArrayList<Integer> lista) {
        if(!lista.isEmpty() && lista.size() > 1) 
            return esCapicua(lista, 0, lista.size()-1);
        return true;
    }
    
    private boolean esCapicua(ArrayList<Integer> lista, int pri, int ult) {
        boolean es = true;
        if (pri < ult) 
            if(lista.get(pri).equals(lista.get(ult))) es = esCapicua(lista, ++pri, --ult);
            else es = false;
        return es;
    }
    
        public static void main (String[] args) {// EL MAIN PARA INGRESAR LOS VALORES A SER EVALUADOS COMO CAPICUAS
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        lista.add(4);
        lista.add(2);

        Capicua c = new Capicua();
        System.out.println("Es capicua: " + c.esCapicua(lista));
        System.out.println("Es capicua: " + c.esCapicuaRec(lista));
        
    }
}