/* Author: Isabella Stephens
 * Created: 10 June 2026
 * Updated: 10 June 2026
 * Completed?: Yes
 *
 * Problem: Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * This is the BRUTE FORCE method. Runs at 2ms (beats 15.29%) and has a memory of 43.36MB (beats 9.49%). This is a HORRIFICALLY BAD solution.
 */

class Solution {
    public int strStr(String haystack, String needle) {
        char[] hayStack = haystack.toCharArray();
        char[] neeDle = needle.toCharArray();
        int locatedIndx = 0;
        int cntCrrtChar = 0;
        int tempIndx;

        if(hayStack.length < neeDle.length) { // error case
            return -1;
        }

        // goes through hayStack array
        for(int i=0; i < hayStack.length; i++) {
            tempIndx = i;

            if(hayStack[i]==neeDle[0]) { 
                for(int j=0; j < neeDle.length; j++) {
                    if(tempIndx >= hayStack.length) { // error case
                        return -1;
                    }

                    if(hayStack[tempIndx]==neeDle[j]) {
                        cntCrrtChar++;
                    }
                    tempIndx++;
                }

                if(cntCrrtChar==neeDle.length) {
                    return locatedIndx;
                }
            }
            
            cntCrrtChar=0;
            locatedIndx++;
        }

        return -1;
    }
}
