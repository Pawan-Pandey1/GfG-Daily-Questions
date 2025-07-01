class Solution {
    public int substrCount(String s, int k) {
        // code here
        int n=s.length();
        int[]freq=new int[26];
        
        int res=0;
        
        int i=0;
        int j=0;
        int distinct=0;
        
        while(j<n){
            char ch=s.charAt(j);
            
            if(freq[ch-'a']==0){
                distinct++;
            }
            freq[ch-'a']++;
            
            if(j-i+1>k){
                char leftMost=s.charAt(i);
                
                freq[leftMost-'a']--;
                if(freq[leftMost-'a']==0){
                    distinct--;
                }
                i++;
            }
            
            if(j-i+1==k){
                if(distinct==k-1){
                    res++;
                }
            }
            j++;
        }
        return res;
    }
}