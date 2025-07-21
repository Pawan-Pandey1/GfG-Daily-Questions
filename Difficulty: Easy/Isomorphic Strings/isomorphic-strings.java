class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int n=s1.length();
        
        int [] freq1=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        
        int [] freq2=new int[26];
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }
        
        for(int i=0;i<n;i++){
            if(freq1[s1.charAt(i)-'a']!=freq2[s2.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}