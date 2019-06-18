/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Vladimir Aca
 */
public class ChallengeContacts {
    static int[] contacts(String[][] queries) {
        /*
         * Write your code here.
         */
        HashMap<Character, TreeSet<String>> contacts = new HashMap<>();
        String res = "";
        for(int j=0; j<queries.length; j++){
            if(queries[j][0].equals("add") ){

                char firstLetter = queries[j][1].charAt(0);
                TreeSet<String> listName = contacts.get(firstLetter);
                if(listName == null){ listName = new TreeSet<>(); }
                listName.add(queries[j][1]);
                contacts.put(firstLetter, listName);

            }else if(queries[j][0].equals("find")){

                char firstLetter = queries[j][1].charAt(0);
                TreeSet<String> listName = contacts.get(firstLetter);
                
                if(listName != null){
                    int cont = 0;
                    for(String currentName: listName){
                        if(currentName.startsWith(queries[j][1])){
                            cont++;
                        }
                    }
                    res += cont + ",";
                }else{
                    res += "0,";
                }

            }
        }
        
        String[] results = res.split("[,]");
        int[] numberResults = new int[results.length];
        for(int k=0; k<results.length; k++){
            numberResults[k] = Integer.parseInt(results[k]);
        }
        return numberResults;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Users\\locus\\Git\\AlgorithmsExampleCases\\input\\input00123.txt"));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
