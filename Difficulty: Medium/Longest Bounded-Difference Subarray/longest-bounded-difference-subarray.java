

class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        int n=arr.length;
        
        PriorityQueue<int[]>minpq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<int[]>maxpq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        
        int i=0;
        int j=0;
        int maxLength=0;
        int start=0;
        
        while(j<n){
            minpq.offer(new int[]{arr[j],j});
            maxpq.offer(new int[]{arr[j],j});
            
            while(maxpq.peek()[0]-minpq.peek()[0]>x){
                i=Math.min(maxpq.peek()[1],minpq.peek()[1])+1;
                
                while(!maxpq.isEmpty() && maxpq.peek()[1]<i){
                    maxpq.poll();
                }
                while(!minpq.isEmpty() && minpq.peek()[1]<i){
                    minpq.poll();
                }
            }
            if(j-i+1>maxLength){
                maxLength=j-i+1;
                start=i;
            }
            j++;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int k=start;k<start+maxLength;k++){
            ans.add(arr[k]);
        }
        return ans;
    }
}

