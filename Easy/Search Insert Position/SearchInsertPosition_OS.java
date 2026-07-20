// 0 ms - beats 100%
// 44.88 mb - beats 29.04%

class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftPoint = 0;
        int rightPoint = nums.length-1;
        int middle=0;

        while(leftPoint <= rightPoint) {
            middle = leftPoint + rightPoint;
            if(nums[middle] < target) {
                leftPoint = middle + 1;
            } else if(nums[middle] > target) {
                rightPoint = middle - 1;
            } else {
                return middle;
            }
        }

        return leftPoint;
    }
}
