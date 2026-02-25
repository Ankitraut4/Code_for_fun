class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max_Number = greNum(candies);
        
        for(int i=0; i<candies.length; i++){
            result.add(candies[i]+extraCandies >= max_Number);
        }
        return result;
    }
    private int greNum(int[] candies){
        return Arrays.stream(candies).max().orElse(0);
    }
}