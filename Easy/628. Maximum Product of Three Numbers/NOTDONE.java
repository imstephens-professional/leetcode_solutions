class Solution {
    public int maximumProduct(int[] nums) {
        int product = 0;
        Arrays.sort(nums);  // replace sorting with greedy
        
        /*  Only works with positive nums
        int firMax = nums[nums.length-1];
        int secMax = nums[nums.length-2];
        int thiMax = nums[nums.length-3];

        int product = (firMax * secMax) * thiMax;
        */

        return product;
    }
}
