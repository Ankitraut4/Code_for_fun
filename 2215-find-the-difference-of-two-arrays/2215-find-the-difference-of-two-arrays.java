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
        List<Integer> list1=new ArrayList<Integer>(nums1.length);
        List<Integer> list2=new ArrayList<Integer>(nums2.length);

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
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}