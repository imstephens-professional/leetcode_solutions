//  13 ms - beats 20.39%
//  47.36 mb - beats 6.84%

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                seen.remove(num);
            } else {
                seen.add(num);
            }
        }
        return seen.iterator().next();
    }
}

