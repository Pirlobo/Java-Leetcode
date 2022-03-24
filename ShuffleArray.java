import java.util.Random;

public class ShuffleArray {
    private int[] nums;
    private Random rand;
    
    public ShuffleArray(int[] nums) {
        this.nums = nums;
        this.rand = new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] randomNums = new int[nums.length];
        
        for(int i = 0 ; i < nums.length; i++) {
            randomNums[i] = nums[i];
        }
        
        for(int i = 0 ; i < randomNums.length; i++) {
            int randIdx = i + rand.nextInt(nums.length - i);
            int tempt = randomNums[i];
            randomNums[i] = randomNums[randIdx];
            randomNums[randIdx] = tempt;
        }
        
        return randomNums;
    }
}
