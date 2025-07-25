class Solution {
    public int myAtoi(String s) {
        // code here
        int n=s.length();
        long ans=0;
        int sign=1;
        
        int i=0;
        
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            int digit=s.charAt(i)-'0';
            ans=ans*10+digit;
            
            if(sign==1 && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1 && -ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        
        return (int)(sign*ans);
    }
}