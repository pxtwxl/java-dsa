class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            
            maxi = maxi <= arr[i] ? arr[i] : maxi; 
        }
        return maxi;
    }
}
