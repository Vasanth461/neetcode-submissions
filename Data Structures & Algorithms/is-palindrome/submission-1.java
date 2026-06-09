class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length()-1;

        while(l<r){
            char right = s.charAt(r);
            char left = s.charAt(l);
            if(!Character.isLetterOrDigit(left))
                l++;
            else if(!Character.isLetterOrDigit(right))
                r--;
            else if(Character.toLowerCase(left) != Character.toLowerCase(right) )
                return false;
            else {
                r--;
                l++;
            }
               
            
        }
        return true;
    }
}
