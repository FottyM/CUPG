import com.mutunda.DataStructure.ArrayStructures;



public class Main {

    public static void main(String[] args) {
         ArrayStructures arrayStructures = new ArrayStructures();
         arrayStructures.generateRandomArray();
         arrayStructures.printArray();
         String  sout  = arrayStructures.linearSearch(17);
         System.out.println(sout);


    }
}

