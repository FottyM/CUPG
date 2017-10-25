package com.mutunda.DataStructure;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray(){

        for (int i = 0; i < arraySize ; i++) {
            theArray[i] = (int)(Math.random()*10 + 10);
        }
    }

    public int getValueByIndex(int index){
        if (index < arraySize) return theArray[index];
        return 0;
    }




    public boolean containsValue(int value){
        for (int i = 0; i < arraySize ; i++) {
            if (value == theArray[i]) return true;
        }
        return false;
    }

    public void printArray(){
        System.out.println("---------");
        for (int i = 0; i < arraySize ; i++) {
            System.out.print(" | " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }


}
