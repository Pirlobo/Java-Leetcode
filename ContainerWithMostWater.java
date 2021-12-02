public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0 ; i < height.length - 1; i++) {
            int currentHeight = height[i];
            for (int j = i + 1 ; j < height.length; j++) {
                 int next = height[j];
                 int area = (j-i) * Math.min(currentHeight, next);
                 maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    } 
}
