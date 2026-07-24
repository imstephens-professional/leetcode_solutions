// 1 ms - beats 70.02%
// 44.60 - beats 11.98%

class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;
        String singleSenior;
        String strSeniorAge;
        int intSeniorAge;

        for(int i=0; i < details.length; i++) {
            singleSenior = details[i];
            strSeniorAge = singleSenior.substring(11,13);
            intSeniorAge = Integer.parseInt(strSeniorAge);

            if(intSeniorAge > 60) {
                counter++;
            }
        }

        return counter;
    }
}
