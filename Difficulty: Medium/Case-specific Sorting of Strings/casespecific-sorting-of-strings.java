class Solution {
    public static String caseSort(String s) {
        // code here
        int[]freqU=new int[26];
        int[]freqL=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                freqL[ch-'a']++;
            }else{
                freqU[ch-'A']++;
            }
        }

        StringBuilder result=new StringBuilder();
        int i=0;
        int j=0;
        
        for(int k=0;k<s.length();k++){
            char ch=s.charAt(k);
            
            if(ch>='a' && ch<='z'){
                while(freqL[i]==0){
                    i++;
                }
                result.append((char)(i+'a'));
                freqL[i]--;
            }else{
                while(freqU[j]==0){
                    j++;
                }
                result.append((char)(j+'A'));
                freqU[j]--;
            }
        }
        return result.toString();
    }
}