class Solution {
    private List<Integer>generateRow(int row){
        List<Integer>ansRow=new ArrayList<>();
        ansRow.add(1);
        int ans=1;
        
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        return new ArrayList<>(generateRow(n));
    }
}