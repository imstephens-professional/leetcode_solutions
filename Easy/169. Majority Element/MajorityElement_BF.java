// 1903 ms - beats 5.15%
// 55.18 mb - beats 70.89%
class Solution {
    public int majorityElement(int[] nums) {
        int temp = 0;
        int counter = 0;

        for(int i=0; i < nums.length; i++) {
            temp = nums[i];
            for(int j=0; j < nums.length; j++) {
                if(nums[j] == temp) {
                    counter++;
                }
            }

            if(counter > nums.length/2) {
                return temp;
            }

            counter = 0;
        }

        return temp;
    }
}
