/*Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.*/

class Solution {
    public int maxArea(int[] height) {
        int maximumArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int shorterLine = Math.min(height[left], height[right]);
            maximumArea = Math.max(maximumArea, shorterLine * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }
        
}
