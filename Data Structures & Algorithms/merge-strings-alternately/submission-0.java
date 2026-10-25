class Solution {
    public String mergeAlternately(String word1, String word2) {
        int k = 0;
        int i = 0;
        int j = 0;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        char[] result = new char[w1.length + w2.length];
        while(i< w1.length && j < w2.length){
            result[k++] = w1[i++];
            result[k++] = w2[j++];
        }

        while(i<w1.length){
            result[k++] = w1[i++];
        }

         while(i<w2.length){
            result[k++] = w2[i++];
        }
        return new String(result);
    }
}