// 18 ms - beats 48.74%
// 108.21 mb - beats 12.65%

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for(int i=0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }
}
