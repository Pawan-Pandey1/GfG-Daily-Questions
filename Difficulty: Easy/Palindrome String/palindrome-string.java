class Solution {
    boolean isPalindrome(String s) {
        // code here
        int n=s.length();
        
        int start=0;
        int end=n-1;
        
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}