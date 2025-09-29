class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=n*m-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int midval=matrix[mid/n][mid%n];
            if(target==midval){
                return true;
            }
            else if(target>midval){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}