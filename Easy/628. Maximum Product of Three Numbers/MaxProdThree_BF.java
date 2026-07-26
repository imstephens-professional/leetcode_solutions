//  16 ms - beats 37.76%
//  47.81 mb - beats 75.91%

class Solution {
    public int maximumProduct(int[] nums) {
        int productOne = 0;
        int productTwo = 0;
        Arrays.sort(nums);  // replace sorting with greedy
    
        int firMax = nums[nums.length-1];
        int secMax = nums[nums.length-2];
        int thiMax = nums[nums.length-3];

        int firMin = nums[0];
        int secMin = nums[1];
    
        productOne = (firMax * secMax) * thiMax;
        productTwo = (firMin * secMin) * firMax;

        if(productTwo > productOne) {
            return productTwo;
        }    

        return productOne;
    }
}
