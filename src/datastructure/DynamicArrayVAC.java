/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Arrays;

/**
 *
 * @author Vladimir Aca
 * @param <T>
 */
public class DynamicArrayVAC<T> {
    int size;
    Object[] data;
    
    public DynamicArrayVAC(){
        this.size = 0;
        this.data = new Object[1];
    }
    
    public int getSize(){
        return this.data.length;
    }
    
    public void put(Object element){
        ensureSize(this.size + 1);
        this.data[this.size] = element;
        this.size++;
    }
    
    public void ensureSize(int newCapacity){
        if(newCapacity > this.getSize()){
            this.data = Arrays.copyOf(data, this.getSize()*2);
        }
    }
    
    public T getElement(int index){
        return (T) this.data[index];
    }
}
