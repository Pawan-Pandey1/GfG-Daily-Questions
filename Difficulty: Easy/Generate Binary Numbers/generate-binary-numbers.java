class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=1; i<=n;i++){
            ans.add(convertToBinary(i));
        }
        return ans;
    }
    public String convertToBinary(int n){
        
        StringBuilder st = new StringBuilder();
        if(n==1)return st.append("1").toString();
        else{
          while( n!=1){
              int ch = n%2;
              n=n/2;
              st.append(ch);
          }   
          st.append("1");
        }
        return st.reverse().toString();
    }
}