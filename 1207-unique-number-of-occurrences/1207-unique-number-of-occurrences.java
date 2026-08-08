class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> val=new HashMap<Integer, Integer>();

        for(int a: arr){
            val.put(a, val.getOrDefault(a,0)+1);
        }
        Set<Integer> set1=new HashSet<Integer>(val.values());

        return val.size() == set1.size();
    }
}