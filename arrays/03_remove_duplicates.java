class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int index = 0;
        int cnt = 1;
        for(int i = 1; i < n; i++) {
            if(nums[i] != prev) {
                cnt++;
                prev = nums[i];
                nums[++index] = prev;
            } else {
                continue;
            }

        }

        return cnt;
    }
}