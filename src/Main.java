import com.mutunda.DataStructure.ArrayStructures;



public class Main {



    public static void main(String[] args) {
         ArrayStructures arrayStructures = new ArrayStructures();
         arrayStructures.generateRandomArray();
         arrayStructures.printArray();
         int value = arrayStructures.getValueByIndex(4);
         System.out.println( value );
         boolean contains = arrayStructures.containsValue(12);
         System.out.println(contains);
         arrayStructures.deleteAtindex(5);
         arrayStructures.printArray();
         arrayStructures.push(55);
         arrayStructures.printArray();

    }
}

