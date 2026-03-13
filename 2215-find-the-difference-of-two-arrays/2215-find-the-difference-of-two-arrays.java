class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();

        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }

        Set<Integer> s1= new HashSet<Integer>(set1);
        Set<Integer> s2=new HashSet<Integer>(set2);
        
        s1.removeAll(set2);
        s2.removeAll(set1);

        return Arrays.asList(new ArrayList(s1), new ArrayList(s2));
    }
}