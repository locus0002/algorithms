/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Vladimir Aca
 */
public class Median {
    ArrayList<Integer> universe;

    public Median() {
        this.universe = new ArrayList<>();
    }
    
    public void test(){}
    
    public void add(int newNumber){
        this.universe.add(newNumber);
    }
    
    public double getMedian(){
        Collections.sort(this.universe);
        if(this.universe.size() % 2 == 0){
            int firstIndex = this.universe.size()/2;
            int secondIndex = firstIndex - 1;
            return (double) (this.universe.get(firstIndex) + this.universe.get(secondIndex))/2;
        }else{
            int res = this.universe.size()/2;
            return this.universe.get(res);
        }
    }
}
