// 0 ms - beats 100%
// 43.06 mb - beats 52.46%

class Solution {
    public int lengthOfLastWord(String s) {
        int counter = 0;
        s = s.stripTrailing();
        s = s.stripLeading();
        boolean singleFlag = false;

        for(int i=s.length()-1; i > 0; i--) {
            if(Character.isWhitespace(s.charAt(i))) {
                singleFlag = true;
                break;
            }
            counter++;
        }

        if(singleFlag == false) {
            return s.length();
        }
        
        return counter;
    }
}
