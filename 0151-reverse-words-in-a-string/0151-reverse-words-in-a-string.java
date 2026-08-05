class Solution {
    public String reverseWords(String s) {
        char[] arr= s.toCharArray();
        reverse(arr, 0, arr.length-1);
        int i=0;
        int n= arr.length;
        while(i<n){
            while(i<n && arr[i]==' '){
                i++;
            }
            int j=i;
            while(i<n && arr[i]!=' '){
                i++;
            }
            reverse(arr, j, i-1);

        }
        return removeSpace(arr);
        
    }

    public String removeSpace(char[] arr){
        int i=0;
        int j=0;
        int n=arr.length;
        while(i<n){
            while(i<n && arr[i]==' '){
                i++;
            }
            while(i<n && arr[i]!=' '){
                arr[j++]=arr[i++];
            }
            while(i<n && arr[i]==' '){
                i++;
            }
            if(i<n){
                arr[j++]=' ';
            }
        }
        return new String(arr,0, j);
    }
    public void reverse(char[] arr, int start, int end){
        while(end>start){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}