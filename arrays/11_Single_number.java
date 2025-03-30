class Solution {
    public int singleNumber(int[] nums) {
        int xorr = 0;

        for(int it : nums)
            xorr ^= it;

        return xorr;
    }
}