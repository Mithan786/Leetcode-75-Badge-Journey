#Q-1: Merge Strings Alternately?
  class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);
        String longerString = "";
        if(min == len1){
            longerString = word2;
        }       
        if (min == len2){
            longerString = word1;
        }
        char chars1[] = word1.toCharArray();
        char chars2[] = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<min; i++){
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }
        sb.append(longerString.substring(min));
        return sb.toString();
    }
}
