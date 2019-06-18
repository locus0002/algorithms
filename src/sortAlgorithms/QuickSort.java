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
public class QuickSort {
    
    public static void swap(int [] currentArray, int positionA, int positionB){
        int temp = currentArray[positionA];
        currentArray[positionA] = currentArray[positionB];
        currentArray[positionB] = temp;
    }
    
    public static void sort(int[] currentArray, int beginning, int end){
        if(beginning > end){
            return;
        }
        int midPosition = getMidPosition(beginning, end);
        int leftSide = beginning;
        int rightSide =  end;
        while(leftSide <= midPosition && midPosition <= rightSide){
            while(currentArray[leftSide] < currentArray[midPosition]){
                leftSide++;
            }
            while(currentArray[rightSide] > currentArray[midPosition]){
                rightSide--;
            }
            if(leftSide <= rightSide ){
                swap(currentArray, leftSide, rightSide);
                print(currentArray);
                leftSide++;
                rightSide--;
            }
        }
        if(beginning<rightSide){
            sort(currentArray, beginning, rightSide);
        }
        if(end> leftSide){
            sort(currentArray, leftSide, end);
        }
    }
    
    public static int getMidPosition(int low, int high){
        return low + ((high - low)/2);
    }
    
    public static void print(int[] currentArray){
        for(Integer element: currentArray){
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}
