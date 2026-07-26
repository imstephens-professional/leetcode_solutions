// 0 ms - beats 100.00%
// 43.47% - beats 43.03% 

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9) {            // num does not = 9
                digits[i] = digits[i] + 1;
                break;
            }

            if((digits[i] == 9) && (i != 0)) { // num = 9 and not last int
                digits[i] = 0;

            } else if((digits[i] == 9) && (i == 0)) {
                int[] tempArr = new int[digits.length + 1];
                for(int j=0; j < tempArr.length; j++) {
                    if(j == 0) {
                        tempArr[j] = 1;
                    } else {
                        tempArr[j] = 0;
                    }
                }
                return tempArr;
            }
        }

        return digits;
    }
}
