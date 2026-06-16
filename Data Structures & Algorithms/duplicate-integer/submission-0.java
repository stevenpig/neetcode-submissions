class Solution {
    public boolean hasDuplicate(int[] nums) {

        long l = Arrays.stream(nums) // Converts int[] to IntStream
                .boxed().distinct().count();
        System.out.println(l);
        return nums.length != l;
        
    }
}