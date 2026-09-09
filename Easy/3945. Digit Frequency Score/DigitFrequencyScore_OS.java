// 1 ms - beats 98.36%
// 42.59 mb - beats 69.20%

// Desc: The score of n is defined as the sum of d * freq(d) over all distinct digits d, where freq(d) denotes the number of times the digit d appears in n. Return an integer denoting the score of n.

class Solution {
    public int digitFrequencyScore(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        char tempChar;
        int tempNum;
        
        for(int i=0; i < num.length(); i++) {
            tempChar = num.charAt(i);
            tempNum = Character.getNumericValue(tempChar);
            sum = sum + tempNum;
        }

        return sum;
    }
}
