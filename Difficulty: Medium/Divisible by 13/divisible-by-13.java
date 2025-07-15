class Solution {
    public boolean divby13(String s) {
        // code here
        int rem=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int digit=ch-'0';
            rem=(rem*10 + digit)%13;
        }
        
        return rem==0;
    }
}