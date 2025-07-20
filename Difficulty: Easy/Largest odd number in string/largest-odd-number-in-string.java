class Solution {

    String maxOdd(String s) {
        // code here
       int n=s.length();
       int i=n-1;
       
       while(i>=0){
           int curDigit=s.charAt(i)-'0';
           if(curDigit%2!=0){
               return s.substring(0,i+1);
           }else{
               i--;
           }
       }
       return "";
    }
}