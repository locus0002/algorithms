/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchtAlgorithms;

/**
 *
 * @author Vladimir Aca
 */
public class Interpolation {
    public static int find(int[] currentArray, int target, int low, int high){
        if(low == high){
            if(currentArray[low] == target){
                return low;
            }
            return -1;
        }
        int midPosition = getMidPositionSpace(low, high, currentArray, target);
        if(target > currentArray[midPosition]){
            return find(currentArray, target, midPosition + 1, high);
        }else if(target < currentArray[midPosition]){
            return find(currentArray, target, low, midPosition - 1);
        }else{
            return midPosition;
        }
    }
    
    public static int getMidPositionSpace(int low, int high, int[] space, int target){
        return low + ((high - low)/(space[high] - space[low])) * (target - space[low]);
    }
}
