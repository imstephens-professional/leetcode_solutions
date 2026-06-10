/* Author: Isabella Stephens
 * Created: 10 June 2026
 * Updated: 10 June 2026
 * Completed?: Yes
 *
 * Problem: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative 
 * order of the elements should be kept the same. Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements 
 * k. The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
 *
 * Runs at 1 ms (beats 77.08%) and has a memory of 46.78 MB (beats 41.20%). Pretty good answer!
 */

class Solution {
    int counter = 1;

    public int removeDuplicates(int[] nums) {
        int[] uniqueN = countingDuplicates(nums); // saving this array is a bit unnecessary
        return counter; //returns k
    }

    public int[] countingDuplicates(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return arr;
        }
        int indx = 1;

        for(int i=1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr[indx++] = arr[i];
                counter++;
            }
        }

        return arr;
    }
}
