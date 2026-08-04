class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flower=n;
        for(int i=0; i<flowerbed.length && flower>0; i++){
            if(flowerbed[i]==0){
                boolean left = (i==0) || flowerbed[i-1]==0;
                boolean right = i==(flowerbed.length-1) || flowerbed[i+1]==0;

                if(left && right){
                    flowerbed[i]=1;
                    flower--;
                }
            }
        }
        if(flower==0){
            return true;
        }
        return false;

    }
}