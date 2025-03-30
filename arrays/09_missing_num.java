class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int ssum = 0;

        for(int i = 0; i <= n; i++) {
            ssum += i;
        }

        int insum = Arrays.stream(nums).sum();

        return ssum - insum;
    }
}