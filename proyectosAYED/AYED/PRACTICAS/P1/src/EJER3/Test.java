/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER3;

import PaqueteLectura.GeneradorAleatorio;

public class Test {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        Estudiante vecEstudiantes[] = new Estudiante[2];
        Profesor vecProfesores[] = new Profesor[3];
        
        int i;
        int j;
        
          for(i=0; i<2; i++) {
            vecEstudiantes[i] = new Estudiante(GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4));
        }
        
        for(j=0; j<3; j++) {
            vecProfesores[j] = new Profesor(GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4), GeneradorAleatorio.generarString(4));
        }
        
        for(i=0; i<2; i++) {
            System.out.println(vecEstudiantes[i].tusDatos());
        }
      
        for(j=0; j<3; j++) {
            System.out.println(vecProfesores[j].tusDatos());
        }
    }
}
