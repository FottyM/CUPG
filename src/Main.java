import com.mutunda.DataStructure.ArrayStructures;
import com.mutunda.solutions.Solutuion;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
         ArrayStructures arrayStructures = new ArrayStructures();
         arrayStructures.generateRandomArray();
         arrayStructures.printArray();
         int value = arrayStructures.getValueByIndex(4);
         System.out.println( value );
         boolean contains = arrayStructures.containsValue(12);
        System.out.println(contains);

    }
}

