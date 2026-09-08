// 1 ms - beats 83.65%
// 42.76 mb - beats 22.48%

// Desc: Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

class Solution {
    public int countCommas(int n) {
        if(n < 999) {
            return 0;
        }

        return n-999;
    }
}
