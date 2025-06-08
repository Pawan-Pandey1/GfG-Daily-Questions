class Solution {
    private String addString(String s1, String s2){
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;

            if(i >= 0){
                sum += s1.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += s2.charAt(j) - '0';
                j--;
            }

            carry = sum / 10;
            sb.append(sum % 10);
        }

        return sb.reverse().toString();
    }
    
    private boolean checkSeq(String s,int start,int len1, int len2){
        String s1=s.substring(start,start+len1);
        String s2=s.substring(start+len1,start+len1+len2);
        String sum=addString(s1,s2);
        int sumLength=sum.length();
        
        if(start+len1+len2+sumLength>s.length()){
            return false;
        }
        
        if(sum.equals(s.substring(start+len1+len2,start+len1+len2+sumLength))){
            if(start+len1+len2+sumLength==s.length()){
                return true;
            }
            return checkSeq(s,start+len1,len2,sumLength);
        }
        return false;
    }
    public boolean isSumString(String s) {
        // code here
        int n=s.length();
        
        for(int len1=1;len1<n;len1++){
            for(int len2=1;len1+len2<n;len2++){
                if(checkSeq(s,0,len1,len2)){
                    return true;
                }
            }
        }
        return false;
    }
}