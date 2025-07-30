class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        int currSum=0;
        
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            
            if(currSum==k){
                ans++;
            }
            
            if(map.containsKey(currSum-k)){
                ans+=map.get(currSum-k);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return ans;
    }
}