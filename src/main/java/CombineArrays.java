import java.util.*;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] combinedList = new int[arr1.length + arr2.length];
        int counter = arr1.length - 1;
        
        for (int index = 0; index < arr1.length; index++) {
            combinedList[index] = arr1[index];
        }

        for (int idx = 0; idx < arr2.length; idx++) {
            counter++;
            combinedList[counter] = arr2[idx];
        }

        return combinedList;
    }
}
