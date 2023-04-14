/*
Given an array, find the first integer, which is unique in the array. Unique means the number
does not repeat and appears only once in the whole array.
 */

import java.util.ArrayList;

public class UniqueIntegers {
    public static void main(String[] args) {
        int [] arr = {9, 2, 3, 2, 6, 6};
        System.out.println(findFirstUnique(arr));
    }
    public static int findFirstUnique(int[] arr) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        ArrayList<Integer> repeatedList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (repeatedList.contains(arr[i])) {
            } else if (uniqueList.contains(arr[i])) {
                uniqueList.remove((Integer) arr[i]);
                repeatedList.add(arr[i]);
            } else {
                uniqueList.add(arr[i]);
            }
        }

        if (!uniqueList.isEmpty()) {
            return uniqueList.get(0);
        } else {
            return -1;
        }
    }

}
