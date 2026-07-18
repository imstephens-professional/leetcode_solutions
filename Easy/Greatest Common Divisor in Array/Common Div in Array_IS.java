// 0 ms - beats 100%
// 45.13 mb - beats 41.46%

class Solution {
    public int findGCD(int[] nums) {
        // find the largest number
        // find the smallest number
        int arrMin = 1000;
        int arrMax = 0;
        for(int i=0; i < nums.length; i++) {
            if(arrMin > nums[i]) {
                arrMin = nums[i];
            }
            if(arrMax < nums[i]) {
                arrMax = nums[i];
            }
        }

        // keep dividing until you find 1 w/o a remainder
        int cmmDiv = arrMax;
        for(int j=arrMax; j > 0; j--) {
            if((arrMax%j==0) && (arrMin%j==0)) {
                cmmDiv = j;
                break;
            }
        }

        return cmmDiv; 
    }
}
