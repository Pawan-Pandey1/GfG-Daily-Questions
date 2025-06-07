
class Solution {
    public int longestCommonSum(int[] a1, int[] a2) {
        // Code here
        int maxLen=0;
        int n=a1.length;
        
        int[]prefixSum1=new int[n];
        int[]prefixSum2=new int[n];
        
        prefixSum1[0]=a1[0];
        prefixSum2[0]=a2[0];
        
        for(int i=1;i<n;i++){
            prefixSum1[i]=prefixSum1[i-1]+a1[i];
            prefixSum2[i]=prefixSum2[i-1]+a2[i];
        }
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int diff=prefixSum1[i]-prefixSum2[i];
            
            if(diff==0){
                maxLen=i+1;
            }else if(map.containsKey(diff)){
                maxLen=Math.max(maxLen,i-map.get(diff));
            }else{
                map.put(diff,i);
            }
        }
        return maxLen;
    }
}