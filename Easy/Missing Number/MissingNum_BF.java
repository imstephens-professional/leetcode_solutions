class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;

        if(nums[nums.length-1] != nums.length) {
            return nums.length;
        }

        for(int j=0; j < nums.length; j++) {
            if(nums[j] != j) {
                i=j; 
                break;
            }
        }

        return i;
    }
}
