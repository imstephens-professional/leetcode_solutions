// 26 ms - beats only 8.26%
// 81.48 MB - beats 80.21%

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean dupFound = false;
        int oneAhead = 0;

        for(int j=0; j < nums.length; j++) {
            if((j+1) > (nums.length-1)) {
                break;
            }
            oneAhead=nums[j+1];
            if(oneAhead == nums[j]) {
                dupFound = true;
                break;
            }
        }

        return dupFound;
    }
}
