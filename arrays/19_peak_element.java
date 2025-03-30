class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        long maxi = Long.MIN_VALUE;
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = n-1; i >= 0; i--) {
            
            if(arr[i] >= maxi) {
                maxi = arr[i];
                
                res.add((int)(maxi));
            }
            
        }
        
        Collections.reverse(res);
        
        return res;
    }
}
