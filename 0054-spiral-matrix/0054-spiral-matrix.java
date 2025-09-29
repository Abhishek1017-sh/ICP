class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0,right=a[0].length-1,top=0,bottom=a.length-1;
        int total=0;
        int ele=a.length*a[0].length;
        while(total<ele){
            for(int i=left;i<=right && total<ele;i++){
                ans.add(a[top][i]);
                total++;
            }
            top++;
            for(int i=top;i<=bottom && total<ele;i++){
                ans.add(a[i][right]);
                total++;
            }
            right--;
            for(int i=right;i>=left && total<ele;i--){
                ans.add(a[bottom][i]);
                total++;
            }
            bottom--;
            for(int i=bottom;i>=top && total<ele;i--){
                ans.add(a[i][left]);
                total++;
            }
            left++;
        }
        return ans;
    }
}