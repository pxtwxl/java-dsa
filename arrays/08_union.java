class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        HashSet<Integer> s = new HashSet<Integer>();
        
        for(int i : a)
            s.add(i);
            
        for(int i : b)
            s.add(i);
            
        for(Integer it : s)
            res.add(it);
        
        Collections.sort(res);
        
        return res;
    }
}
