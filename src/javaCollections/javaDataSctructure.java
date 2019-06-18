/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author Vladimir Aca
 */
public class javaDataSctructure {
    
    public static void exampleDataStructure(){
        ArrayList<String> arrayList = new ArrayList<String>(); 
        /* this collections is useful when the system is gonna do many 
            reading of data and not to many updating and storing because of the swiping
        */
        arrayList.add("uno");
        arrayList.add("dos");
        arrayList.add("tres");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        
        System.out.println("-----------\n");
        LinkedList<String> linkedList = new LinkedList<String>();
        /*
            this collection is useful when the system has to do many remoings and addings
            because there is not swiping
        */
        linkedList.add("one");
        linkedList.add("three");
        linkedList.add("four");
        Iterator<String> it = linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("-----------\n");
        String hola = ";";
        
        HashMap<Integer, String> hashM = new HashMap<>();
        hashM.put(1, "uno");
        hashM.put(5, "five");
        hashM.put(6, "six");
        
        for(Map.Entry currentElmnt: hashM.entrySet()){
            System.out.println("Key: " + currentElmnt.getKey() + " value: " + currentElmnt.getValue());
            
        }
        hashM.put(5, "updated five");
        System.out.println(hashM.get(5));
        
        System.out.println("-----------\n");
        HashSet<String> hashSet = new HashSet<>();
        /*
            this collection is useful when the system has to add unique elements
        */
        hashSet.add("uno");
        hashSet.add("uno");
        hashSet.add("dos");
        hashSet.add("tres");
        Iterator setIterator = hashSet.iterator();
        while(setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        /*
            It can see the system just stored the element "uno" only one time but is not ordered
        */
        System.out.println("-----------\n");
        TreeSet<String> treeSet = new TreeSet<>();
        /*
            this collection is useful when the system has to add unique elements 
            and the elements have to be ordered
        */
        treeSet.add("uno");
        treeSet.add("uno");
        treeSet.add("dos");
        treeSet.add("tres");
        Iterator treeIterator = treeSet.iterator();
        while(treeIterator.hasNext()){
            System.out.println(treeIterator.next());
        }
        /*
            It can see the system just stored the element "uno" only one time
        */
        
        System.out.println("-----------\n");
        Stack<String> stack = new Stack<String>();
        stack.push("uno");
        stack.push("two");
        stack.push("three");
        System.out.println(stack.pop());
        
        System.out.println("-----------\n");
        Queue<String> queue = new LinkedList<>();
        queue.add("uno");
        queue.add("two");
        queue.add("three");
        System.out.println(queue.poll());
        
        System.out.println("ORDER LIST");
        ArrayList<String> testList = new ArrayList<>();
        String hol =";";
        
        testList.add("Jonathan");
        testList.add("Vladimir");
        testList.add("Aca");
        testList.add("Cruz");
        System.out.println("///Before ordering");
        print(testList);
        
        Collections.sort(testList);
        System.out.println("///After ordering");
        print(testList);
        
        System.out.println("ORDER LIST OF OBJECTS");
        ArrayList<Person> collectionPerson = new ArrayList<>();
        collectionPerson.add(new Person("Jonathan", 12));
        collectionPerson.add(new Person("Vladimir", 22));
        collectionPerson.add(new Person("Aca", 1));
        collectionPerson.add(new Person("Cruz", 122));
        System.out.println("///Before ordering");
        printPerson(collectionPerson);
        
        Collections.sort(collectionPerson);
        System.out.println("///After ordering");
        printPerson(collectionPerson);
    }
    
    public static void printPerson(ArrayList<Person> currentList){
        for(Person currentPerson: currentList){
            System.out.println(currentPerson.getName() + " " + currentPerson.getAge());
        }
    }
    
    public static void print(ArrayList<String> currentList){
        for(String currentName: currentList){
            System.out.println(currentName);
        }
    }
    
}
