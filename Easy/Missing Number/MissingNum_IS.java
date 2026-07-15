class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;

        for (int j=0; j < nums.length; j++) {
            sum += nums[j]; // Add each number to the total
        }

        int i = ((nums.length*(nums.length+1))/2)-sum;

        return i;
    }
}
