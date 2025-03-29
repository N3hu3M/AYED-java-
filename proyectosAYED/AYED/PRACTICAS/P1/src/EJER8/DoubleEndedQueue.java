/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER8;

public class DoubleEndedQueue <T> extends Queue<T> {
    public void enqueueFirst(T data) {
        super.data.add(0, data); //Accedo a la variable protegida data del padre por medio de super y agrego data en la pos 0, o sea primero
    }
}
