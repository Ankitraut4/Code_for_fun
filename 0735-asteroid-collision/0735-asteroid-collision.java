class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack=new Stack<>();

       for(int n : asteroids){
        boolean remove= false;

        while(!stack.isEmpty() && stack.peek()>0 && n < 0){
            if(stack.peek() < -n){
                stack.pop();
            }else if(stack.peek()== -n){
                stack.pop();
                remove=true;
                break;
            }else{
                remove=true;
                break;
            }
        }
        if(!remove){
            stack.push(n);
        }
       }
       int[] arr=new int[stack.size()];
       for(int i=stack.size()-1;i>=0;i--){
            arr[i]=stack.pop();
       }
       return arr;
    }
}