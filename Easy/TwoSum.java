/* Author: Isabella Stephens
 * Created: 7 June 2026
 * Updated: 7 June 2026
 * Completed?: Yes
 *
 * Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each  
 * input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
 *
 * This is the BRUTE FORCE method. 
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArray = new int[2]; 
        boolean flag = false;
        int firstNum;
        int secondNum;
        
        for (int i = 0; i < nums.length; i++) {
			returnArray[0] = nums[i]; // set the first num as the num
			firstNum = returnArray[0];

			for (int j = 0; j < nums.length; j++) {
				returnArray[1] = nums[j];
				secondNum = returnArray[1];

				if (((firstNum + secondNum) == target) && (i != j)) {
					System.out.println(i + " + " + j + " = " + target);
					returnArray[0] = i;
					returnArray[1] = j;
					flag = true;
					break;
				}

			}
			if(flag==true) {
				break;
			}
        
        }
        return returnArray;
    }
}
