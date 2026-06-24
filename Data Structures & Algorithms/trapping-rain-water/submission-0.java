class Solution {
    public int trap(int[] height) {
        
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        maxLeft[0] = 0;
        maxRight[height.length - 1] = 0;
        int max = 0;
        for (int i = 1 ; i < height.length; i++) {
            max = Math.max(max, height[i - 1]);
            maxLeft[i] = max;
        }

        max = 0;
        for (int i = height.length - 2; i>=0; i--) {
            max = Math.max(max, height[ i + 1]);
            maxRight[i] = max;
        }

        int []traps = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            traps[i] = Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        int sum = 0;
        for (int i = 0; i < traps.length; i++) {
            sum += Math.max(traps[i], 0);
        }

        return sum;
    }
}
