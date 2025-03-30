class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int n = nums.length;
        int max_len = 0;

        for(i = 0; i < n; i++) {
            if(nums[i] == 1) {
                break;
            }
        }

        for(int j = i; j < n; j++) {

            if(nums[j] == 1) {
                max_len = Math.max(max_len,j-i+1);
            } else {
                i = j+1;
            }
        }

        return max_len;
    }
}