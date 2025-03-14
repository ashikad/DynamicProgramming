package KnapSack.KnapSack01;

public class Tabulation {
    int[][] dp;

    public Tabulation(int[][] dp){
        this.dp  = dp;
    }
    public int knapsack(int[] val, int[] wt, int n, int W){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;

                else{
                    if(wt[i-1]<=j)
                        dp[i][j]= Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);

                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }
}
