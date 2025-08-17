class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        int n=arr.length;
        
        Pair[]pairs=new Pair[n];
        for(int i=0;i<n;i++){
            pairs[i]=new Pair(Math.abs(arr[i]-x),arr[i]);
        }
        
        Arrays.sort(pairs,(a,b)->a.diff-b.diff);
        
        for(int i=0;i<n;i++){
            arr[i]=pairs[i].val;
        }
    }
    public class Pair{
        int diff;
        int val;
        
        Pair(int diff,int val){
            this.diff=diff;
            this.val=val;
        }
    }
}
