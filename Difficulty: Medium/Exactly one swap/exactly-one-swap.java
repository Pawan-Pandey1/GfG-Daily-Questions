class Solution {
    int countStrings(String s) {
        // code here
        int n=s.length();
        
        long count=(long)((n*(n-1))/2);
        
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        
        boolean flag=false;
        
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                flag=true;
                count-=((freq[i]*(freq[i]-1))/2);
            }
        }
        return flag? (int)count+1:(int)count;
    }
}