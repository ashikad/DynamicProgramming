import KnapSack.KnapSack01.Memoization;
import KnapSack.KnapSack01.Tabulation;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n=4;
        int W = 7;
        int[] val = {1,4,5,7};
        int[] wt = {1,3,4,5};

        int[][] dp = new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j] = -1;
            }
        }

       // Memoization memoization = new Memoization(dp);

        Tabulation tabulation = new Tabulation(dp);

        int ans = tabulation.knapsack(val,wt,n,W);
        System.out.println(ans);
    }
}