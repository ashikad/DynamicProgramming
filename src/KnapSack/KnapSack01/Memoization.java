package KnapSack.KnapSack01;

public class Memoization {

    int[][] dp;

    public Memoization(int[][] dp){
        this.dp = dp;
    }


    public int knapsack(int[] val,int[] wt, int n, int W){

        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1]<=W){
            return dp[n][W]= Math.max(val[n-1]+knapsack(val,wt,n-1,W-wt[n-1]),
                    knapsack(val,wt,n-1,W));
        }else{
            return dp[n][W] = knapsack(val,wt,n-1,W);
        }


    }
}
