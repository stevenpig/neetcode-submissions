class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int left = 0;
        int count = 0;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i - left == k) {
                int avg = sum / k;
        //        System.out.println("set: " + s);
                System.out.println("left: " + left + " sum: " + sum + " avg: " + avg);
                if (avg >= threshold)
                    count++;


                sum -= arr[left];
                left++;

            }
            sum += arr[i];


        }

        int avg = sum / k;
    //    System.out.println("set: " + s);
        System.out.println("left: " + left + " avg: " + avg);
        if (avg >= threshold)
            count++;

        return count;
    }
}