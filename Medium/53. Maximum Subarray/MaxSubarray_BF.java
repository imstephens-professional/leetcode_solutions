// 1 ms - beats 99.93%
// 81.04 mb - beats 5.78%

// Desc: Given an integer array nums, find the with the largest sum, and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
        int maxPoint = nums[0];
        int currSum = nums[0];
        int larSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(currSum < 0) {
                currSum = 0;
            }

            currSum = currSum + nums[i];

            if(larSum < currSum) {
                larSum = currSum;
            }
        }

        return larSum;
    }
}
