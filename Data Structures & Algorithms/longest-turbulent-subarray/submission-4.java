class Solution {
    public int maxTurbulenceSize(int[] a) {
        
        if (a.length <= 1)
            return a.length;

        int max = 0;
         int cur = 1;
        for (int i = 0; i < a.length; i++) {
            int isUp = 0;
            cur = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j - 1] == a[j] )
                    break;

                if (a[j - 1] > a[j] && (isUp == 1 || isUp == 0))
                    isUp = -1;
                else if (a[j - 1] < a[j] && (isUp == -1 || isUp == 0))
                    isUp = 1;
                else
                    break;

                cur++;
                max = Math.max(cur, max);
            }
        }
        max = Math.max(cur, max);

        return max;
    }
}