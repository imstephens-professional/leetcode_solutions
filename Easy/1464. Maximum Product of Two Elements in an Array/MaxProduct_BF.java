//  5 ms - beats 42.28%
//  44.86 mb - beats 29.67%

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums[nums.length-1];
        int j = nums[nums.length-2];

        return (j-1)*(i-1);
    }
}
