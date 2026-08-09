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
// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {

//         Stack<Integer> stack = new Stack<>();

//         for (int n : asteroids) {

//             boolean remove = false;

//             while (!stack.isEmpty() && stack.peek() > 0 && n < 0) {

//                 if (stack.peek() < -n) {
//                     stack.pop();

//                 } else if (stack.peek() == -n) {
//                     stack.pop();
//                     remove = true;
//                     break;

//                 } else {
//                     remove = true;
//                     break;
//                 }
//             }

//             if (!remove) {
//                 stack.push(n);
//             }
//         }

//         int[] result = new int[stack.size()];

//         for (int i = 0; i < stack.size(); i++) {
//             result[i] = stack.get(i);
//         }

//         return result;
//     }
// }