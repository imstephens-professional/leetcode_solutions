/* Author: Isabella Stephens
 * Created: 9 June 2026
 * Updated: 9 June 2026
 * Completed?: Yes
 *
 * Problem: Given an integer x, return true if x is a , and false otherwise.
 *
 * This is the NORMAL method. Runs at 104 ms (beats 5.99%) and has a memory of 45.93 MB (beats 52.58%).
 * Follow-Up: Could you solve it without converting the integer to a string? 
 */

class Solution {
    public boolean isPalindrome(int x) {
        String intIntoString = String.valueOf(x);
        char[] charHold = intIntoString.toCharArray();
        int startingPoint;                       // pointer that starts @ beginning
        int endPoint = intIntoString.length()-1; // pointer that starts @ end

        for(startingPoint = 0; startingPoint < intIntoString.length(); startingPoint++) {
            if(startingPoint==endPoint) {
                break;
            }
            
            if(charHold[startingPoint] != charHold[endPoint]) {
                return false;
            }

            endPoint--;
        }


        return true;
    }
}
