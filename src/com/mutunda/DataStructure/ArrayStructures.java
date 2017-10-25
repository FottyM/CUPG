package com.mutunda.DataStructure;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {

        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10 + 10);
        }
    }

    public String linearSearch(int value){

        String indexes = new String("Values found at index: ");
        boolean hasIndex = false;

        for (int i = 0; i < arraySize ; i++) {
            if(theArray[i] == value ){
                hasIndex = true;
                indexes +=  " " + i ;
            }
        }

        if (hasIndex == false){
            indexes += "hmmm none";
        }

        return indexes;

    }

    public int getValueByIndex(int index) {
        if (index < arraySize) return theArray[index];
        return 0;
    }

    public void push(int value){
        if(arraySize < theArray.length ){
            theArray[arraySize] = value;
            arraySize ++;
        }
    }

    public void deleteAtindex(int index){
        if(index < arraySize){
            for (int i = index; i < arraySize -1  ; i++) {
                theArray[i] = theArray[i+1];
            }
            arraySize --;
        }
    }

    public boolean containsValue(int value) {
        for (int i = 0; i < arraySize; i++) {
            if (value == theArray[i]) return true;
        }
        return false;
    }

    public void printArray() {
        System.out.println("---------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(" | " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }


}
