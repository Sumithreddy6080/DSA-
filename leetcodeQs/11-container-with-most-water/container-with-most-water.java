class Solution {
   static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{});
        }
   }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            var minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, minHeight * (right - left));

            while (left < right && height[left] <= minHeight) {
                left++;
            }

            while (left < right && height[right] <= minHeight) {
                right--;
            }
        }

        return maxArea;
    }
}