/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author
 */
public class AmazonHashMap {
    
    public static void  example(){
        int[] entry = {1,2,2,3,3,4,5,5,6,6,7,8,9,9,10,10};
        evaluate(entry);
    }
    
    public static void stringText(){
        String currentText = "A 401k is a retirement savings plan sponsored by an employer . It lets workers save and invest a piece of their paycheck before taxes are taken out . Taxes are not paid until the money is withdrawn from the account . 401k plans , named for the section of the tax code that governs them , arose during the 1980s as a supplement to pensions . Most employers used to offer pension funds .";
        evaluate(currentText);
    }
    
    public static void evaluate(String text){
        String[] words = text.split(" ");
        List<String> excludeWords = new ArrayList<>();
        HashMap<String, Integer> hashMapFrequency = new HashMap<>();
        int maxFrequency = 1;
        excludeWords.add("a");
        excludeWords.add("by");
        excludeWords.add("an");
        excludeWords.add("it");
        excludeWords.add(".");
        excludeWords.add(",");
        excludeWords.add("of");
        excludeWords.add("are");
        excludeWords.add("not");
        excludeWords.add("for");
        excludeWords.add("the");
        excludeWords.add("as");
        excludeWords.add("is");
        excludeWords.add("to");
        
        for(String currentWord : words){
            if(excludeWords.contains(currentWord.trim()) || currentWord.trim().length() == 0){ continue; }
            String auxWord = currentWord.trim().toLowerCase();
            if(hashMapFrequency.get(auxWord) == null){
                hashMapFrequency.put(auxWord, 1);
            }else{
                int frequency = hashMapFrequency.get(auxWord) + 1;
                maxFrequency = frequency;
                hashMapFrequency.put(auxWord, frequency);
            }
        }
        
        for(String keyWord : hashMapFrequency.keySet()){
            if(hashMapFrequency.get(keyWord) == maxFrequency){
                System.out.println(keyWord + " " + maxFrequency);
            }
        }
    }
    
    public static void evaluate(int[] arrayToEvaluate){
        HashMap<Integer, Integer> hashMapFrequency = new HashMap<>();
        for(int k=0; k < arrayToEvaluate.length; k++){
            if(hashMapFrequency.get(arrayToEvaluate[k]) != null){
                int frequency = hashMapFrequency.get(arrayToEvaluate[k]) + 1;
                hashMapFrequency.put(arrayToEvaluate[k], frequency);
            }else{
                hashMapFrequency.put(arrayToEvaluate[k], 1);
            }
        }
        
        for(int k=0; k < arrayToEvaluate.length; k++){
            if(hashMapFrequency.get(arrayToEvaluate[k]) == 1){
                System.out.println(arrayToEvaluate[k]);
            }
        }
    }
}
