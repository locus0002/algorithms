/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Vladimir Aca
 */
public class ContactList {
    HashMap<Character, TreeSet<String>> contacts;

    public ContactList() {
        this.contacts = new HashMap<>();
    }
    
    public void add(String contactName){
        char firstLetter = contactName.charAt(0);
        TreeSet<String> listName = this.contacts.get(firstLetter);
        if(listName == null){ listName = new TreeSet<>(); }
        listName.add(contactName);
        this.contacts.put(firstLetter, listName);
    }
    
    public void print(){
        this.contacts.values().forEach((listName) -> {
            listName.forEach((currentName) -> {
                System.out.println(currentName);
            });
        });
    }
    
    public void find(String targetName){
        char firstLetter = targetName.charAt(0);
        TreeSet<String> listName = this.contacts.get(firstLetter);
        if(listName != null){
            int cont = 0;
            for(String currentName: listName){
                if(currentName.startsWith(targetName)){
                    cont++;
                }
            }
            System.out.println(cont);
        }else{
            System.out.println("0");
        }
    }
}
