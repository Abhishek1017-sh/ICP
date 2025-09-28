class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            long pro=(long)mid*mid;
            if(pro==num){
                return true;
            }
            else if(pro>num){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}