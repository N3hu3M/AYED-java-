/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER5;

/**
 *
 * @author nehuen
 */
public class MAXMIN {
 public static void main(String[] args) {
        int[] arreglo1 = {10, 51, 30, 42, 50};
        int[] arreglo2 = {12, 28, 30, 38, 20};
        Datos d = new Datos();
        int[] arreglo3 = {5, 20, 11, 40, 100};
        
        System.out.println(Calculo.maxminpromA(arreglo1).toString());
        Calculo.maxminpromB(arreglo2, d);
        System.out.println(d.toString());
        Calculo.maxminpromC(arreglo3);
        System.out.println(Calculo.obtenerResultados());
    }
    
}
