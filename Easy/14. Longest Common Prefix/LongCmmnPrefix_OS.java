// 1 ms - beats 62.65%
// 43.18 mb - beats 68.00%

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String firstStr = strs[0];
        
        for (int i = 0; i < firstStr.length(); i++) {
            char c = firstStr.charAt(i);
            
            for (int j = 1; j < strs.length; j++) {
                // If current string is too short OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // Return everything we have matched up to index i
                    return firstStr.substring(0, i);
                }
            }
        }
        
        return firstStr;
    }
}
