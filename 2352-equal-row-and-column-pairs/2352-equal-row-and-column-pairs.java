class Solution {
    public int equalPairs(int[][] grid) {
      Map<String, Integer> map=new HashMap<>();

      for(int[] row : grid){
        StringBuilder sb=new StringBuilder();
        for(int r: row){
            sb.append(r).append(",");

        }
        String ro = sb.toString();
        map.put(ro, map.getOrDefault(ro, 0)+1);

      }
        int count =0;
        for(int i=0; i<grid.length; i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0; j<grid[i].length; j++){
                sb.append(grid[j][i]).append(",");
            }
            String col=sb.toString();
            if(map.containsKey(col)){
                count += map.get(col);
            }

        }
        return count;


    }
}