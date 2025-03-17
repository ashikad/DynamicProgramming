package KnapSack.KnapSack01.EqualSumPartition;


public class Tabulation {

    boolean[][] dp;


    public boolean findPartition(int[] arr){

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        if(sum%2 !=0)
            return false;

        boolean[][] dp = new boolean[arr.length+1][(sum/2)+1];

        return subsetSum(arr,arr.length,sum/2,dp);
    }

    private boolean subsetSum(int[] arr, int n, int sum, boolean[][] dp) {

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0) {
                    dp[i][j] = true;
                    continue;
                }
                else if(i==0) {
                    dp[i][j] = false;
                    continue;
                }

                else if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];

            }
        }
        return dp[n][sum];
    }


}
