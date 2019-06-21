/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Vladimir Aca
 */
public class ArrayDS {
    
    public static int hourglassSum(int[][] arr){
        int lengthRow = arr.length - 2;
        int lengthColumn = arr[0].length - 2;
        int maxSum = 0, currentSum = 0;
        
        for(int k=0; k<3; k++){
            maxSum += arr[0][k];
            maxSum += arr[2][k];
        }
        maxSum += arr[1][1];
        currentSum = maxSum;
        
        for(int k=0; k<lengthRow; k++){
            for(int j=0; j<lengthColumn; j++){
                if(j-1 >= 0){
                    currentSum += arr[k][j+2] - arr[k][j-1];
                    currentSum += arr[k+1][j+1] - arr[k+1][j];
                    currentSum += arr[k+2][j+2] - arr[k+2][j-1];
                }else{
                    currentSum = 0;
                    for(int t=0; t<3; t++){
                        currentSum += arr[k][t];
                        currentSum += arr[k+2][t];
                    }
                    currentSum += arr[k+1][1];
                }
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        
        return maxSum;
    }
    
    public static void main(String[] args){
        int[][] test = new int[6][6];
        test[0][0] = -9;
        test[0][1] = -9;
        test[0][2] = -9;
        test[0][3] = 1;
        test[0][4] = 1;
        test[0][5] = 1;
        
        test[1][0] = 0;
        test[1][1] = -9;
        test[1][2] = 0;
        test[1][3] = 4;
        test[1][4] = 3;
        test[1][5] = 2;
        
        test[2][0] = -9;
        test[2][1] = -9;
        test[2][2] = -9;
        test[2][3] = 1;
        test[2][4] = 2;
        test[2][5] = 3;
        
        test[3][0] = 0;
        test[3][1] = 0;
        test[3][2] = 8;
        test[3][3] = 6;
        test[3][4] = 6;
        test[3][5] = 0;
        
        test[4][0] = 0;
        test[4][1] = 0;
        test[4][2] = 0;
        test[4][3] = -2;
        test[4][4] = 0;
        test[4][5] = 0;
        
        test[5][0] = 0;
        test[5][1] = 0;
        test[5][2] = 1;
        test[5][3] = 2;
        test[5][4] = 4;
        test[5][5] = 0;
        
        System.out.println(hourglassSum(test));
    }
}
