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
public class Calculo {
    private static Datos d;//IMPORTANTE
    
  public static Datos maxminpromA(int[] arreglo) {//A TRAVES DEL RETURN RETORNA EL OBJETO DATO;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int i=0; i < arreglo.length; i++) {
            if(arreglo[i] > max) max = arreglo[i];
            if(arreglo[i] < min) min = arreglo[i];
            sum+= arreglo[i];
        }
        Datos obj = new Datos(max, min, sum/arreglo.length);
        return obj;
    }
    public static void maxminpromB(int[] arreglo, Datos d){//A TRAVES DEL PARAMETRO d RETORNA LOS VALORES ASIGNADOS;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int i=0; i < arreglo.length; i++) {
            if(arreglo[i] > max) max = arreglo[i];
            if(arreglo[i] < min) min = arreglo[i];
            sum+= arreglo[i];
        }
        d.setMax(max);
        d.setMin(min);
        d.setProm(sum/arreglo.length);
    }
    public static void maxminpromC(int[] arreglo) {//RETORNA LOS DATOS INSTANCIANDO UN OBJETO DENTRO Y HACIENDO UN METODO A PARTE PARA OBTENER LOS RESULTADOS;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int i=0; i < arreglo.length; i++) {
            if(arreglo[i] > max) max = arreglo[i];
            if(arreglo[i] < min) min = arreglo[i];
            sum+= arreglo[i];
        }
        d = new Datos();
        d.setMax(max);
        d.setMin(min);
        d.setProm(sum/arreglo.length);
    }
    public static Datos obtenerResultados() {//PREGUNTAR SI COMO FUNCIONA EL INSTANCIAR ACA;
      return d;
    }
}
