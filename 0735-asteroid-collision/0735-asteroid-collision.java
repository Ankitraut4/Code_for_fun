class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] arr=new int[asteroids.length];
        int top = -1;
        for(int a : asteroids){
            boolean remove = false;
            while(top>=0 && arr[top]>0 && a<0){
                if(arr[top]< -a){
                    top--;
                }else if(arr[top]==-a){
                    top--;
                    remove = true;
                    break;
                }else{
                    remove = true;
                    break;
                }

            }
        
        if(!remove){
            arr[++top]=a;
        }
        }
        return Arrays.copyOf(arr, top+1);
    }
}