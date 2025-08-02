class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        HashMap<Integer,Integer>map=new HashMap<>();
        
        int longestSum=0;
        int currSum=0;
        
        for(int i=0;i<arr.length;i++){
            currSum+=(arr[i]>k)? 1 :-1;
            
            if(currSum>0){
                longestSum=i+1;
            }
            
            if(map.containsKey(currSum-1)){
                longestSum=Math.max(longestSum,i-map.get(currSum-1));
            }
            
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }
        }
        return longestSum;
    }
}