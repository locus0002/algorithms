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
public class SelectionSort {
    
    public static void sort(int[] currentArray){
        int min = 0;
        int position = -1;
        print(currentArray);
        for(int k=0; k< currentArray.length; k++){
            min = currentArray[k];
            position = -1;
            for(int j=k+1; j< currentArray.length; j++){
                if(min > currentArray[j]){
                    min = currentArray[j];
                    position = j;
                }
            }
            if(position > -1){
                currentArray[position] = currentArray[k];
                currentArray[k] = min;
            }
            print(currentArray);
        }
        //return currentArray;
    }
    
    public static void print(int[] currentArray){
        for(Integer element: currentArray){
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}
