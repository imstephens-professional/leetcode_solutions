/* Author: Isabella Stephens
 * Created: 9 June 2026
 * Updated: 9 June 2026
 * Completed?: Yes
 *
 * Problem: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.
 *
 * This is the BRUTE FORCE method. Runs at 3 ms (beats 87.85%) and has a memory of 43.36 (40.08%). This is a pretty good solution, but there are other ways to save on
 * time and space.
 */

class Solution {
    public static boolean isValid(String s) {
        char[] charList = s.toCharArray();
        char getFromCharList;
        Stack<Character> leftBrack = new Stack<Character>();

        for(int i=0; i < charList.length; i++) {
            getFromCharList = charList[i];

            if(getFromCharList == '(' || getFromCharList == '[' || getFromCharList == '{') {
                leftBrack.push(getFromCharList);
            } else {
                if(leftBrack.isEmpty() == true) { //in case of errors
                    return false;
                }
                
                if(getFromCharList==')' && leftBrack.peek()=='(') {
                    leftBrack.pop(); 
                } else if(getFromCharList==']' && leftBrack.peek()=='[') {
                    leftBrack.pop();
                } else if((getFromCharList=='}' && leftBrack.peek()=='{')) {
                    leftBrack.pop();
                } else {
                	return false;
                }
            }
        }
        
        if(leftBrack.isEmpty() != true) {
            return false;
        }
        
        return true;
    }

}
