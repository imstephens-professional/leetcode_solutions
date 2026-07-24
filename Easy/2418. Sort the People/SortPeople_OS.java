// 11ms - beats 42.13%
// 47.70 mb - beats 6.44%

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> pplGroup = new HashMap<>();
        int i=0; // used in the for loops

        // all height values are DISTINCT so a hashmap may be used
        for(i=0; i < names.length; i++) {
            pplGroup.put(heights[i], names[i]);
        }

        // sort heights in descending order in array
        Arrays.sort(heights);
        int[] temp = new int[heights.length];
        i--;
        for(int j=0; j < heights.length; j++) {
            temp[j] = heights[i];
            i--;
        }

        // for every height, get value from hashmap and add it to names
        for(i=0; i < names.length; i++) {
            String tempName = pplGroup.get(temp[i]);
            names[i] = tempName;
        }

        return names;
    }
}
