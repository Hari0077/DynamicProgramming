class climbingstairs
{
   public int climbing(int n)
   {
       // create a dp array for n stairs
       int dp[] = new int[n+1];
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++)
       {
          dp[i] = dp[i-2] + dp[i-1];
       }
       
       return dp[n];
   }
 }
