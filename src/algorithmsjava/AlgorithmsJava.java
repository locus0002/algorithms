/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsjava;

import datastructure.DynamicArrayVAC;
import datastructure.HashTableVAC;
import datastructure.LinkedListDVAC;
import datastructure.LinkedListVAC;
import datastructure.QueueLinkedList;
import datastructure.StackLinkedList;
import examples.AmazonHashMap;
import examples.BalancedBrackets;
import examples.ContactList;
import examples.Median;
import graphs.BreadthFirstSearch;
import graphs.DepthFirstSearch;
import javaCollections.javaDataSctructure;
import searchtAlgorithms.BinarySearch;
import searchtAlgorithms.Interpolation;
import sortAlgorithms.BubbleSort;
import sortAlgorithms.HeapSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.QuickSort;
import sortAlgorithms.SelectionSort;
import trees.BinaryTreeSearch;

/**
 *
 * @author locus
 */
public class AlgorithmsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //showDynamicArray();
        //showLinkedList();
        //showDoubleLinkedList();
        //showHashTable();
        //AmazonHashMap.example();
        //AmazonHashMap.stringText();
        //showStack();
        //showQueue();
        //javaDataSctructure.exampleDataStructure();
        /*
        int[] universe = {1,2,7,10,12,22,30,45,66};
        int index = BinarySearch.find(universe, 166, 0, universe.length-1);
        if(index > -1){
            System.out.println("The target is the position: " + index);
        }else{
            System.out.println("The target is NOT in the universe");
        }
        */
        /*
        int[] universe = {1,2,7,10,12,22,30,45,66,70,88,99,100,123};
        int index = Interpolation.find(universe, 1111, 0, universe.length-1);
        if(index > -1){
            System.out.println("The target is the position: " + index);
        }else{
            System.out.println("The target is NOT in the universe");
        }
        */
        /*
        int[] universe = {5,23,5,8,23,8,1,2345,2,67,33,4,10};
        int[] sortUniverse = BubbleSort.sort(universe);
        BubbleSort.print(sortUniverse);
        */
        /*int[] universe = {5,23,5,8,23,8,1,2345,2,67,33,4,10};
        SelectionSort.sort(universe);
        System.out.println("---------");
        SelectionSort.print(universe);*/
        
        //int[] universe = {5,23,5,8,23,8,1,2345,2,67,33,4,10};
        /*
        int[] universe = {5,1,5,8,23,8,23};
        QuickSort.sort(universe, 0, universe.length - 1);
        QuickSort.print(universe);
        */
        /*
        int[] universe = {5,1,5,8,23,8,23};
        new MergeSort(universe);
        */
        /*
        Integer[] universe = {5,1,5,8,23,8,23};
        HeapSort.print(universe);
        HeapSort.sort(universe);
        HeapSort.print(universe);
        */
        /*
        BinaryTreeSearch bts = new BinaryTreeSearch();
        bts.addNode(bts.createNode(10), bts.getRoot());
        bts.addNode(bts.createNode(12), bts.getRoot());
        bts.addNode(bts.createNode(11), bts.getRoot());
        bts.addNode(bts.createNode(13), bts.getRoot());
        bts.addNode(bts.createNode(6), bts.getRoot());
        bts.addNode(bts.createNode(14), bts.getRoot());
        bts.addNode(bts.createNode(19), bts.getRoot());
        bts.addNode(bts.createNode(7), bts.getRoot());
        bts.addNode(bts.createNode(5), bts.getRoot());
        bts.addNode(bts.createNode(1), bts.getRoot());
        
        bts.search(6, bts.getRoot());
        int heigh = bts.getHeigh(bts.getRoot());
        System.out.println("Heigh: " + heigh);
        System.out.println("PRINT BY LEVEL");
        bts.getNodesByLevel(bts.getRoot());
        */
        
        /*
        DepthFirstSearch newGrap = new DepthFirstSearch(8);
        newGrap.add(0, 3);
        newGrap.add(0, 2);
        newGrap.add(0, 1);
        newGrap.add(1, 5);
        newGrap.add(1, 4);
        newGrap.add(2, 6);
        newGrap.add(3, 7);
        newGrap.explore(0);
        */
        /*
        BreadthFirstSearch newGrap = new BreadthFirstSearch(8);
        newGrap.addNode(0, 3);
        newGrap.addNode(0, 2);
        newGrap.addNode(0, 1);
        newGrap.addNode(1, 5);
        newGrap.addNode(1, 4);
        newGrap.addNode(2, 6);
        newGrap.addNode(3, 7);
        newGrap.breadthExplore(0);
        */
        /*
        BalancedBrackets testBrackets = new BalancedBrackets("{[{}]()[[()]]}");
        System.out.println("///");
        System.out.println("Is balanced: " + testBrackets.isBalanced());
        */
        /*
        ContactList contacts = new ContactList();
        contacts.add("hackerrank");
        contacts.add("hacker");
        contacts.add("hack");
        contacts.add("hacking");
        contacts.find("hack");
        contacts.find("hak");
        */
        
        Median testMedian = new Median();
        testMedian.add(12);
        System.out.println(testMedian.getMedian());
        testMedian.add(4);
        System.out.println(testMedian.getMedian());
        testMedian.add(5);
        System.out.println(testMedian.getMedian());
        testMedian.add(3);
        System.out.println(testMedian.getMedian());
        testMedian.add(8);
        System.out.println(testMedian.getMedian());
        testMedian.add(7);
        System.out.println(testMedian.getMedian());
    }
    
    public static void showQueue(){
        QueueLinkedList<String> currentQueu = new QueueLinkedList<>();
        currentQueu.push("1");
        currentQueu.push("2");
        currentQueu.push("3");
        currentQueu.push("4");
        currentQueu.push("5");
        System.out.println(currentQueu.pop());
        System.out.println(currentQueu.pop());
        System.out.println(currentQueu.pop());
        System.out.println(currentQueu.pop());
        System.out.println(currentQueu.pop());
        System.out.println(currentQueu.pop());
    }
    
    public static void showStack(){
        StackLinkedList<String> currentStack = new StackLinkedList<>();
        currentStack.push("1");
        currentStack.push("2");
        currentStack.push("3");
        currentStack.push("4");
        System.out.println(currentStack.pop());
        System.out.println(currentStack.pop());
        System.out.println(currentStack.pop());
        System.out.println(currentStack.pop());
        System.out.println(currentStack.pop());
    }
    
    public static void showHashTable(){
        HashTableVAC<String> newHashArray = new HashTableVAC<>(10);
        newHashArray.put(11, "Vladimir");
        newHashArray.put(1, "XXX");
        newHashArray.put(12, "Juan");
        newHashArray.put(13, "Pepito");
        newHashArray.put(14, "Beltran");
        System.out.println(newHashArray.getElement(12));
        System.out.println(newHashArray.getElement(13));
        System.out.println(newHashArray.getElement(11));
    }
    
    public static void showDoubleLinkedList(){
        LinkedListDVAC<String> currentList = new LinkedListDVAC<>();
        currentList.add("uno");
        currentList.add("dos");
        currentList.add("tres");
        currentList.add("cuatro");
        currentList.display();
        currentList.delete();
        currentList.display();
    }
    
    public static void showLinkedList(){
        LinkedListVAC<String> currentList = new LinkedListVAC<>();
        currentList.add("uno");
        currentList.add("dos");
        currentList.add("tres");
        currentList.add("cuatro");
        currentList.display();
        currentList.delete();
        currentList.display();
    }
    
    public static void showDynamicArray(){
        DynamicArrayVAC<Integer> currentArray = new DynamicArrayVAC();
        currentArray.put(11);
        System.out.println("Size: " + currentArray.getSize());
        currentArray.put(12);
        System.out.println("Size: " + currentArray.getSize());
        currentArray.put(13);
        System.out.println("Size: " + currentArray.getSize());
        currentArray.put(14);
        System.out.println("Size: " + currentArray.getSize());
        currentArray.put(15);
        System.out.println("Size: " + currentArray.getSize());
        currentArray.put(16);
        System.out.println("Size: " + currentArray.getSize());
        for(int k=0; k< currentArray.getSize(); k++){
            System.out.println("Element: " + currentArray.getElement(k));
        }
    }
    
}
