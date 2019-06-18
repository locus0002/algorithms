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
public class BubbleSort {
    public static int[] sort(int[] currentArray){
        int pivot = 0;
        for(int k=0; k< currentArray.length; k++){
            pivot = 0;
            for(int j=1; j< currentArray.length - k; j++){
                if( currentArray[pivot] > currentArray[j] ){
                    int aux = currentArray[pivot];
                    currentArray[pivot] = currentArray[j];
                    currentArray[j] = aux;
                }
                pivot++;
            }
            print(currentArray);
        }
        return currentArray;
    }
    
    public static void print(int[] currentArray){
        for(Integer element: currentArray){
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}
