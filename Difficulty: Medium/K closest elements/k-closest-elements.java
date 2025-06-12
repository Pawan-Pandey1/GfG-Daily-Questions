class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]==b[0]?Integer.compare(b[1],a[1]) : Integer.compare(a[0],b[0]));
        
        
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            
            if(arr[i]!=x){
                pq.add(new int [] {diff,arr[i]});
            }
        }
        
        
        
        int[]newArr=new int[k];
        for(int i=0;i<k;i++){
            newArr[i]=pq.poll()[1];
        }
        
        return newArr;
    }
}
