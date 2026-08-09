class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> map= new HashMap<>();

        for(int i=0; i<grid.length; i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0; j<grid.length; j++){
                row.add(grid[i][j]);
            }
            map.put(row, map.getOrDefault(row, 0)+1);
        }
        int count =0;
        for(int i=0; i<grid.length; i++){
            List<Integer> col=new ArrayList<>();
            for(int j=0; j<grid.length; j++){
                col.add(grid[j][i]);
            }
            count+= map.getOrDefault(col, 0);
        }
        return count;
    }
}