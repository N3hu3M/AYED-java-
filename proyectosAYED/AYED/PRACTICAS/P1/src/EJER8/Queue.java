/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER8;
import java.util.*;
/**
 *
 * @author nehuen
 */
public class Queue <T> extends Sequence{
   
    protected List<T> data;
    
    public Queue() {
        this.data = new ArrayList<T>();
    }
    
    public void enqueue(T dato) {
        data.add(dato);
    }
    
    public T dequeue() {
        return data.remove(0);
    }
    
    public T head() {//PREGUNTAR A QUE HACE REFERENCIA EL .get
        return data.get(0);
    }
    
    @Override
    public int size() {
        return data.size();
    }
    
    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }
    
    @Override
    public String toString() {
        String str = "[";
	for(T d: data)
            str = str + d +", ";
	str = str.substring(0, str.length()-2)+"]";
	return str;
    }
}
    
    
