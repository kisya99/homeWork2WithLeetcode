package homeWork2WithLeetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 1;
        int cur;
        for(int i = 2; i <= n; i++){
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
