class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        int sum = 0;
        Map<Integer,Integer> smap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            sum = nums[i];

            int rem = target - sum;

            if(smap.containsKey(rem)) {
                res[0] = i;
                res[1] = smap.get(rem);
                break;
            }

            if(!smap.containsKey(sum))
                smap.put(sum,i);
        }

        return res;
    }
}