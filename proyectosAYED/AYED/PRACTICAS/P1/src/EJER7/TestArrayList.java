/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER7;

import java.util.*;

public class TestArrayList {
       public static void main(String[] args) { 
        //List <Integer> listaNums = new ArrayList <Integer>();
        
           List <Integer> listaNums = new LinkedList <Integer>();
        for(int i =0; i < args.length; i++)
            listaNums.add(Integer.parseInt(args[i]));
        System.out.println("Elementos insertados: " + listaNums.size());  
        
        //INCISO C
        for(int i: listaNums)
            System.out.println(i);
        
        System.out.println("-------------------");
        
        Iterator<Integer> it = listaNums.iterator();
        while(it.hasNext()) 
            System.out.println(it.next());
        
        System.out.println("-------------------");
        
        for(int i=0; i < listaNums.size(); i++)
            System.out.println("Num=" + listaNums.get(i));
        
        //INCISO D
        List <Estudiante> listaEsts = new LinkedList <Estudiante>();
        Estudiante e1 = new Estudiante("Prueba", "Prueba", "pruebamail", "Facultad de Informatica");
        listaEsts.add(e1);
        Estudiante e2 = new Estudiante("Prueba", "Prueba", "pruebamail", "Facultad de Informatica");
        listaEsts.add(e2);
        Estudiante e3 = new Estudiante("Prueba", "Prueba", "pruebamail", "Facultad de Informatica");
        listaEsts.add(e3);
        System.out.println("Estudiantes de la Facultad de Informatica:");
        for(Estudiante est: listaEsts)
            System.out.println(est.toString());
        
        List <Estudiante> listaEstsCopiados = new LinkedList <Estudiante>(listaEsts); //Crea una copia independiente del original
        System.out.print("Estudiantes copiados: ");
        System.out.println(listaEstsCopiados);
        
        System.out.println("======================");
        
   //   e1.setNombre("Matute"); Se modifica en todas las listas, porque se copian las direcciones a los objetos y lo que se modifico fue el objeto
        listaEsts.set(0, new Estudiante("Prueba", "Prueba", "pruebamail", "Facultad de Informatica"));
        System.out.print("Estudiantes: ");
        for(Estudiante est: listaEsts)
            System.out.println(est.toString()); //En este caso este cambio solo se ve en esta lista y no en la copiada, porque se cambio la referencia al objeto Estudiante
        System.out.print("Estudiantes copiados: ");
        System.out.println(listaEstsCopiados);
        
        System.out.println("======================");
        
        //Otra forma de copiar una lista es con el metodo addAll(): Crear un nuevo LinkedList y agregar todos los elementos del original usando este metodo
        List <Estudiante> listaEstsCopiadosAdd = new LinkedList <Estudiante>();
        listaEstsCopiadosAdd.addAll(listaEsts);
        System.out.print("Estudiantes copiados V2: ");
        System.out.println(listaEstsCopiadosAdd);
        
        System.out.println("======================");
        
        //INCISO E
        Estudiante e4 = new Estudiante("Prueba", "Prueba", "pruebamail", "Facultad de Informatica");
        if(!listaEsts.contains(e4)) {
            listaEsts.add(e4);
            System.out.println("Se agrego al alumno correctamente");
        } else {
            System.out.println("El alumno se encuentra repetido");
        }
        System.out.print("Listado con alumnos: ");
        System.out.println(listaEsts);
        
    }
        
}
