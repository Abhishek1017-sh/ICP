class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        return sol(m,n,0,0,dp);
    }
    static int sol(int m,int n,int cr,int cc,int[][] dp){
        if(cr>=m || cc>=n || cr<0 || cc<0 ) return 0;
        if(cr==m-1 && cc==n-1) return 1;
        if(dp[cr][cc]!=0) return dp[cr][cc];
        int r=sol(m,n,cr,cc+1,dp);
        int d=sol(m,n,cr+1,cc,dp);
        dp[cr][cc]=r+d;
        return r+d;
    }
}