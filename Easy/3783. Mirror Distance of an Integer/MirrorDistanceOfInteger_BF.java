// 6 ms - beats 2.32%
// 43.12 mb - beats 9.91%

// Desc: You are given an integer n. Define its mirror distance as: abs(n - reverse(n))​​​​​​​ where reverse(n) is the integer formed by reversing the digits of n. Return an integer denoting the mirror distance of n​​​​​​​. abs(x) denotes the absolute value of x.

class Solution {
    public int mirrorDistance(int n) {
        String num = Integer.toString(n);
        String revNum = "";

        for(int i = num.length() - 1; i >= 0; i--) {
            revNum = revNum + num.charAt(i);
        }

        int reverse = Integer.parseInt(revNum);

        return Math.abs(reverse-n);
    }
}
