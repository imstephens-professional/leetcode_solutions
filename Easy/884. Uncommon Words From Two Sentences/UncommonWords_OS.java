// 4 ms - beats 31.26%
// 43.44 mb - beats 59.74%

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> ttlWords = new HashMap<>();
        ArrayList<String> uncommon = new ArrayList<>();
        String[] wordsOne = s1.split("\\s+");
        String[] wordsTwo = s2.split("\\s+");
        String[] wordsComb = new String[wordsOne.length + wordsTwo.length];
        int i=0;

        for(i=0; i < wordsOne.length; i++) {    // is it necessary to put them in a combined arr?
            wordsComb[i] = wordsOne[i];
        }
        for(int j = 0; j < wordsTwo.length; j++) {
            wordsComb[i] = wordsTwo[j];
            i++;
        }

        for(i=0; i < wordsComb.length; i++) { // add to hashmap
            if(ttlWords.containsKey(wordsComb[i])) {
                ttlWords.put(wordsComb[i], ttlWords.get(wordsComb[i]) + 1);
            } else {
                ttlWords.put(wordsComb[i], 1);
            }
        }

        for(i=0; i < wordsComb.length; i++) {
            if(ttlWords.containsKey(wordsComb[i])) {
                if(ttlWords.get(wordsComb[i]) == 1) {
                    uncommon.add(wordsComb[i]);
                }
            }
        }
        
        String[] array = uncommon.toArray(new String[0]); 

        return array;
    }
}
