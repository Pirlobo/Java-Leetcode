// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbingStairs {
    public int climbStairs(int n) {
        int oneStep = 1;
        int twoSteps = 2;
        if(n == 1) return n;
        if(n == 2) return n;
        for(int i = 3; i <= n; i++) {
            int tempt = twoSteps;
            twoSteps = oneStep + twoSteps;
            oneStep = tempt;
        }
        return twoSteps;
    }
}
