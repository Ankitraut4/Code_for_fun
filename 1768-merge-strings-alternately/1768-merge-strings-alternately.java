class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mer_str = new StringBuilder(word1.length() + word2.length());
        int i=0, j=0;
        while(i < word1.length() && j < word2.length()){
            mer_str.append(word1.charAt(i++));
            mer_str.append(word2.charAt(j++));
        }

        while(i < word1.length()){
            mer_str.append(word1.charAt(i++));
        }
        while(j < word2.length()){
            mer_str.append(word2.charAt(j++));
        }
        
        return mer_str.toString();
    }
}