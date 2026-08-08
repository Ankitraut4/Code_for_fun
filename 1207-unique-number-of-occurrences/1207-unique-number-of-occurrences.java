class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> val=new HashMap<Integer, Integer>();

        for(int a: arr){
            if(val.containsKey(a)){
                val.put(a, val.get(a)+1);
            }else{
                val.put(a, 1);
            }
        }
        Set<Integer> set1=new HashSet<Integer>(val.values());

        return val.size() == set1.size();
    }
}