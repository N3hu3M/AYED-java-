/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER1;

/**
 *
 * @author nehuen
 */
public class PasajeParametros {
    public static void main(String[] args){
        int valor1 = 1;
        int valor2 = 3;
        PasajeParametros.impresionParametrosFor(valor1, valor2);
        PasajeParametros.impresionParametrosWhile(valor1, valor2);
        PasajeParametros.impresionParametrosIf(valor1, valor2);//DATE CUENTA QUE TE COMBIENE CALCULAR EL MAS GRANDE AQUI Y PASAR SIEMPRE IGUL LOS PARAMETROS SOBRE TODO POR LA RECURSION;
    }
    
    public static void impresionParametrosFor(int valor1, int valor2){
        int cant;
        if(valor1 < valor2){
          cant = valor2 - valor1;
          for (int i = 0; i <= cant; i++){
              System.out.println(valor1);
              valor1++;
          }
          }else{
          cant = valor1 - valor2;
          for (int i = 0; i <= cant; i++){
              System.out.println(valor2);
              valor2++;
          }
       }
    }
    
    public static void impresionParametrosWhile(int valor1, int valor2){
        if(valor1 < valor2){
            do{
            System.out.println(valor1);
            valor1++;
           }while(valor1 <= valor2);
        }else
          do{
            System.out.println(valor2);
            valor2++;
           }while(valor2 <= valor1);     
          }
    
    public static void impresionParametrosIf(int valor1, int valor2){
        if(valor1 <= valor2){
          System.out.println(valor1);
          impresionParametrosIf(valor1+1, valor2);
                 
        }
      }
    }