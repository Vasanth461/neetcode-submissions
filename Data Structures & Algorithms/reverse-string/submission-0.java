class Solution {
    public void reverseString(char[] s) {
        char temp;
        int first = 0;
        int last = s.length-1;
        while(first<last){
            temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }       
    }
}