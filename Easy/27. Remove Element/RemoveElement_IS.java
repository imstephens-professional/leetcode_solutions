// 0 ms - beats 100.0%
// 43.39 mb - beats 79.72%

class Solution {
    public int removeElement(int[] nums, int val) {
        int pointCurr=0;

        // goes forward and puts vals != the value forward
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != val) {       
                nums[pointCurr] = nums[i];
                pointCurr++;
            }
        }

        return pointCurr;
    }
}
