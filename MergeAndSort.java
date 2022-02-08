/** Author - Renju
    To merge 2 integer arrays nd sort

*/

import java.util.*;
import java.util.stream.*;

public class MergeAndSort {
    public static void main(String args[]) {
        int[] arr1 = new int[] {1,3,5,7,8};
        int[] arr2 = new int[] {2,4,6,9,10};
        int[] arr3 = new MergeAndSort().merge(arr1,arr2);
        Arrays.stream(arr3).forEach(System.out::println);
    }
    int[] merge(int []arr1, int []arr2) {
        int[] arr3= new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        return arr3;
    }
}