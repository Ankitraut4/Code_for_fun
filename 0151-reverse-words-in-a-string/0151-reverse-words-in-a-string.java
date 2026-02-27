class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        reverse(arr, 0, arr.length-1);
        int i=0;
        while(i<arr.length){
            while(i<arr.length && arr[i]==' '){
                i++;
            }
            int j=i;
            while(j<arr.length && arr[j]!=' '){
                j++;
            }
            reverse(arr, i, j-1);
            i=j;
            
        }

        
    return spaceRemove(arr);
    }
    private void reverse(char[] arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    private String spaceRemove(char[] arr){
        int i =0; 
        int j=0;
        int n=arr.length;
        while(j<n){
            while(j< n && arr[j]==' '){
                j++;
            }
            while(j<n && arr[j]!=' '){
                arr[i++]=arr[j++];
            }
            while(j<n && arr[j]==' '){
                j++;
            }
            if(j<n){
                arr[i++]=' ';
            }
            
        }
        return new String(arr,0,i);
    }
   
}