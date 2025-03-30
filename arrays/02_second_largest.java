class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int maxi = Integer.MIN_VALUE;
        int sec_maxi = Integer.MIN_VALUE;
        
        int n = arr.length;
        
        if(n == 0 || n == 1)
            return -1;
            
        for(int i = 0; i < n; i++) {
            maxi = Math.max(maxi,arr[i]);
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < maxi && arr[i] != maxi)
                sec_maxi = Math.max(sec_maxi,arr[i]);
        }
        
        if(sec_maxi == maxi || sec_maxi == Integer.MIN_VALUE)
            return -1;
        
        return sec_maxi;
    }
}