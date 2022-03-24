public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int a = 0;
        int b = height.length - 1;
        while (a<b) {
            if(height[a] > height[b]){
                maxArea = Math.max(maxArea, (b - a) * (height[b]));
                b--;
            }else{
                maxArea = Math.max(maxArea, (b - a) * (height[a]));
                a++;
            }
        }
        return maxArea;
    } 
}
