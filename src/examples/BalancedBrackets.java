/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Vladimir Aca
 */
public class BalancedBrackets {
    String brackets;
    HashMap<Character, Character> bracketDictionary;

    public BalancedBrackets(String brackets) {
        this.brackets = brackets;
        this.bracketDictionary = new HashMap<>();
        bracketDictionary.put('(', ')');
        bracketDictionary.put('[', ']');
        bracketDictionary.put('{', '}');
    }
    
    public boolean isBalanced(){
        char[] bracketArray = this.brackets.toCharArray();
        if(bracketArray.length % 2 != 0){
            return false;
        }
        Stack<Character> openBrackets = new Stack<>();
        for(char currentChar : bracketArray){
            if(this.bracketDictionary.containsKey(currentChar)){
                openBrackets.push(currentChar);
            }else if(this.bracketDictionary.containsValue(currentChar)){
                if(openBrackets.isEmpty()){
                    return false;
                }
                if(!this.bracketDictionary.get(openBrackets.pop()).equals(currentChar)){
                    return false;
                }
                
            }
        }
        
        return openBrackets.isEmpty();
    }
}
