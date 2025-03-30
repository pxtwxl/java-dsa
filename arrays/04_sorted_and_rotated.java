class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        int[] check_sorted = new int[n];

        for(int rotate_coeff = 0; rotate_coeff < n; rotate_coeff++) {
            int curr_i = 0;

            for(int index = rotate_coeff; index < n; index++) {
                check_sorted[curr_i++] = nums[index];
            }
            for(int index = 0; index < rotate_coeff; index++) {
                check_sorted[curr_i++] = nums[index];
            }

            boolean issorted = true;

            for(int i = 0; i < n-1; i++) {
                if(check_sorted[i] > check_sorted[i+1]){
                    issorted = false;
                    break;
                }
            }

            if(issorted)
                return true;
        }

        return false;
    }
}