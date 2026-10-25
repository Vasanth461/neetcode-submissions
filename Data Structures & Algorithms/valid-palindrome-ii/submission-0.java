class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        char[] input = s.toCharArray();
        int right = input.length-1;
        while (left<right) {
            if(input[left] != input[right]){
               if(!checkPalindrome(left+1,right,input) && 
               !checkPalindrome(left,right-1,input)){
                return false;
               }
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean checkPalindrome(int left, int right, char[] s)  {
        while (left < right) {
            if (s[left] != s[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}