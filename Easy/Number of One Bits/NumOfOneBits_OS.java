// 1 ms - beats 32.21%
// 42.77 mb - beats 11.92%

class Solution {
    public int hammingWeight(int n) {
        int setBit=0;

        String toBinary = Integer.toBinaryString(n);

        for(int i=0; i < toBinary.length(); i++) {
            if(toBinary.charAt(i) == '1') {
                setBit++;
            }
        }

        return setBit;
    }
}
