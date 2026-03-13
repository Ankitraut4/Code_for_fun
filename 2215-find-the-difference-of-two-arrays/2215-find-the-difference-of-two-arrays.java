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
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();

        for(int s : set1){
            if(!set2.contains(s)){
                list1.add(s);
            }
        }
        for(int s : set2){
            if(!set1.contains(s)){
                list2.add(s);
            }
        }
        return Arrays.asList(list1, list2);
    }
}