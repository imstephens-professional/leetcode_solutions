// 126 ms - beats 6.89%
// 47.68 mb - beats 10.80%

class Solution {
    public boolean isPalindrome(String s) {
        String cleanedUp = "";
        char tempRev;
        char tempFir;

        s = s.toLowerCase();

        // deletes anything not alphanumerical
        for(int j=0; j < s.length(); j++) {
            if(Character.isLetterOrDigit(s.charAt(j))) {
                cleanedUp += s.charAt(j);
            }
        }

        if(cleanedUp.length() < 1) {
            return true;
        }

        int countDown = cleanedUp.length()-1;
        for(int i=0; i < cleanedUp.length(); i++) {
            tempRev = cleanedUp.charAt(countDown);
            tempFir = cleanedUp.charAt(i);
            if(tempFir != tempRev) {
                return false;
            }
            countDown = countDown-1;
        }

        return true;
    }
}
