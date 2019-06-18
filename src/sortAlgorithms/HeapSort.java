/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortAlgorithms;

/**
 *
 * @author Vladimir Aca
 */
public class HeapSort {
    static int total;
    
    public static void heapify(Comparable[] array, int i){
        int left = i*2;
        int right = i*2 +1;
        int parent = i;
        
        if(left<= total && array[left].compareTo(array[parent])>=0){
            parent = left;
        }
        if(right <= total && array[right].compareTo(array[parent])>=0){
            parent = right;
        }
        if(parent!= i){
            swap(array, i, parent);
            heapify(array, parent);
        }
    }
    
    public static void swap(Comparable[] array, int i, int parent){
        Comparable temp = array[i];
        array[i] = array[parent];
        array[parent] = temp;
    }
    
    public static void sort(Comparable[] array){
        total = array.length-1;
        for(int i=total/2; i>=0; i--){
            heapify(array, i);
        }
        print((Integer[]) array);
        for(int i=total; i>0; i--){
            swap(array, 0, i);
            total--;
            heapify(array, 0);
        }
    }
    
    public static void print(Integer[] currentArray){
        for(Integer element: currentArray){
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}
