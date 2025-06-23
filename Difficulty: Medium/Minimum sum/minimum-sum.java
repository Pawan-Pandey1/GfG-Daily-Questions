class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            if(i%2==1){
                s1.append(arr[i]);
            }else{
                s2.append(arr[i]);
            }
        }
        return addStrings(s1.toString(),s2.toString());
    }
    
    private String addStrings(String num1,String num2){
        StringBuilder sum=new StringBuilder();
        
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        
        while(i>=0 || j>=0 || carry!=0){
            int digit1=0;
            int digit2=0;
            
            if(i>=0){
                digit1=num1.charAt(i)-'0';
                i--;
            }
            
            if(j>=0){
                digit2=num2.charAt(j)-'0';
                j--;
            }
            
            int digitsum=digit1+digit2+carry;
            sum.append(digitsum%10);
            carry=digitsum/10;
        }
        String result= sum.reverse().toString();
        int idx=0;
        while(i<result.length()-1 && result.charAt(idx)=='0'){
            idx++;
        }
        return result.substring(idx);
    }
}
