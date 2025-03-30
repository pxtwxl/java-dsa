class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int max_len = 0; 
        Map<Integer,Integer> smap = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            
            sum += arr[i];
            
            if(sum == k) {
                max_len = Math.max(max_len,i+1);
            }
            
            int re = sum - k;
            
            if(smap.containsKey(re)) {
                int len = i - smap.get(re);
                max_len = Math.max(max_len , len);
            }
            
            if(!smap.containsKey(sum)) {
                smap.put(sum,i);
            }
        }
        
        return max_len;
    }
}