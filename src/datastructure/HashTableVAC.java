/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Vladimir Aca
 */
public class HashTableVAC<T> {
    int size;
    NodeHash[] arrayHash;

    public HashTableVAC(int size) {
        this.size = size;
        this.arrayHash = new NodeHash[size];
        for(int k=0; k<size; k++){
            this.arrayHash[k] = new NodeHash();
        }
    }
    
    public Integer getHash(int key){
        int hashKey = key%this.size;
        return hashKey;
    }
    
    public void put(int key, Object value){
        NodeHash newNode = new NodeHash(null, value, key);
        int hashNodeKey = this.getHash(key);
        NodeHash currentHashList = this.arrayHash[hashNodeKey];
        newNode.next = currentHashList.next;
        currentHashList.next = newNode;
        /*if(currentHashList == null){
            currentHashList = newNode;
        }else{
            newNode.next = currentHashList;
            currentHashList = newNode;
        }*/
        //this.arrayHash[hashNodeKey] = currentHashList;
    }
    
    public T getElement(Integer key){
        int hashKey = this.getHash(key);
        T currentValue = null;
        NodeHash currentHashList = this.arrayHash[hashKey];
        NodeHash currentNodeHash = currentHashList;
        while(currentNodeHash != null){
            if(currentNodeHash.getKey() == key){
                return (T) currentNodeHash.getValue();
            }
            currentNodeHash = currentNodeHash.next;
        }
        
        return currentValue;
    }
    
}
