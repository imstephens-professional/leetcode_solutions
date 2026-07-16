// 135 ms - beats 5.21%
// 48.62 mb - beats 5.13%

class Solution {
    public boolean isPalindrome(String s) {
        String cleanedUp = "";
        int asciiChar;
        char tempRev;
        char tempFir;

        s = s.toLowerCase();

        // deletes whitespaces, ints, punctuation
        for(int j=0; j < s.length(); j++) {
            asciiChar = s.charAt(j);
            
            if((asciiChar >= 48) && (asciiChar <= 57)) {
                cleanedUp += s.charAt(j);
            }
            if((asciiChar >= 97) && (asciiChar <= 122)) {
                cleanedUp += s.charAt(j);
            }
        }

        if(cleanedUp.length() < 1) {
            return true;
        }

        Stack<Character> holderOfBeans = new Stack();
        for(int i=0; i < cleanedUp.length(); i++) {
            holderOfBeans.push(cleanedUp.charAt(i));
        }

        for(int z=0; z < cleanedUp.length(); z++) {
            tempRev = holderOfBeans.pop();
            tempFir = cleanedUp.charAt(z);
            if(tempFir != tempRev) {
                return false;
            }
        }

        return true;
    }
}
