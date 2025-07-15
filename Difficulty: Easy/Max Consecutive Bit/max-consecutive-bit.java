class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count0=0;
        int count1=0;
        
        int maxCount0=-1;
        int maxCount1=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count1++;
                maxCount1=Math.max(count1,maxCount1);
                count0=0;
            }else{
                count0++;
                maxCount0=Math.max(count0,maxCount0);
                count1=0;
                
            }
        }
        return Math.max(maxCount1,maxCount0);
    }
}
