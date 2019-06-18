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
public class MergeSort {
    
    int[] currentArray;
    int[] temp;
    
    public MergeSort(int[] newArray){
        this.currentArray = newArray;
        this.temp = new int[newArray.length];
        this.print();
        this.divide(0, newArray.length-1);
    }
    
    public void divide(int low, int high){
        if(low < high){
            int midPosition = getMidPosition(low, high);
            divide(low, midPosition);
            divide(midPosition + 1, high);
            merge(low, midPosition, high);
        }
    }
    
    public int getMidPosition(int low, int high){
        return low + ((high - low)/2);
    }
    
    public void merge(int low, int midPosition, int high){
        for(int t=low; t<=high; t++){
            temp[t] = currentArray[t];
        }
        int i=low;
        int j= midPosition+1;
        int k= low;
        while(i<=midPosition && j <= high){
            if(temp[i] <= temp[j]){
                currentArray[k] = temp[i];
                i++;
            }else{
                currentArray[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=midPosition){
            currentArray[k] = temp[i];
            k++;
            i++;
        }
        this.print();
    }
    
    public void print(){
        for(Integer element: currentArray){
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}
